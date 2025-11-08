package DoublyLinkedList;

import DoublyLinkedList.CreateDoubleLinkedList.ListNode;

public class CreateDLL {
    
        public static ListNode createDLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            current.next = temp;
            temp.prev = current; // link back
            current = temp;
        }
        return head;
    }

        public static void printDLL(ListNode head) {
        ListNode curr = head;
        System.out.print("DLL (forward): ");
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
