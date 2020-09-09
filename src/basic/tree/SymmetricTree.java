package basic.tree;

/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/symmetric-tree/
 * time:2020-09-09
 */

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return symmetric(root.left,root.right);
    }

    public boolean symmetric(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        return root1.val==root2.val&&symmetric(root1.left,root2.right)&&symmetric(root1.right,root2.left);
    }
}
