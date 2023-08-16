class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean appear[] = new boolean[nums.length];
        for(int i: nums){
            appear[i-1] = true;
        }
        List<Integer> missingNos  = new LinkedList<>();
        for(int i =0; i< nums.length; i++){
            if(!appear[i]) 
                missingNos.add(i+1);
        }

        return missingNos;
        
    }
}