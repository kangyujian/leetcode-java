package middle.sort;

/**
 * @author dreamcold
 * @time 2020-10-09
 * @site https://leetcode-cn.com/problems/sort-colors/
 */
public class SortColors {
    /* single pointer
    public void sortColors(int[] nums) {
        int ptr=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                swap(nums,i,ptr);
                ptr++;
            }
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                swap(nums,i,ptr);
                ptr++;
            }
        }

    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    *
    */

    public void sortColors(int[] nums) {
        int ptr0=0,ptr1=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                swap(nums,i,ptr1);
                ptr1++;
            }else if(nums[i]==0){
                swap(nums,i,ptr0);
                if(ptr0<ptr1){
                    swap(nums,i,ptr1);
                }
                ptr0++;
                ptr1++;
            }
        }

    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
