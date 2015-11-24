public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)  return 0;
        int lowIdx = 0;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            lowIdx = prices[lowIdx] < prices[i] ? lowIdx : i;
            if(prices[i] - prices[lowIdx] > maxProfit){
                maxProfit = prices[i] - prices[lowIdx];
            }
        }

        return maxProfit;

    }
}
