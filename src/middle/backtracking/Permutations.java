package middle.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dreamcold
 * @time 2020-10-9
 * @site https://leetcode-cn.com/problems/permutations/
 */
public class Permutations {

    private  List<List<Integer>> res=new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        dfs(temp,nums);
        return res;
    }

    private void dfs(List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
        }
        for(int i=0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                dfs(temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}
