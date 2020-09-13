package basic.design;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/shuffle-an-array/
 */
public class ShuffleAnArray {

    private int[] nums;
    private int[] originalNums;

    public ShuffleAnArray(int[] nums){
        this.nums=nums;
        this.originalNums= Arrays.copyOf(nums,nums.length);
    }




    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.originalNums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random=new Random();

        for (int i=0;i<nums.length/2;i++){
            swap(nums,0,random.nextInt(nums.length));
        }
        return nums;
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
