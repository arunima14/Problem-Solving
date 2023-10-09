class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        //finding first occurence
        result[0] = findTarget(nums, target, true);
        
        //finding last occurence
        result[1] = findTarget(nums, target, false);        
        
        return result;
    }
    
    int findTarget(int[] nums, int target, boolean startIndex){
        int start = 0;
        int end = nums.length -1 ;
        int value = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] < target)
                start = mid + 1;
            else if(nums[mid] > target)
                end = mid - 1;
            else{
                value = mid;
                if(startIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        
        return value;
    }
}