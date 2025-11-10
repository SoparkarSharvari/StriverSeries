package LinkedList;

public class CreateLinkedList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        public ListNode(int val){
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

    public static ListNode createLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }
}
