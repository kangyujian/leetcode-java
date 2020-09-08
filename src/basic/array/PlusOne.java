package basic.array;

/**
 * @author dreamcold
 * time:2020-08-08
 * site:https://leetcode-cn.com/problems/plus-one/
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry=1;//进位
        for(int i=digits.length-1;i>=0;i--){//从后往前加
            int temp=digits[i]+carry;
            if(temp<10){//如果没有向前一位进位
                digits[i]=digits[i]+1;
                return digits;//直接返回结果
            }else{
                temp=temp%10;//求余数
                digits[i]=temp;
                carry=1;//向前进一位
            }
        }
        int [] temp=new int[digits.length+1];//999...+1的情况，要注意位数加1
        temp[0]=1;
        return temp;

    }
}
