package middle.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dreamcold
 * @time 2020-10-15
 * @site https://leetcode-cn.com/problems/merge-intervals/
 * @description 合并区间
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        //特判
        if(intervals==null||intervals.length==0){
            return intervals;
        }
        //对区间进行排序，排序根据a[0]
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        int i=0;
        int n=intervals.length;
        while(i<n){
            int left=intervals[i][0];
            int right=intervals[i][1];

            while(i<n-1&&right>=intervals[i+1][0]){
                right=Math.max(right,intervals[i+1][1]);
                i++;
            }
            res.add(new int[]{left,right});
            i++;
        }
        return res.toArray(new int[res.size()][2]);

    }
}
