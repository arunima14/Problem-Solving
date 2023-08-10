class Solution {
    public int[] maxSubsequence(int[] nums, int k) { 
         List<Integer> ls = new ArrayList<>();
         for(int i=0;i<k;i++){
             ls.add(nums[i]);
         }
         for(int j=k;j<nums.length;j++){
             if(Collections.min(ls)<=nums[j]){
                 ls.remove(Integer.valueOf(Collections.min(ls)));
                 ls.add(nums[j]);
             }
         }
         System.out.println(ls);
         int[] arr = ls.stream().mapToInt(i -> i).toArray();
         return arr;
    }
}