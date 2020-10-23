package middle.dp;

import java.util.Arrays;

/**
 * @author dreamcold
 * @time 2020-10-23
 * @site https://leetcode-cn.com/problems/longest-increasing-subsequence/
 * @description . 最长上升子序列
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int len=nums.length;

        //以num[i]结尾的最长的上升子序列
        int[] dp=new int[len];
        Arrays.fill(dp,1);

        int maxLen=0;
        for (int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            if(dp[i]>maxLen){
                maxLen=dp[i];
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {

    }
}
