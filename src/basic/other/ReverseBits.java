package basic.other;

/**
 * @author dreamcold
 * time:2020-09-17
 * site:https://leetcode-cn.com/problems/reverse-bits/
 */
public class ReverseBits {
    // you need treat n as an unsigned value

    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            int bit=n&1;
            n=n>>1;
            res=(res<<1)^bit;
        }
        return res;
    }
}
