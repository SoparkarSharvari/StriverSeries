package DoublyLinkedList;

import DoublyLinkedList.CreateDoubleLinkedList.ListNode;
import static DoublyLinkedList.CreateDLL.createDLL;
import static DoublyLinkedList.CreateDLL.printDLL;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatedFromSortedDLL {
     public static void main(String[] args) {
    int[] arr ={1,1,2,2,3,3,3,4,5};
        ListNode head1 = createDLL(arr);
        printDLL(head1);
        ListNode Ans = RemoveDuplicat(head1);
        printDLL(Ans);
        
    }
    public static ListNode RemoveDuplicat(ListNode head){
        ListNode curr = head;
        ListNode next = head.next;

        while (next != null) {
            if(curr.val == next.val){
                curr.next=next.next;
                if(next.next != null){
                    next.next.prev =curr;
                }
                next=curr.next;
            }else{
                curr =next;
                next=next.next;
            }
            }
        
        return head;
    }

}
