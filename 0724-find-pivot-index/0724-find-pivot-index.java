class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int j=0; j<nums.length; j++){
            int start = 0;
            int end = nums.length -1;
            int sumLeft=0, sumRight=0;
            
            
            for(int i=start; i<j; i++){
                sumLeft += nums[i];
            }

            for(int i=j+1; i<=end; i++){
                sumRight += nums[i];
            }
            
            if(sumLeft == sumRight)
                return j;
        }
        
        return -1;
    }
}