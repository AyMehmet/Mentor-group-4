package Week_23;

import java.util.ArrayList;
import java.util.HashSet;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next= new ListNode(5);
        listNode.next.next.next.next.next= listNode.next.next;

        System.out.println(detectCycleWithTwoPointer(listNode).val);
        System.out.println(detectCycleWithHashSet(listNode).val);
        System.out.println(detectCycleWithArrayList(listNode).val);
    }

    /*
    Best sol
     */
    static ListNode detectCycleWithTwoPointer(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                ListNode tempNode = head;

                while (tempNode != fast) {
                    fast = fast.next;
                    tempNode = tempNode.next;
                }

                return tempNode;
            }
        }

        return null;
    }

    static ListNode detectCycleWithHashSet(ListNode head) {
        ListNode node = head;
        HashSet<ListNode> set = new HashSet<>();
        while (node != null) {
            if (!set.add(node)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    /*
    Worst sol
     */
    static ListNode detectCycleWithArrayList(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ArrayList<ListNode> nodes = new ArrayList();
        ListNode currentNode = head;
        while (currentNode.next != null) {
            nodes.add(currentNode);
            currentNode = currentNode.next;

            ListNode finalCurrentNode = currentNode;
            if (nodes.stream().anyMatch(listNode -> listNode == finalCurrentNode)) {
                return finalCurrentNode;
            }
        }

        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}