package basic.array;

/**
 * @Author dreancold
 * question address:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @Time 2020-9-6
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[index]){
                nums[++index]=nums[i];
            }
        }
        return index+1;


    }
}
