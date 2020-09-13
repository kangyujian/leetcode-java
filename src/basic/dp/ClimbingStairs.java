package basic.dp;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
