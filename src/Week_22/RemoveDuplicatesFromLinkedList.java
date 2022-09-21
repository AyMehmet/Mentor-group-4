package Week_22;

public class RemoveDuplicatesFromLinkedList {
    /**
     * Question # 17
     * Description: Remove Duplicates From Linked List
     * Difficulty: Easy Category: Linked Lists
     * You're given the head of a Singly Linked List whose nodes are in sorted order with respect to
     * their values. Write a function that returns a modified version of the Linked List that doesn't
     * contain any nodes with duplicate values. The Linked List should be modified in place (i.e.,
     * you shouldn't create a brand-new list), and the modified Linked List should still have its
     * nodes sorted with respect to their values. Each LinkedList node has an integer value as well
     * as a next node pointing to the next node in the list or to None / null if it's the tail of the list.
     * Sample Input
     * linkedList = 1 -> 1 -> 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6 // the head node with value 1
     * Sample Output 1 -> 3 -> 4 -> 5 -> 6 // the head node with value 1
     */

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printList();
        deleteDuplicates(list.head);
        list.printList();
    }


    public static void deleteDuplicates(MyLinkedList.Node head) {
        if (head == null || head.next == null) return;
        MyLinkedList.Node slow = head;
        MyLinkedList.Node fast = head.next;
        while (fast != null) {
            if (slow.val == fast.val) {
                fast = fast.next;
                slow.next = fast;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
    }
}
