package basic.other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dreamcold
 * time:2020-09-18
 * site:https://leetcode-cn.com/problems/pascals-triangle/
 */

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        int[][] arr=new int[numRows][numRows];
        List<List<Integer>> list=new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> subList=new ArrayList<>();
            for (int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                subList.add(arr[i][j]);
            }
            list.add(subList);

        }
        return list;
    }
}
