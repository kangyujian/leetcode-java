package basic.other;

/**
 * @author dreamcold
 * time:2020-09-17
 * site:https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
