class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int pairs = 0;
        int end = nums.length - 1;
        int start = 0;
        
        while(start < end){
            int current = nums[start]+nums[end];
            if(current == k){
                start++;
                end--;
                pairs++;
            }
            if(current > k){
                end--;
            }
            if(current < k){
                start++;
            }
            
        }
        
        return pairs;
    }
}