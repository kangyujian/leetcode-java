package middle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dreamcold
 * @time 2020-10-03
 * @site https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
            List<String> res=new ArrayList<>();
            dfs(res,n,n,"");
            return res;
        }

        public void dfs(List<String> res,int left,int right,String temp){
            if(left==0&&right==0){
                res.add(temp);
                return;
            }
            if(left>0){
                dfs(res,left-1,right,temp+"(");
            }
            if(right>left){
                dfs(res,left,right-1,temp+")");
            }
    }
}
