class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int ans1 = 0;
        int ans2 = 0;
        int dp[][] = new int[s1.length()][s2.length()];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }

        for(int i = 0; i < s1.length(); i++){

            ans1 = ans1 + (int)(s1.charAt(i));

        }

         for(int i = 0; i < s2.length(); i++){

            ans2 = ans2 + (int)(s2.charAt(i));

        }




       int ans =  findmin(s1 , s2 , s1.length()-1, s2.length()-1 , dp);


       return ans1+ans2-(2*ans); 


    }


    public int findmin(String s1 , String s2 ,int i , int j , int dp[][] ){


        if(i < 0 || j < 0){
            return 0;
        }

        if(dp[i][j]!= -1){
            return dp[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){

            return dp[i][j] =   (int)(s1.charAt(i)) + findmin(s1 , s2 , i-1 , j-1 , dp);
        }else{


            return dp[i][j] =  Math.max(findmin(s1 , s2 , i-1 , j , dp) , findmin(s1 ,s2 , i , j-1 , dp) );
        }




    }
        
}