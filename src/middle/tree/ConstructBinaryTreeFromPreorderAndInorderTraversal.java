package middle.tree;

import java.util.Arrays;

/**
 * @author dreamcold
 * @time:2020-10-1
 * @site:https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       if(preorder==null||inorder==null||preorder.length==0||inorder.length==0){
           return null;
       }
       TreeNode root=new TreeNode(preorder[0]);
       int middleIndex=-1;
       for (int i=0;i<inorder.length;i++){
           if(inorder[i]==preorder[0]){
               middleIndex=i;
               break;
           }
       }
       root.left=buildTree(Arrays.copyOfRange(preorder,1,middleIndex+1),Arrays.copyOfRange(inorder,0,middleIndex));
       root.right=buildTree(Arrays.copyOfRange(preorder,middleIndex+1,preorder.length),Arrays.copyOfRange(inorder,middleIndex+1,inorder.length));
       return root;

    }
}
