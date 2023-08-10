class Solution {
    public boolean search(int[] nums, int target) {
        return solve(nums,0,nums.length-1,target);
    }
    boolean solve(int[] nums , int start , int end , int target){
        while(start<=end){

            // duplicates remove from start
            while(start<end && nums[start]==nums[start+1]){
                start++;
            }
            // duplicates remove from end
            while(start<end && nums[end]==nums[end-1]){
                end--;
            }

            int mid=(start+end)/2;
            if(nums[mid]==target){
                return true;
            }

            if( nums[start] <= nums[mid] ){
                if( nums[start] <= target && target < nums[mid] ){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

            else{
                if( nums[mid] < target &&  target <= nums[end] ){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}