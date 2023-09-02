class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int[] dp = new int[s.length() + 1]; 
	    for (int i = s.length() - 1; i >= 0; i--) {
	        dp[i] = dp[i + 1] + 1; 
	        for (String word : dictionary) {
	            if (i + word.length() <= s.length() && s.startsWith(word, i)) {
	                dp[i] = Math.min(dp[i], dp[i + word.length()]);
	            }
	        }
	    }
	    return dp[0];
    }
}