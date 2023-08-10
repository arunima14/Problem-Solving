class Solution {
    public int lengthOfLIS(int[] nums) {
        // int longest = 1;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i+1] > nums[i])
        //         longest++;
        // }
        
        
        // return longest;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(list.isEmpty() || list.get(list.size()-1) < nums[i])
                list.add(nums[i]);
            else{
                list.set(binSearch(list,nums[i]),nums[i]);
            }
        }
        
        return list.size();
    }
    
    
    int binSearch(List<Integer> list, int num){
        int start =0, end = list.size();
        int index = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(list.get(mid) == num)
                return mid;
            else if(list.get(mid) < num){
                start = mid+1;
            }else{
                index = mid;
                end =  mid-1;
            }
        }
        return index;
    }
}