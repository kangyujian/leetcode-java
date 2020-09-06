package basic.array;


/**
 * @author dreamcold
 * time:2020-09-06
 * address:https://leetcode-cn.com/problems/rotate-array/
 */

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;

        for(int i=0;i<k;i++){
            int temp=nums[n-1];
            for(int j=n-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }

    }
}
