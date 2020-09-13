package basic.dp;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return  0;
        }
        int max=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
