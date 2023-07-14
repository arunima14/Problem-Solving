class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null)
            return 0;
        
        if(nums.length == 3|| Arrays.stream(nums).allMatch(t -> t == nums[0])){
            return nums[0]+nums[1]+nums[2];
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE, result=0;
        
        for(int i=0; i<nums.length-1; i++){
            int left = i+1;
            int right = nums.length-1;
            
            while(left < right){
                int diff = 0;
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum > target){
                    right--;
                    diff = sum - target;
                }else{
                    left++;
                    diff = target - sum;
                }
                
                if(diff < minDiff){
                    minDiff = diff;
                    result = sum;
                }
                
            }
        }
        
        return result;
    }
}