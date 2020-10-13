package middle.sort;

/**
 * @author dreamcold
 * @time 2020-10-13
 * @site https://leetcode-cn.com/problems/find-peak-element/
 * @description  寻找峰值
 *
 */
public class FindPeakElement {

    //    第一种解法
    public int findPeakElementSoulutonOne(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i;
            }
        }
        return nums.length-1;
    }

    //递归二分法
    public int findPeakElementSoulutionTwo(int[] nums) {
        return findMaxIndex(nums,0,nums.length-1);
    }

    private int findMaxIndex(int[] nums,int left,int right){
        int mid=left+(right-left)>>1;
        if(nums[mid]>nums[mid+1]){
            return findMaxIndex(nums,left,mid);
        }
        return findMaxIndex(nums,mid+1,right);
    }
}
