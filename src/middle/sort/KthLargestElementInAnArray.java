package middle.sort;

/**
 * @author dreamcold
 * @site https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @time 2020-10-12
 * @description kth-largest-element-in-an-array
 */

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        int target=len-k;
        while (left<right){
            int index=partition(nums,left,right);
            if(index==target){
                return nums[index];
            }else if(index<target){
                left=index+1;
            }else{
                right=index-1;
            }
        }
        return nums[target];
    }

    private int partition(int[] nums,int left,int right){
        int pivot=nums[left];
        int i=left,j=right;
        while (i<j){
            while (i<j&&nums[j]>=pivot){
                j--;
            }
            nums[i]=nums[j];
            while (i<j&&nums[i]<=pivot){
                i++;
            }
            nums[j]=nums[i];
        }
        nums[i]=pivot;
        return i;
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
