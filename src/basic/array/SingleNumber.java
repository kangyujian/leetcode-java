package basic.array;


/**
 * @author dreamcold
 * time:2020-09-08
 * site:https://leetcode-cn.com/problems/single-number/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int  res=0;
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}
