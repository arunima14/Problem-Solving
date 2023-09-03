class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>r){
                r=piles[i];
            }
        }
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(isValid(piles,h,m)){
                System.out.println(m);
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] piles,int h,int m){
        if(m==0){
            return false;
        }
        int c=0;
        int i=0;
        while(i<piles.length){
            int k=piles[i]/m;
            if(piles[i]%m!=0){
                k++;
            }
            c=c+k;
            i++;
        }
        if(c>h){
            return false;
        }
        return true;

    }
}