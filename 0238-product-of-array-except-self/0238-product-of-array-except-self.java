class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProd = 1, countZero = 0;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) countZero++;
            else totalProd *= nums[i];
        }

        
        for(int i = 0; i < nums.length; i++){
            if(countZero == 0){
                result[i] = totalProd / nums[i];
            } else if(countZero == 1){
                if(nums[i] != 0){
                    result[i] = 0;
                } else {
                    result[i] = totalProd;
                }
            }
        }

        return result;

    }
}