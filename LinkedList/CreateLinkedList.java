package LinkedList;

public class CreateLinkedList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
             this.val = val; 
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next; 
        }
    }
    
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
