class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans = 0L;
        Queue<Integer> leftCandidatesQueue = new PriorityQueue<>();
        Queue<Integer> rightCandidatesQueue = new PriorityQueue<>();
        Deque<Integer> workersQueue = new ArrayDeque<>();

        for (int i = 0; i < costs.length; i++) {
            if (i < candidates) leftCandidatesQueue.offer(costs[i]);
            else if (costs.length - i <= candidates) rightCandidatesQueue.offer(costs[i]);
            else workersQueue.offer(costs[i]);
        }

        while (k-- > 0) {

            if (leftCandidatesQueue.isEmpty() && rightCandidatesQueue.isEmpty() && workersQueue.isEmpty()) break;

            if (!leftCandidatesQueue.isEmpty() && rightCandidatesQueue.isEmpty())
                ans += leftCandidatesQueue.poll();
            else if (leftCandidatesQueue.isEmpty() && !rightCandidatesQueue.isEmpty())
                ans += rightCandidatesQueue.poll();
            else {
                if (leftCandidatesQueue.peek() <= rightCandidatesQueue.peek()) {
                    ans += leftCandidatesQueue.poll();
                    if (!workersQueue.isEmpty()) leftCandidatesQueue.offer(workersQueue.poll());
                } else {
                    ans += rightCandidatesQueue.poll();
                    if (!workersQueue.isEmpty()) rightCandidatesQueue.offer(workersQueue.pollLast());
                }
            }
        }

        return ans;
    }
}