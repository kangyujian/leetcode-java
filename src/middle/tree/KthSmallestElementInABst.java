package middle.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dreamcold
 * @time 2020-10-2
 * @site https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 */
public class KthSmallestElementInABst {

    private List<Integer> res=new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        middleOrderTravel(root,this.res);
        return res.get(k-1);
    }

    private void middleOrderTravel(TreeNode root,List res){
        if(root==null){
            return;
        }
        if(root.left!=null){
            middleOrderTravel(root.left,res);
        }
        res.add(root.val);
        if(root.right!=null){
            middleOrderTravel(root.right,res);
        }
    }

}
