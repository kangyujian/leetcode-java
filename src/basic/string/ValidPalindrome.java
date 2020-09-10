package basic.string;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null) return true;
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
