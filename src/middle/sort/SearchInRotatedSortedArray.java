package middle.sort;


/**
 * @author dreamcold
 * @time 2020-10-16
 * @site https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * @description 搜索旋转排序数组
 */

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length==0||nums==null){
            return -1;
        }
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+((right-left)>>1);
            if(nums[mid]==target){
                return mid;
            }

            //左边有序
            if(nums[mid]>=nums[left]){
                //比mid小 且在左区间
                if(target>=nums[left]&&target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }

                //右边有序
            }else{
                if(target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;

    }

}
