class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        
        Arrays.fill(dp,-1) ;
        return helper (nums , len-1, dp) ;
    }
    
    public int helper (int[] nums , int i, int[] dp){
        if(i<0){
            return 0 ;
        }
        if (dp[i]!=-1){
            return dp[i] ;
        }
        int a = helper(nums,i-2, dp) ;
        int b = helper(nums,i-1, dp) ;
          int ans = Math.max(a+nums[i] , b) ;
          dp[i] = ans ;
          return ans ;
    }
}