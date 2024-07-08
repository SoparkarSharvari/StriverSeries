package LinkedList;


import LinkedList.CreateLinkedList.ListNode;

public class odd_even_ll {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int[] arr ={1,2,3,4,5,6,7,8};
        ListNode head1 = Createll(arr);
        printLinkedList(head1);
        // System.out.println(length(head1));
        // odd_even_list(head1);
    }
    
    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void odd_even_list(ListNode head){
        int len = length(head);
        int[] arr = new int[len];
        int odd=(len/2)+ (len % 2);;
        int even =0;
        int i=0;
        ListNode ptr =head;
        while(ptr != null){
            if(i % 2 != 0){
                arr[odd]=ptr.val;
                odd++;
            }
            else{
                arr[even]=ptr.val;
                even++;
            }
            i++;
            ptr=ptr.next;
        }
       ListNode newll = Createll(arr);
        printLinkedList(newll);
    }
    public static int length(ListNode head){
        int len=0;
        ListNode ptr =head;
        while(ptr != null){
            len++;
            ptr=ptr.next;
        }
        return len;
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
