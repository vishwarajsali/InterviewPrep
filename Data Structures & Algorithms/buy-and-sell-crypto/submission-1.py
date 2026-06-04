class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0;
        slow, fast = 0, 1

        while(fast < len(prices)):
            if prices[slow] < prices[fast]:
                profit = prices[fast] - prices[slow]
                res = max(res, profit)
            else:
                slow = fast
            
            fast +=1

        return res