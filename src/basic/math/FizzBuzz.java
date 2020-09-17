package basic.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/fizz-buzz/
 */

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for (Integer i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else {
                list.add(i.toString());
            }
        }
        return list;
    }
}
