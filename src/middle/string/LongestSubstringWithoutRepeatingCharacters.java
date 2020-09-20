package middle.string;

import java.util.HashMap;

/**
 * @author dreamcold
 * time:2020-09-19
 * site:https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
