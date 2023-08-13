class Solution {
    static boolean isValid(int i,boolean[] dp,int[] nums){
        if(i<0) 
            return true;
        if(dp[i]!=false) 
            return dp[i];
        
        boolean result=false;
        for(int j=i;j>=0;j--){
            if((i-j+1==2) && nums[i]==nums[j]){
                result = result|isValid(j-1,dp,nums);
            }
            if(i-j+1==3 && (nums[j]==nums[j+1] && nums[j+1]==nums[j+2])){
                result = result|isValid(j-1,dp,nums);
            }
            if(i-j+1==3 && (nums[i]-nums[i-1]==1 && nums[i-1]-nums[i-2]==1)){
                result = result|isValid(j-1,dp,nums);
            }
            if(result){
                dp[i]=true;
                return true;
            }
        }
        return false;

    }

    public boolean validPartition(int[] nums) {
         int n=nums.length;
         boolean[] dp = new boolean[n];
         Arrays.fill(dp,false);
        return isValid(n-1,dp,nums);
    }
}