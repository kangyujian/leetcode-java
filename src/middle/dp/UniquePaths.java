package middle.dp;

/**
 *
 * @author dreamcold
 * @site https://leetcode-cn.com/problems/unique-paths/
 * @time 2020-10-20
 * @description 不同路径
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j]=1;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
