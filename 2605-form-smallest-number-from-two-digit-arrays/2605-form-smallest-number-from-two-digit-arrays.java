class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        List<Integer> nums2List = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0; i<nums2.length; i++)
            nums2List.add(nums2[i]);
        for(int i=0; i<nums1.length; i++){
            if(nums2List.contains(nums1[i]))
                return nums1[i];
            
            else
                min1 = (int)Math.min(min1, nums1[i]);
        }
        
        for(int i=0; i<nums2.length; i++)
            min2 = (int)Math.min(nums2[i], min2);
        
        
        return (int)Math.min(min1*10+min2, min2*10+min1);
    }
}