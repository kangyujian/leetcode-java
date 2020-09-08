package basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author dreamcold
 * time:2020-09-08
 * site:https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 *
 */

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null){
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1=0,l2=0;
        List<Integer> list=new ArrayList<>();
        while(l1<nums1.length&&l2<nums2.length){
            if(nums1[l1]==nums2[l2]){
                list.add(nums1[l1]);
                l1++;
                l2++;
            }
            else if(nums1[l1]<nums2[l2]){
                l1++;
            }else{
                l2++;
            }
        }
        int [] ints = list.stream().mapToInt(Integer::intValue).toArray();
        return ints;

    }
}
