package basic.string;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] map1=new int[26];
        int[] map2=new int[26];
        char[] cs1=s.toCharArray();
        char[] cs2=t.toCharArray();
        for(char c1:cs1) map1[c1-'a']++;
        for(char c2:cs2) map2[c2-'a']++;
        for(int i=0;i<26;i++) if(map1[i]!=map2[i]) return false;
        return true;
    }
}
