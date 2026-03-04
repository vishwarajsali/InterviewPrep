package dev.vishsali.neetcode.practice.blind75.slidingWindow;

public class bestTimetoBuyandSellStock {

    public int solution_1(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length -1 ; i++){

            for(int j = i +1; j < prices.length  ; j++){
                int profit = prices[j] - prices[i] ;

                maxProfit = Math.max(profit, maxProfit);
            }
        }


        return maxProfit;
    }


    public int solution_2(int[] prices) {
        int maxProfit = 0, buy = 0, sell = 1, n = prices.length;
        while( sell < n){
            if(prices[buy] < prices[sell]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            }else buy = sell;

            sell++;
        }

        return maxProfit;
    }
}
