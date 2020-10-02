package middle.map;

/**
 * @author dreamcold
 * @time 2020-10-2
 * @site https://leetcode-cn.com/problems/number-of-islands/
 */

/**
 * I have little question about this question
 */

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int isLandNum=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    infect(grid,i,j);
                    isLandNum++;
                }
            }
        }
        return isLandNum;

    }

    private void infect(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1'){
            return;
        }

        grid[i][j]='2';

        infect(grid,i+1,j);
        infect(grid,i-1,j);
        infect(grid,i,j+1);
        infect(grid,i,j-1);
    }
}
