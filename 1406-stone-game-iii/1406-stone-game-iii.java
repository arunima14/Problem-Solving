class Solution {
	private int memoizationUtil(int[] stoneValue, int index, int n, int[] dp) {
		if (index == n) {
			return 0;
		}
		if (dp[index] != -1) {
			return dp[index];
		}
		dp[index] = stoneValue[index] - memoizationUtil(stoneValue, index + 1, n, dp);
		if (index + 2 <= n) {
			dp[index] = Math.max(dp[index],
					stoneValue[index] + stoneValue[index + 1] - memoizationUtil(stoneValue, index + 2, n, dp));
		}
		if (index + 3 <= n) {
			dp[index] = Math.max(dp[index], stoneValue[index] + stoneValue[index + 1] + stoneValue[index + 2]
					- memoizationUtil(stoneValue, index + 3, n, dp));
		}
		return dp[index];
	}

	private String memoization(int[] stoneValue) {
		int n = stoneValue.length;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int dif = memoizationUtil(stoneValue, 0, stoneValue.length, dp);
		if (dif > 0) {
			return "Alice";
		}
		if (dif < 0) {
			return "Bob";
		}
		return "Tie";
	}

	public String stoneGameIII(int[] stoneValue) {
		return memoization(stoneValue);
	}
}