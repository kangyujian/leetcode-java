package basic.sort;

/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/merge-sorted-array/
 * time:2020-09-10
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int last=m+n-1;
       int inedx1=m-1,index2=n-1;
       while (inedx1>=0&&index2>=0){
           nums1[last--]=nums1[inedx1]>nums2[index2]?nums1[inedx1--]:nums2[index2--];
       }
        while (index2>=0){
            nums1[last--]=nums2[index2--];
        }
    }
}
