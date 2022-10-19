package Week_25;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists_LC_easy {
    /*
    160. Intersection of Two Linked Lists

    Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:

The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

    intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
    listA - The first linked list.
    listB - The second linked list.
    skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
    skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.

The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.



Example 1:

Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.

Example 2:

Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.

Example 3:

Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.



Constraints:

    The number of nodes of listA is in the m.
    The number of nodes of listB is in the n.
    1 <= m, n <= 3 * 104
    1 <= Node.val <= 105
    0 <= skipA < m
    0 <= skipB < n
    intersectVal is 0 if listA and listB do not intersect.
    intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.


Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?

leetcode link : https://leetcode.com/problems/intersection-of-two-linked-lists/
     */

    public static void main(String[] args) {

    }

    public ListNode withSetTwoLoop(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        Set<ListNode> set = new HashSet<>();
        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != null) {
            set.add(currentA);
            currentA = currentA.next;
        }
        while (currentB != null) {
            if (set.contains(currentB)) return currentB;
            currentB = currentB.next;
        }

        return null;
    }

    public ListNode withSetOneLoop(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        HashSet<ListNode> setA = new HashSet<>();
        HashSet<ListNode> setB = new HashSet<>();
        ListNode cA = headA;
        ListNode cB = headB;
        while (cA != null || cB != null) {
            setA.add(cA);
            setB.add(cB);
            if (setA.contains(cB)) return cB;
            if (setB.contains(cA)) return cA;
            if (cA != null) cA = cA.next;
            if (cB != null) cB = cB.next;
        }
        return null;
    }

    /*
    One of the solution is that we can find the length of both the linked list .
After finding length, we can skip the no. of needs from the head in the larger size linked list.

For example there are two linked list 6 is the intersection node.

A 4 -> 5 ->
6 -> 7 -> 9 -> X
B 1 -> 2 -> 3 -> 4->

size of LL A = 5 and size of LL B = 7
hence there are two more extra nodes in B
Hence diff = 7 - 5 = 2
If we will start from Node 3 in LL B then after equal no. of passes we will reach to the common node
     */

    public ListNode withFindingLength(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int sizeA = length(headA), sizeB = length(headB);
        ListNode currentA = headA, currentB = headB;

        if (sizeA > sizeB) {
            int diff = sizeA - sizeB;
            for (int i = 1; i <= diff; i++) {
                currentA = currentA.next;
            }
        } else {
            int diff = sizeB - sizeA;
            for (int i = 1; i <= diff; i++) {
                currentB = currentB.next;
            }
        }

        while (currentA != null && currentB != null) {
            if (currentA == currentB) return currentA;
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }


    /*
    We can use two iterations to do that. In the first iteration, we will reset the pointer of one linkedlist to the head of another linkedlist after it reaches the tail node. In the second iteration, we will move two pointers until they points to the same node. Our operations in first iteration will help us counteract the difference. So if two linkedlist intersects, the meeting point in second iteration must be the intersection point. If the two linked lists have no intersection at all, then the meeting pointer in second iteration must be the tail node of both lists, which is null

    https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/1092898/JS-Python-Java-C%2B%2B-or-Easy-O(1)-Extra-Space-Solution-w-Visual-Explanation
    In order to solve this problem with only O(1) extra space, we'll need to find another way to align the two linked lists. More importantly, we need to find a way to line up the ends of the two lists. And the easiest way to do that is to concatenate them in opposite orders, A+B and B+A. This way, the ends of the two original lists will align on the second half of each merged list.

Visual 1

Visual 2

Then we just need to check if at some point the two merged lists are pointing to the same node. In fact, even if the two merged lists don't intersect, the value of a and b will be the same (null) when we come to the end of the merged lists, so we can use that as our exit condition.
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //boundary check
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while (a != b) {
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
