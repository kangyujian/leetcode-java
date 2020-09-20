package middle.string;

/**
 * @author dreamcold
 * time:2020-09-20
 * site:https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubString {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2)
            return s;
        boolean dp[][]=new boolean[len][len];
        char str[]=s.toCharArray();
        int start=0,length=1;
        //System.out.println(len);
        for(int i=0;i<len;i++)
            dp[i][i]=true;
        for(int j=1;j<len;j++)
            for(int i=0;i<j;i++){
                if(str[i]!=str[j]){
                    //System.out.println(i+" "+j);
                    dp[i][j]=false;
                }
                else{
                    if(j-i>2)
                        dp[i][j]=dp[i+1][j-1];
                    else
                        dp[i][j]=true;
                }

                if(dp[i][j]==true&&j-i+1>length){
                    //System.out.println(i+" "+j);
                    start=i;
                    length=j-i+1;
                }
            }
        return s.substring(start,start+length);
    }
}
