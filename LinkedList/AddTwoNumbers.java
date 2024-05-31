package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);
        ListNode NewHead = AddNumbers(head1 , head2);
        printLinkedList(NewHead);
    }

    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode AddNumbers(ListNode head1,ListNode head2){
        ListNode NewHead =new ListNode(0);
        ListNode curr = NewHead;
        // comment this because it is given non empty list
        // if(head1 == null){
        //     NewHead = head2;
        // }
        // else if(head2 ==null){
        //     NewHead =head1;
        // }
        // else{
            int carry = 0;
            ListNode ptr1 =head1;
            ListNode ptr2 =head2;
            while(ptr1 != null || ptr2 != null){
                int val = ptr1.val + ptr2.val +carry;
                carry = val/10;
                curr.next = new ListNode(val%10);
                curr = curr.next;
                if (ptr1 != null) ptr1 = ptr1.next;
                if (ptr2 != null) ptr2 = ptr2.next;
                
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
        // }
        return NewHead.next;
    }
}