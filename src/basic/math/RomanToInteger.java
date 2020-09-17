package basic.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dreamcold
 * time:2020-09-17
 * site:https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        if (s==null) return 0;
        int res=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] array=s.toCharArray();
        for (int i=0;i<array.length-1;i++){
            if (map.get(array[i])>=map.get(array[i+1])){
                res+=map.get(array[i]);
            }else{
                res-=map.get(array[i]);
            }
        }
        res+=map.get(array[array.length-1]);
        return res;
    }
}
