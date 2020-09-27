package middle.string;

/**
 * @author dreamcold
 * time:2020-09-20
 * site:https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubString {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int maxLen=1;
        int start=0;
        char[] charArray=s.toCharArray();
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if(isPalindromic(charArray,i,j)&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    start=i;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }

    private boolean isPalindromic(char[] charArray,int left,int right){
        while (left<right){
            if(charArray[left]!=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
