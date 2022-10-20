package Week_26;

import java.util.Stack;

public class isPolindromeNaran {

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(2);
        Node four = new Node(1);
        Node five = new Node(5);


        one.next=two;
        two.next=three;
        three.next= four;
        four.next=five;
        five.next=null;


        boolean condition = isPalindrome(one);
        System.out.println(condition);

    }

    private static boolean isPalindrome(Node head) {

        Node current=head;

        Stack<Integer> stack = new Stack<>();

        //first, we iterate each node of the list, and push them into stack
        while(current != null){
            stack.push(current.data);
            current=current.next;
        }

        //revisit the stack, by iterating the list again.
        //if stack ends up empty, return true

        current=head;

        while(current != null){

            if(current.data!=stack.pop()){

                return false;
            }
            current=current.next;
        }
        return true;
    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }

    }

}
