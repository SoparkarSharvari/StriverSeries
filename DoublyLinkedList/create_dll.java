package DoublyLinkedList;

public class create_dll {
    

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.prev = head;
        head.next.next.prev = head.next;
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next.prev = head.next.next.next;

        addNode(head,2,33);
        printLinkedList(head);
        deleteNode(head, 3);
        printLinkedList(head);
        printLinkedList(reverseDLL(head));


    }
    public static void addNode(Node head_ref, int pos, int data)
	{
		Node temp = new Node(data);
        Node ptr = head_ref;
        Node prev = ptr;
        int i=0;
        while(i != pos){
            prev=ptr;
            ptr = ptr.next;
            i++;
        }
        temp.next = ptr;
        if (ptr != null) {
            ptr.prev = temp;
        }
        prev.next =temp;
        temp.prev=prev;
	}
   
    public static void deleteNode(Node head, int pos) {
        Node ptr = head;
        Node prev =null;
        int i=1;
        while(i <= pos){
            prev=ptr;
            ptr=ptr.next;
            i++;
        }
        ptr.prev=prev.prev;
        prev.prev.next=ptr;
    }

    public static void printLinkedList(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node reverseDLL(Node  head){
       if(head == null || head.next == null){
        return head;
       }
       Node ptr,prev;
       ptr = head;
       prev=null;
       while(ptr != null){
        prev=ptr.prev;
        ptr.prev=ptr.next;
        ptr.next = prev;
        ptr=ptr.prev;
       }
       return prev.prev;
    }

}
