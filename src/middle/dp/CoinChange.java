package middle.dp;

/**
 * @author dreamcold
 * @time 2020-10-21
 * @site https://leetcode-cn.com/problems/coin-change/
 * @description 零钱兑换
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            int cost=amount+1;
            for(int coin:coins){
                if(i-coin>=0){
                    cost=Math.min(cost,dp[i-coin]+1);
                }
            }
            dp[i]=cost;
        }
        if(dp[amount]==amount+1)
            return -1;
        else
            return dp[amount];
    }
}
