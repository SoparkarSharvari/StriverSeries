package LinkedList;

import LinkedList.CreateLinkedList.ListNode;

public class MiddleOfLinkedList {
    
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int count=0;
        while(current != null){
            count++;
            current=current.next;
        }
        current=head;
        int i = 0;
        while(current != null && i < count/2 ){
            current =current.next;
            i++;
        }
        return current;
    }
}
