class Solution {
    public boolean canJump(int[] nums) {
        int target=0;

        for(int i=0; i<nums.length; i++){
            if(i <= target){
                target = (int)Math.max(target, i+nums[i]);
                if(target >= nums.length-1)
                    return true;
            }
        }

        return false;
    }
}