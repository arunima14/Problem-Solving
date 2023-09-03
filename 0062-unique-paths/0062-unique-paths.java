class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] v : dp) Arrays.fill(v, -1);
        return solve(0, 0, m, n, dp);
    }

    int solve(int i, int j, int m, int n, int[][] dp) {
        //no path exists
        if(i >= m || j >= n) return 0;

        if(i == m -1 && j == n -1) return 1;

        if(dp[i][j] != -1) return dp[i][j];
        
        int ans = 0;
        // if(i + 1 < m && !vis[i + 1][j]) 
        ans +=  solve(i + 1, j, m, n, dp);

        // if(j + 1 < n && !vis[i][j + 1])
        ans += solve(i, j + 1, m, n, dp);

        dp[i][j] = ans;
        return ans;
    }
}