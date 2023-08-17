import java.util.*;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a,b) -> (a[0] - b[0]));
        
        for(int i=0; i<nums.length; i++){
            minHeap.offer(new int[] {nums[i], i});
            
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        Set<Integer> index = new HashSet<>();
        while(!minHeap.isEmpty()){
            int[] top = minHeap.peek();
            index.add(top[1]);
            minHeap.remove();
        }
        
        int[] res = new int[k];
        int p =0;
        for(int i=0; i<nums.length; i++){
            if(index.contains(i))
                res[p++] = nums[i];
        }
        
        return res;
    }
}