package DoublyLinkedList;

import DoublyLinkedList.CreateDoubleLinkedList.ListNode;
import static DoublyLinkedList.CreateDLL.createDLL;
import static DoublyLinkedList.CreateDLL.printDLL;

import java.util.ArrayList;
import java.util.List;

public class PairswithGivenSumInDLL {

    public static void main(String[] args) {
        // Create a doubly linked list with elements 1, 2, 3, 4, 5
        int[] arr ={1,2,3,4,5};
        ListNode head1 = createDLL(arr);
        printDLL(head1);
        int targetSum = 5;
        List<List<Integer>> pairs = printPairsWithGivenSum(head1, targetSum);
        if (pairs.isEmpty()) {
            System.out.println("No pairs found with the given sum.");
        } else {
            System.out.println("Pairs with sum " + targetSum + ":");
            for (List<Integer> p : pairs) {
                System.out.println(p);
            }
        }
    }

    private static List<List<Integer>> printPairsWithGivenSum(ListNode head1, int targetSum) {
        List<List<Integer>>  ans = new ArrayList<>();
        ListNode  left = head1;
        ListNode right = head1;

        while (right.next != null){
            right = right.next;
        }
        while (left != null && right != null && left != right && right.next != left){
            int sum = left.val + right.val;
            if (sum == targetSum){
                List<Integer> pair = new ArrayList<>();
                pair.add(left.val);
                pair.add(right.val);
                ans.add(pair);
                left = left.next;
                right = right.next;
            }
            else if (sum < targetSum){
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
        return ans ; 

}
}
