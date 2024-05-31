package Trees;

import java.util.ArrayList;
import java.util.List;
class InorderTraversal {
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
        List<Integer> result = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            inorder(root,result);
            return result;
        }
        public static void inorder(TreeNode root,List<Integer> result ){
            if(root == null){
                return;
            }
            inorder(root.left,result);
            result.add(root.val);
            inorder(root.right,result);
        }
    
    }
}
