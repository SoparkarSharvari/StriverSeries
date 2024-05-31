package Trees;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            postorder(root,result);
            return result;
        }
        public static void postorder(TreeNode root,List<Integer> result ){
            if(root == null){
                return;
            }
            postorder(root.left,result);
            postorder(root.right,result);
            result.add(root.val);
        }
        
    }
}
