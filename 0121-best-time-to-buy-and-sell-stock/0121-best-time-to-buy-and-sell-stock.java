class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length <= 1)
            return 0;
        
        int maxProfit = 0;
        int min = prices[0];        
        for(int i=0; i<prices.length; i++){
            maxProfit = (int)Math.max(maxProfit, prices[i]-min);
            min = (int)Math.min(min, prices[i]);
        }

        return maxProfit;
    }
}