class Solution {
    public long minimumReplacement(int[] nums) {
        int n = nums.length;
        int prv = nums[n-1];
        long ans =0;
        for(int i=n-2;i>=0;i--){
            int deletion = nums[i]/prv;
            if(nums[i]%prv!=0){
                deletion++;
            }
            if(nums[i]%prv!=0){
                prv = nums[i]/deletion;
            }
            ans += deletion-1;
        }
        return ans;
    }
}