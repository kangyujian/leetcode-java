package basic.array;

import java.util.HashMap;
import java.util.Map;


/**
 * @author dreamcold
 * site:https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 * time:2020-09-08
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],0)>=1){
                return true;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return false;
    }
}
