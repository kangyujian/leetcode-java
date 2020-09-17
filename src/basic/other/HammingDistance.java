package basic.other;

/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/hamming-distance/
 * time:2020-09-17
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int count=0;
        while (z!=0){
            count+=z&1;
            z>>>=1;
        }
        return count;
    }
}
