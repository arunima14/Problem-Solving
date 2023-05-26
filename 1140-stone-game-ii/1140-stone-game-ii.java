class Solution {
    int[] prefixSum;
    int[][] memo;
    int[] piles;
    public int stoneGameII(int[] piles) {
        this.piles = piles;
        int n = piles.length;
        prefixSum = new int[n];
        prefixSum[0] = piles[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + piles[i];
        }

        memo = new int[n][n / 2 + 2];
        for(int i = 0; i < n; i++){
            Arrays.fill(memo[i], -1);
        }

        return dp(0, 1);        
    }

    private int dp(int idx, int m){
        if(idx >= piles.length){
            return 0;
        }

        if(memo[idx][m] == -1){
            int sum = 0;
            int maxPoints = 0;
            for(int i = 1; i <= 2 * m; i++){
                int sel = idx + i - 1;
                if(sel >= piles.length) break;
                sum += piles[sel];
                int leftOverSum = prefixSum[piles.length - 1] - prefixSum[sel];
                int maxOppPoints = dp(sel + 1, Math.max(m, i));
                maxPoints = Math.max(maxPoints, sum + leftOverSum - maxOppPoints);
            }
            memo[idx][m] = maxPoints;
        }
        return memo[idx][m];
   }
}