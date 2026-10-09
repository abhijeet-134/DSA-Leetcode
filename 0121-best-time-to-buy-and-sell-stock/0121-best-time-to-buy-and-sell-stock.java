class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0, buyPrice = prices[0];

        for(int i=1; i<prices.length; i++) {
            if(prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }

            buyPrice = Math.min(prices[i], buyPrice);
        }
        return maxprofit;
    }
}