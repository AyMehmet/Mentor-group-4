package Week_26;

import java.util.Stack;

public class LinkedListPalindrome {

    static ListNode head;

    public static void main(String[] args) {
        ListNode linkList = new ListNode(1);
        head=linkList;
        linkList.add(8);
        linkList.add(3);
       // linkList.add(6);
        linkList.add(3);
        linkList.add(8);
        linkList.add(1);
        System.out.println(isPalindromeWithStack(head));
        System.out.println(isPalindromeWithTwoPointer(head));

    }

    /*
   S
     */

    public static boolean isPalindromeWithStack(ListNode head) {
        ListNode current = head;
        boolean ispalindrome = true;
        Stack<Integer> stack = new Stack<Integer>();
        while (current != null) {
            stack.push(current.value);
            current = current.next;
        }

        while (head != null) {

            int i = stack.pop();
            if (head.value == i) {
                ispalindrome = true;
            } else {
                ispalindrome = false;
                break;
            }
            head = head.next;
        }
        return ispalindrome;
    }

    public static boolean isPalindromeWithTwoPointer(ListNode head) {

        ListNode slow = head, fast = head, prev, temp;

        // find middle point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse 2nd half of linked list
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

// palindrome check : first half and second half
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.value != slow.value) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }



}


