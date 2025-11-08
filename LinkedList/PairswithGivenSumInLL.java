package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PairswithGivenSumInLL {
    public static void main(String[] args) {
        // Create a doubly linked list with elements 1, 2, 3, 4, 5
        int[] arr ={1,2,3,4,5};
        ListNode head1 = Createll(arr);
        printLinkedList(head1);
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

        public static ListNode Createll(int[] arr){
        ListNode head = new ListNode(arr[0]) ;
        ListNode ptr=head;
        for(int i=1;i<arr.length;i++){
            ListNode temp = new ListNode(arr[i]);
            ptr.next = temp;
            ptr = temp;
        }
        return head;
    }

        public static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static List<List<Integer>> printPairsWithGivenSum(ListNode head, int targetSum) {
        List<List<Integer>> Ans = new ArrayList<>();
        ListNode first = head;
        ListNode second = head.next;

        if (first == null){
            return Ans;
        }
        while (first.next != null){
            while (second != null && first.val + second.val <= targetSum){
                if( targetSum == first.val + second.val){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(first.val);
                    pair.add(second.val);
                    Ans.add(pair);
                }
                second = second.next;
        }
            first = first.next;
            second = first.next;
    }

        if (Ans.size() == 0) {
            System.out.println("No pairs found with the given sum.");
        }
        return Ans;
    }
}

