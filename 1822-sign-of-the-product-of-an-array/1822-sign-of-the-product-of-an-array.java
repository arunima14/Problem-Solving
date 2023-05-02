class Solution {
    public int arraySign(int[] nums) {
        if(nums.length == 1){
            if(nums[0] == 0)
                return 0;
            else if(nums[0] > 0)
                return 1;
            else return -1;
        }
        
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == 0)
                return 0;
            if(nums[mid] > 0)
                end = mid -1;
            if(nums[mid] < 0)
                start = mid +1;
        }
        
        if(start%2 == 0)
            return 1;
        else 
            return -1;
    }
}