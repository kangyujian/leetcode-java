package basic.other;

import java.util.Stack;

/**
 * @author dreamcold
 * time:2020-09-18
 * site:https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(isSys(stack.peek(),s.charAt(i))){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.size()==0;
    }


    private boolean isSys(char c1,char c2){
        return (c1=='('&&c2==')')||(c1=='['&&c2==']')||(c1=='{'&&c2=='}');
    }
}
