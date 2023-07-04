class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i= 0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        
        Iterator value = set.iterator();
        
        int i=0;
        while(value.hasNext()){
            nums[i++] = (int)value.next();
            // Arrays.sort(nums);
        }
        
        return set.size();
    }
}