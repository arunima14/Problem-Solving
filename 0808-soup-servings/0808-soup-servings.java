class Solution {
    public double soupServings(int n) {
        if(n >= 5000){
            return 1.0;
        }

        double dp[][] = new double[n+1][n+1];

        for(double row[] : dp ){

            Arrays.fill(row , -1.0);
        }


        return find(n , n , dp);

    }

    public double find(int a, int b, double dp[][]){

       if(a <= 0 && b <= 0){
           return 0.5;
       } 
       if(a <= 0){
           return 1.0;
       }
        if(b <= 0){
            return 0.0;
        }


     if(dp[a][b] != -1.0){
         return dp[a][b];
     }   
    double res = 0.25*(find(a-100 , b, dp)+find(a-75 ,b-25,dp)+find(a-50,b-50,dp)+ find(a-25 , b-75 ,dp));

        dp[a][b] = res;
        return res;
    }
}