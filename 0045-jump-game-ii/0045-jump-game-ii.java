class Solution {
    public int jump(int[] nums) {
        int reachable = 0;
        int count = 0, max = 0;

        for(int i=0; i<nums.length-1; i++){
            reachable = (int)Math.max(reachable, i+nums[i]);

            if(i == max){
                count++;
                max = reachable;
            }
        }

        return count;
    }
}