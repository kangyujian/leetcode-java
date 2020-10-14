package middle.sort;

/**
 * @author dreamcold
 * @time 2020-10-14
 * @site https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @description 在排序数组中查找元素的第一个和最后一个位置
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return new int[]{-1,-1};
        }
        int left=0,right=nums.length-1;
        int i,j;
        while(left<=right){
            int mid=left+((right-left)>>1);
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                i=left;j=right;
                while(nums[i]!=target) i++;
                while(nums[j]!=target) j--;
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}


