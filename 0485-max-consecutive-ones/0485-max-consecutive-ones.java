class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                maxCount = (int)Math.max(maxCount, count);
                count = 0;
            }
            else
                count++;
        }
        
        
        return (int)Math.max(maxCount, count);
    }
}