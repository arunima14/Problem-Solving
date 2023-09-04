class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int[] cols : dp)
        Arrays.fill(cols , -1);
        
        
        return count(0 , fee , prices , 1 , dp);
    }
    
    
    public int count(int i , int fee , int[] prices , int allowed , int[][] dp)
    {
        if(i == prices.length)
            return 0;

        if(dp[i][allowed] != -1)
            return dp[i][allowed];

        int profit;
        if(allowed == 1)
        {
            int buy = -prices[i] + count(i + 1 , fee , prices , 0 , dp);
            int notBuy = 0 + count(i + 1 , fee , prices , 1 , dp);
            profit = Math.max(buy , notBuy);
        }
        else
        {
            int sell = prices[i] - fee + count(i + 1 , fee , prices , 1 , dp);
            int notSell = 0 + count(i + 1 , fee , prices , 0 , dp);
            profit = Math.max(sell , notSell);
        }
        
        dp[i][allowed] = profit;
               
        return dp[i][allowed];
    }
}