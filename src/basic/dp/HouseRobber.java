package basic.dp;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/house-robber/
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp=new int[nums.length+1];
        dp[1]=nums[0];
        dp[2]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
        }
        return dp[nums.length];
    }
}
