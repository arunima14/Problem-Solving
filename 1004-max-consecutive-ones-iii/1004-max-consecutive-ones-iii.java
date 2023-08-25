class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_val = 0;
        int i = 0;
        int j = 0;
        int zeroes = 0;
        while(j<nums.length)
        {
            if(nums[j] == 0)
            {
                if(zeroes < k)
                {
                    zeroes++;
                    j++;
                }
                else{
                    while(nums[i] == 1)
                    {
                        i++;
                    }
                    zeroes--;
                    i++;
                }
            }
            else{
                j++;
            }
            max_val = Math.max(max_val,(j-i));
        }
        return max_val;
    }
}