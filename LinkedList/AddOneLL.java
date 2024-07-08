package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

public class AddOneLL {
    public static void main(String[] args) {
        int[] arr ={4,9,9};
        ListNode head1 = Createll(arr);
        addone(head1);
    }
    public static void addone(ListNode head){
        if (head == null) return;
        ListNode rehead = reverseList(head);
        ListNode ptr=rehead;
        int carry = 1;  // Initially, we need to add one

        while (ptr != null && carry > 0) {
        int sum = ptr.val + carry;
        ptr.val = sum % 10;
        carry = sum / 10;
        if (ptr.next == null && carry > 0) {
            // If we reach the end of the list and there's still a carry, add a new node
            ptr.next = new ListNode(carry);
            carry = 0;
        }
        ptr = ptr.next;
    }

        ListNode newhead = reverseList(rehead);
        printLinkedList(newhead);
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
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
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
}
