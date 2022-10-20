package Week_26;

import java.util.Stack;

public class LucyisPalindrom {

    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(7);
        Node n3 = new Node(7);
        Node n4 = new Node(3);
        n1.pointer = n2;
        n2.pointer = n3;
        n3.pointer = n4;

        boolean status = isPalindrome(n1);
        if (status == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
        static boolean isPalindrome (Node head){

            // first traverse of the list
            Node next = head;
            boolean isPal = true;
            Stack<Integer> stack1 = new Stack<Integer>();


            // traverse the list and adding the elements
            while (next != null) {
                stack1.push(next.data);
                next = next.pointer;
            }

            // Iterate it second time and checking the elements in the stack
            while (head != null) {
                int i = stack1.pop();
                if (head.data == i) {
                    isPal = true;

                } else {
                    isPal = false;
                    break;
                }

                head = head.pointer;
            }

            return true;

        }
    }
        class  Node {
            int data;
            Node pointer;

            Node(int d) {
                pointer = null;
                data = d;
            }


        }


