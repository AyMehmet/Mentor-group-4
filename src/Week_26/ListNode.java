package Week_26;

import Week_22.MyLinkedList;

class ListNode {
    int value;
    ListNode next;

    ListNode(int x) {
        value = x;
        next = null;
    }

    ListNode head;
    ListNode tail;

    public ListNode add(int value){
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return head;
        }
       ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
        return head;
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println();
    }
}
