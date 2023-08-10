class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        // Intuition - PriorityQueue(Heap) + HashMap

        // Appraoch - 
        // Add all k elements to the minHeap 
        // and then for remaining elements of the array check 
        // if the element is greater than minHeap element
        // then we will that element and remove one element from heap

        // Add all the elements of the queue and its frequency in the hashmap
        
        // Iterate the array and check if that element is available in the HashMap 
        // Reduce(freq > 1) or Remove(freq == 1) that element from the HashMap 
        // and add the value to tghe answer array

        // Time Complexity - O(NlogN)
        // Space Complexity - O(N) 

        int N = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
            add(hm, nums[i]);
        }

        for(int i = k; i < N; i++) {
            if(minHeap.peek() < nums[i]) {
                remove(hm, minHeap.remove());
                minHeap.add(nums[i]);
                 add(hm, nums[i]);
            }
        }

        int[] ans = new int[k];
        int j = 0;
        for(int i = 0; i < N && hm.size() > 0; i++) {
            if(hm.containsKey(nums[i])) {
                ans[j++] = nums[i];
                remove(hm, nums[i]);
            }
        }
        return ans;
    }
    
    
    public void add(HashMap<Integer, Integer> hm, int value) {
        if(hm.containsKey(value)) {
            int v = hm.get(value);
            hm.put(value, v+1);
        } else {
            hm.put(value, 1);
        }
    }
    
    
    public void remove(HashMap<Integer, Integer> hm, int value) {
        if(hm.containsKey(value)) {
            int v = hm.get(value);
            if(v > 1) {
                hm.put(value, v-1);
            } else {
                hm.remove(value);
            }
        }
    }
}