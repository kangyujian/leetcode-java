package middle.dp;

/**
 * @author dreamcold
 * @time 2020-10-18
 * @site https://leetcode-cn.com/problems/jump-game/
 * @description 跳跃游戏
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        int n=nums.length;
        //[0,n-1]一路跳过来能否到达
        boolean[]dp=new boolean[n];
        dp[0]=true;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&nums[j]+j>=i){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n-1];
    }
}
