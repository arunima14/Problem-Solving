class Solution {
    static int mod= 1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int ans=0;
        int dp[]= new int [high+1];
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        for(int i=low;i<=high;i++){
            ans= (ans+helper(i,zero,one,dp))%mod;
        }
        return ans;
    }
    
    static int sum=0;
    int helper(int l,int z,int o,int dp[]){
        if(l==0) return 1;
        if(l<0) return 0;
        if(dp[l]!=-1) return dp[l];
        dp[l]=sum=(helper(l-z,z,o,dp)+helper(l-o,z,o,dp))%mod;
        return sum;
    }
}