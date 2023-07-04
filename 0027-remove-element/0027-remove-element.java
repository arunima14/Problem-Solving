class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val)
                list.add(nums[i]);
        }
        
        Iterator value = list.iterator();
        int i=0;
        while(value.hasNext()){
            nums[i++] = (int)value.next();
        }
        
        return list.size();
    }
}