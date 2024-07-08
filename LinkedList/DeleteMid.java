package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

public class DeleteMid {
    public static void main(String[] args) {
        int[] arr ={1,2};
        ListNode head1 = Createll(arr);
        printLinkedList(delMid(head1));
    }
    public static ListNode delMid(ListNode head){
        if (head == null || head.next == null) {
            return null;
        }    
        ListNode prev = null ,slow =head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = slow.next;
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
