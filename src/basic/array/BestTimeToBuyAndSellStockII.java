package basic.array;


/**
 *
 * @author dreamcold
 * time:2020-09-06
 * address:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int max=0;
        for(int i=1;i<prices.length;i++){
            int temp=prices[i]-prices[i-1];
            if(temp>0)
                max+=temp;
        }
        return max;
    }

}
