package LinkedList;

class FlattenLL {
    int val;
    Node next;
    Node child;

     FlattenLL() {
        val = 0;
        next = null;
        child = null;
    }

     FlattenLL(int data1) {
        val = data1;
        next = null;
        child = null;
    }

     FlattenLL(int data1, Node next1, Node next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}

class FlattenLLsolution {
    
    public Node flattenLinkedList(Node head) {
        if (head == null || head.next == null)  {
            return head;
        }
        flattenLinkedList(head.next);

        return mergedLists(head , head.next);

    }
    public Node mergedLists(Node head1 , Node head2){
        Node dummy = new Node(-1);
        Node ptr = dummy;
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != null && ptr2 != null){
            if (ptr1.data < ptr2.data){
                ptr.child = ptr1;
                ptr1 = ptr1.child;
            } else {
                ptr.child = ptr2;
                ptr2 = ptr2.child;
            }
            ptr = ptr.child;
        }
        if (ptr1 != null){
            ptr.child = ptr1;
        }
        if (ptr2 != null){
            ptr.child = ptr2;
        }
        return dummy.child;

    }
}
