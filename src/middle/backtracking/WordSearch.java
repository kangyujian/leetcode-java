package middle.backtracking;

/**
 * @author dreamcold
 * @time 2020-10-9
 * @site https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvkwe2/
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(board==null||board.length==0||board[0].length==0){
            return false;
        }
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                boolean[][] visited=new boolean[board.length][board[0].length];
                if(dfs(board,visited,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,boolean[][] visited,int i,int j,int index,String word){
        if(word.length()==index){
            return true;
        }
        if((i<0||i>=board.length)||(j<0||j>=board[0].length)||(board[i][j]!=word.charAt(index))||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        boolean left=dfs(board,visited,i,j-1,index+1,word);
        boolean right=dfs(board,visited,i,j+1,index+1,word);
        boolean up=dfs(board,visited,i-1,j,index+1,word);
        boolean down=dfs(board,visited,i+1,j,index+1,word);
        if(left||right||up||down){
            return true;
        }
        visited[i][j]=false;
        return false;
    }
}
