package Week_22;

public class MyLinkedList {
    static class Node {
        int val;
        Node next;


        Node(int val) {
            this.val = val;
        }
    }
    
    Node head;
    Node tail;

    public Node add(int value){
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return head;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " => ");
            current = current.next;
        }
        System.out.println();
    }
}
