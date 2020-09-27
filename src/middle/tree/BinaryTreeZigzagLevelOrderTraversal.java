package middle.tree;

import java.util.*;

/**
 * @author dreamcold
 * time:2020-09-27
 * site:https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if (root==null) return res;
        Deque<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean flag=false;
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(!flag){
                    list.add(temp.val);
                }else {
                    list.add(0,temp.val);
                }
                if (temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            flag=!flag;
            res.add(list);
        }
        return res;
    }

}
