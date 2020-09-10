package basic.string;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] flag=new int[26];
        for(int i=0;i<s.length();i++){
            flag[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(flag[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
