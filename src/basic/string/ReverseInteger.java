package basic.string;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public int reverse(int x) {
        long res=0;
        int flag=x>0?1:-1;
        x=Math.abs(x);
        while(x!=0){
            int tmp=x%10;
            res=res*10+tmp;
            x/=10;
        }
        res=res*flag;
        return (int)res==res?(int)res:0;
    }
}
