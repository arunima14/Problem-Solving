class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int p = 0, count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                count++;
            else
                temp[p++] = nums[i];
        }
        for(int i=p; i<nums.length; i++)
            temp[i] = 0;
        
        for(int i=0; i<temp.length; i++)
            nums[i] = temp[i];
    }
}