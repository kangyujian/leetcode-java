package basic.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dreamcold
 * time:2020-09-08
 * site:https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp) && map.get(tmp) != i){
                return new int[]{i,map.get(tmp)};
            }
        }
        throw new RuntimeException("No two sum solution");
    }
}
