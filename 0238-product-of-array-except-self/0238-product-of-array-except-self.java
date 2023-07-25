class Solution {
    public int[] productExceptSelf(int[] nums) {
        //totalProd is the total product of all values that are not 0
        //countZero is the number of Zeroes present in the input array.
        int totalProd = 1, countZero = 0;
        int[] result = new int[nums.length];

        //find the number of zeroes
        //if a value is not zero it should become a factor of product
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) countZero++;
            else totalProd *= nums[i];
        }

        //handle scenarios 1 or 2 via logic
        //result[i] = totalProduct / nums[i].  removing a factor == division
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