class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length == 1)
            return Arrays.asList(nums[0]);

        int required = nums.length/3;
        List<Integer> res = new ArrayList<>();

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){            
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> it : freqMap.entrySet()){
            if(it.getValue() > required)
                res.add(it.getKey());
        }
        return res;
    }
}