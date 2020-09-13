package basic.dp;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res=nums[0],sum=0;
        for (int i=0;i<nums.length;i++){
            if(sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            res=Math.max(sum,res);
        }
        return res;
    }
}
