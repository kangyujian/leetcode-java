package middle.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author dreamcold
 * @time 2020-10-3
 * @site https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> combinations=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return combinations;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('4', "ghi");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrace(combinations,map,0,new StringBuilder(),digits);
        return combinations;
    }


    private void backtrace(List<String> combinations,Map<Character,String> map,int index,StringBuilder combination,String digits){
        if(index==digits.length()){
            combinations.add(combination.toString());
        }else{
            char digit=digits.charAt(index);
            String letters=map.get(digit);
            int letterCounts=letters.length();
            for (int i=0;i<letterCounts;i++){
                combination.append(letters.charAt(i));
                backtrace(combinations,map,index+1,combination,digits);
                //回退
                combination.deleteCharAt(index);
            }
        }
    }
}
