package LinkedList;

import LinkedList.CreateLinkedList.*;
import LinkedList.ReverseLinkedList.*;

public class ReverseLLinGroupsOfSizeK {
    public static void main (String args[]){
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        CreateLinkedList.ListNode head = CreateLinkedList.createLL(arr);
        CreateLinkedList.printLinkedList(head);
        int k=3;
        ListNode rnode = reverseKGroup(head,k);
        CreateLinkedList.printLinkedList(rnode);
    }

    public static ListNode reverseKGroup(ListNode head , int k){
        if (head == null || k<=1){
            return head;
        }

         ListNode currhead = head;
         int count =0;
         while(currhead != null && count < k ){
            currhead = currhead.next;
            count++;
         }

         if (count < k){
            return head;
         }
        ListNode prev = null;
        ListNode ptr = head;
        ListNode nxt = null;
        count =0;

        while (count < k && ptr != null){
            nxt =ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=nxt;
            count++;
        }
        // Recursively reverse remaining list and connect
        head.next = reverseKGroup(ptr, k);

       
        return prev;
    }
}