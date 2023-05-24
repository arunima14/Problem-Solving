class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        final int n = nums1.length;
        final int[][] temp = new int[n][2];
        for(int i = 0; i < n; i++) {
            temp[i][0] = nums1[i];
            temp[i][1] = nums2[i];
        }

        Arrays.sort(temp, (a, b) -> b[1] - a[1]);
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int min = Integer.MAX_VALUE;
        long currentSum = 0;
        long result = 0;
        for(int i = 0; i < n; i++) {
            pq.offer(temp[i][0]);
            currentSum += temp[i][0];
            if(i >= k - 1) {
                result = Math.max(result,currentSum * temp[i][1]);
                currentSum -= pq.poll();
            }
        }
        return result;
    }
}