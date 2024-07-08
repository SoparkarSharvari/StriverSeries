package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

public class SortLL {
    public static void main(String[] args) {
        int[] arr ={1,9,4,6,2,8,0,3};
        ListNode head1 = Createll(arr);
        printLinkedList(head1);
        printLinkedList(sort(head1));
    }
    public static ListNode sort(ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode i =head;

        while(i != null){
            ListNode mini = i;
            ListNode j = i.next;
            while(j != null){
                if(mini.val>j.val){
                    mini = j;
                }
                j=j.next;
            }
            if (mini != i) {
                int temp = i.val;
                i.val = mini.val;
                mini.val = temp;
            }
            i=i.next;
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
