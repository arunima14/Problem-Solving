class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        // if(nums.length <= 2)
        //     return nums[0];
        
        return nums[nums.length/2];
    }
}