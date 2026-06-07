class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        maxProfitTrade, slow = 0, prices[0]

        for price in prices:
            profit = price - slow

            maxProfitTrade = max(maxProfitTrade, profit)
            slow = min(slow, price)

        return maxProfitTrade
