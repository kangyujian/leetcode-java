package basic.other;

/**
 * @author dreamcold
 * time:2020-09-18
 * site:https://leetcode-cn.com/problems/missing-number/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        //get the sum
        //then sub the num
        int sum=0;
        for (int num:nums){
            sum+=num;
        }
        return  (nums.length)*(nums.length+1)/2-sum;
    }
}
