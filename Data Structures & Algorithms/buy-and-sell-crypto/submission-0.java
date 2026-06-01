class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int fast = 1, slow = 0; fast < prices.length; fast++) {
            int profit = prices[fast] - prices[slow];

            maxProfit = Math.max(maxProfit, profit);

            if (prices[fast] < prices[slow]) {
                slow = fast;
            }
        }

        return maxProfit;
    }
}
