package basic.array;

/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/move-zeroes/
 * time:2020-09-08
 */

public class MoveZeroes {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
            i++;
        }
        while(j<nums.length){
            nums[j++]=0;
        }
    }
}
