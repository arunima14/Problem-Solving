class Solution {
    public List<List<Integer>> permute(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        findsum(set , new ArrayList<Integer>() , nums);
    
        List<List<Integer>> ans = new ArrayList<>(set);

        return ans;
    }

    public void findsum(HashSet<List<Integer>> set, List<Integer> ll ,int[] nums ){
        if(ll.size() == nums.length){
            set.add(new ArrayList<>(ll));

            return;
        }


        for(int i = 0; i < nums.length; i++){
            if(ll.contains(nums[i]) == false){
                ll.add(nums[i]);
                findsum(set , ll , nums);
                ll.remove(ll.size() - 1);
            }
        }
    }
}