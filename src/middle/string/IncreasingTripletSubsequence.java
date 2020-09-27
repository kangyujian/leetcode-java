package middle.string;

/**
 * @author dreamcold
 * time:2020-09-22
 * site:
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int len=nums.length;
        if(len<3) return false;
        int small=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if(nums[i]<=small){
                small=nums[i];
            }else if(nums[i]<=mid){
                mid=nums[i];
            }else if(nums[i]>mid){
                return true;
            }
        }
        return false;

    }
}
