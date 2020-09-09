package basic.tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dreamcold
 * time:2020-09-08
 * site:https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */

public class MaximumDepthOfBinaryTree {
/*    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
    */

    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int num=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode cur=queue.peek();
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                queue.poll();
                ;
            }
            num++;
        }
        return num;
    }
}
