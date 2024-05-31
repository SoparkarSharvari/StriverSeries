package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list with elements 1, 2, 3, 4, 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the linked list
        // CreateLinkedList.printLinkedList(head);
        ListNode rnode = reverseList(head);
        printLinkedList(rnode);
    }
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode ptr = head;
        ListNode nxt = null;
        while(ptr != null){
            nxt =ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=nxt;
        }
        return prev;
    }
}
