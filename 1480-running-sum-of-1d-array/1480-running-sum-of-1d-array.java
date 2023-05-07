class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int currSum = 0;
            for(int j=0; j<=i; j++)
                currSum += nums[j];
            
            sum[i] = currSum;
        }
        
        return sum;
    }
}