package basic.tree;

/**
 * @author dreamcold
 * site:https://leetcode-cn.com/problems/validate-binary-search-tree/
 * time:2020-09-08
 * 中序遍历时，判断当前节点是否大于中序遍历的前一个节点，如果大于，说
 * 明满足 BST，继续遍历；否则直接返回 false。
 */
public class ValidateBinarySearchTree {
    double last = -Double.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isValidBST(root.left)) {
            if (last < root.val) {
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
