class Solution {
    public int longestSubarray(int[] nums) {
        int leftCount = 0, rightCount = 0, zeroCount = 0, max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) 
                rightCount++;
            
            else if(nums[i] == 0){
                if(zeroCount == 1 && leftCount + rightCount > max) 
                    max = leftCount + rightCount;
                
                leftCount = rightCount;
                rightCount = 0;
                
                if(zeroCount == 0) 
                    zeroCount++;                
            }            
        }
        if(leftCount + rightCount > max) 
            max = leftCount + rightCount;
        
        if(zeroCount == 0) 
            max -= 1;
        
        return max;
    }
}