class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i:nums1){
            set1.add(i);
            set2.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                set2.remove(i);
            }
            else{
                set3.add(i);
            }
        }
        for(int a:set2){
            l1.add(a);
        }
        for(int a:set3){
            l2.add(a);
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        return list;
    }
}