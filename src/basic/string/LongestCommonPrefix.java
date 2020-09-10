package basic.string;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String theSame=strs[0];
        for (int i=1;i<strs.length;i++){
            theSame=theSameHead(theSame,strs[i]);
            if(theSame.length()==0){
                break;
            }
        }

        return theSame;
    }

    public static String theSameHead(String s1,String s2){
        int len=Math.min(s1.length(),s2.length());
        int index=0;
        while (index<len&&s1.charAt(index)==s2.charAt(index)){
            index++;
        }
        return s1.substring(0,index);
    }
}
