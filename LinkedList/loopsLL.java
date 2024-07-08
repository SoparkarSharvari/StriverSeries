package LinkedList;

public class loopsLL {
    public static void main(String[] args) {
        // Create a sample linked list with a loop
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        Node head = node1;

        // Detect the loop in the linked list
        int loopStartNode = firstNode(head);

        if (loopStartNode != 0) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
    
    public static int firstNode(Node head) {
        Node slow = head;
        Node fast = head;
        int l1=0,d;
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected, now find the length of the loop
                int loopLength = 1;
                Node current = slow;
                while (current.next != slow) {
                    current = current.next;
                    loopLength++;
                }
                return loopLength; // Length of the cycle
            }
        }
        return 0;
    }
}
