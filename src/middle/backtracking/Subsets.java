package middle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dreamcold
 * @time 2020-10-09
 * @site https://leetcode-cn.com/problems/subsets/
 */
public class Subsets {

    private List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tempList=new ArrayList<>();
        dfs(nums,tempList,0);
        return res;
    }

    private void dfs(int[] nums,List<Integer> tempList,int len){
        for (int i=len;i<nums.length;i++){
            tempList.add(nums[i]);
            res.add(new ArrayList<>(tempList));
            dfs(nums,tempList,len+1);
            tempList.remove(tempList.size()-1);
        }
    }


}
