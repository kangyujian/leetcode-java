package middle.sort;

/**
 * @author dreamcold
 * @time 2020-10-17
 * @site https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 * @description 240. 搜索二维矩阵 II
 */
public class SearchA2dMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        int rows=matrix.length,cols=matrix[0].length;
        int i=0,j=cols-1;
        while((i>=0&&i<rows)&&(j>=0&&j<cols)){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
