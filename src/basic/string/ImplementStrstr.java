package basic.string;

/**
 * @author dreamcold
 * time:2020-09-20
 * site:https://leetcode-cn.com/problems/implement-strstr/
 */
public class ImplementStrstr {

    public int strStr(String haystack, String needle) {

        int m=haystack.length();
        int n=needle.length();
        if(m==0&&n==0){
            return 0;
        }
        for(int i=0;i<m-n+1;i++){
            int j;
            for(j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==n){
                return i;
            }
        }
        return -1;

    }
}
