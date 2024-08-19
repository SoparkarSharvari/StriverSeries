package Trees;

import java.util.Scanner;
import java.util.*;
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
class BinaryTree {
    TreeNode root;
    public TreeNode insertLevelOrder(int[] arr,TreeNode root ,int i){
        if(i < arr.length){
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

             // insert left child
             root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

             // insert right child
             root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public ArrayList<Integer> interativePreOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> interativePreOrder = new ArrayList<>();
        if (root == null) {
            return interativePreOrder;
        }
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            interativePreOrder.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
           
        }
        return interativePreOrder;
    }
    public ArrayList<Integer> interativeinOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> interativeinOrder = new ArrayList<>();
        if (root == null) {
            return interativeinOrder;
        }
        stack.push(root);
        while(!stack.empty()){
            while(root != null) {
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            interativeinOrder.add(root.val);
            root=root.right;
        }
        return interativeinOrder;
    }
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public void togetherOrder(TreeNode root , ArrayList<Integer> inOrder, ArrayList<Integer> preOrder, ArrayList<Integer> postOrder){
        if(root == null){
            return;
        }

        preOrder.add(root.val);
        togetherOrder(root.left, inOrder, preOrder, postOrder);
        inOrder.add(root.val);
        togetherOrder(root.right, inOrder, preOrder, postOrder);
        postOrder.add(root.val);
        

    }
    public static void printList(ArrayList<Integer> list) {
        for (int val : list) {
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int N = sc.nextInt();

        System.out.println("enter array :");
        int[] arr = new int[N];
        for(int i=0 ;i<N ;i++){
            arr[i] = sc.nextInt();
        }
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insertLevelOrder(arr, tree.root, 0);
        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

        ArrayList<Integer> inorderList = new ArrayList<>();
        ArrayList<Integer> preorderList = new ArrayList<>();
        ArrayList<Integer> postorderList = new ArrayList<>();

        tree.togetherOrder(tree.root, inorderList, preorderList, postorderList);

        // Printing the traversals
        System.out.print("Inorder Traversal: ");
        printList(inorderList);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        printList(preorderList);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        printList(postorderList);
        System.out.println();
        
    }
}
