package basic.tree;

/**
 * @author dreamcold
 * time:2020-09-09
 * site:https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 */

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums,0,nums.length-1);
    }


    public TreeNode createTree(int []nums,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)>>1;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=createTree(nums,low,mid-1);
        root.right=createTree(nums,mid+1,high);
        return root;
    }
}
