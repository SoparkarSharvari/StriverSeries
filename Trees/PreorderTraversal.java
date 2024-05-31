package Trees;
import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
           List<Integer> res = new ArrayList<>(); 
            preorder(root, res);
            return res;
        }
        public void preorder(TreeNode root,List<Integer> res){
            if(root==null){
                return ;
            }
            res.add(root.val);
            preorder(root.left,res);
            preorder(root.right,res);
        }
    }
}
