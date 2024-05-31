package Trees;

import java.util.ArrayList;
import java.util.List;

public class MorrisPreorderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        MorrisPreorderTraversal sol = new MorrisPreorderTraversal();

        List<Integer> preorder = sol.getPreorder(root);

        System.out.print("Binary Tree Morris Preorder Traversal: ");
        for (int i = 0; i < preorder.size(); i++) {
            System.out.print(preorder.get(i) + " ");
        }
        System.out.println();
    }
    public List<Integer> getPreorder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        TreeNode currNode = root;
        while( currNode != null){
            res.add(currNode.val);
            if(currNode.left == null){
                currNode=currNode.right;
            }
            else{
                TreeNode prev = currNode.left;
                while(prev.right != null && prev.right != currNode.right){
                    prev = prev.right;
                }
                if(prev.right == null ){
                    prev.right= currNode.right;
                    currNode = currNode.left;
                }
                else{
                    prev.right = null;
                }
            }
        }
        return res;
    }
}
