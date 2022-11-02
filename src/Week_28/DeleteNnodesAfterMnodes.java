package Week_28;

public class DeleteNnodesAfterMnodes {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node node1 = new Node(8);
        Node node2 = new Node(3);
        Node node3 = new Node(6);
        Node node4 = new Node(3);
        Node node5 = new Node(8);
        Node node6 = new Node(1);
        head1.next = node1;
        head1.next.next = node2;
        head1.next.next.next = node3;
        head1.next.next.next.next = node4;
        head1.next.next.next.next.next = node5;
        head1.next.next.next.next.next.next = node6;

        head1.print();
        deleteNodes(head1, 3,3);
        head1.print();
    }

    public static Node deleteNodes(Node head, int m, int n) {
        Node currentNode = head;
        Node lastMNode = head;
        while (currentNode != null) {
            // initialize mCount to m and nCount to n
            int mCount = m, nCount = n;
            // traverse m nodes
            while (currentNode != null && mCount != 0) {
                lastMNode = currentNode;
                currentNode = currentNode.next;
                mCount--;
            }
            // traverse n nodes
            while (currentNode != null && nCount != 0) {
                currentNode = currentNode.next;
                nCount--;
            }
            // delete n nodes
            lastMNode.next = currentNode;
        }
        return head;
    }
    /*  Above solution time&space complexity
    Time Complexity: O(N). Here, N is the length of the linked list pointed by head. We traverse over the linked list only once.
    Space Complexity: O(1). We use constant extra space to store pointers like lastMNode and currentNode.
     */

    public static Node deleteNodes2(Node head, int m, int n) {
        Node pointer1 = head;
        Node pointer2;
        while (pointer1 != null) {
            for (int i = 1; i < m && pointer1.next != null; i++) { //go in blue
                pointer1 = pointer1.next;
            }
            pointer2 = pointer1.next;                                  //p2 to red
            for (int i = 1; i <= n && pointer2 != null; i++) {          //go in red
                pointer2 = pointer2.next;
            }
            pointer1.next = pointer2;                                  //make connection
            pointer1 = pointer2;                                       //come together
        }
        return head;
    }
    /*  Above solution time&space complexity
    Time Complexity: O(N). Here, N is the length of the linked list pointed by head. We traverse over the linked list only once.
    Space Complexity: O(1). We use constant extra space to store pointers like lastMNode and currentNode.
     */
}

class Node {

    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    public void print() {
        Node current = this;

        while (current != null) {
            System.out.print(current);
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return ""+value +"->";
    }
}
