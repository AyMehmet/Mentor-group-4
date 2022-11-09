package Week_29;

import java.util.Stack;

/*
232. Implement Queue using Stacks

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

    void enqueue(int num) Pushes element num to the back of the queue.
    int dequeue() Removes the element from the front of the queue and returns it.
    int peek() Returns the element at the front of the queue.
    boolean empty() Returns true if the queue is empty, false otherwise.

Notes:
    You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 */

class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());    // prints 1
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.isEmpty());    // prints false
        q.enqueue(5);
        System.out.println(q.dequeue());    // prints 2
        q.enqueue(6);
        System.out.println(q.peek());       // prints 3
    }
}


/*
The idea is to implement the queue’s enqueue operation so that the first entered element always ends up at the top of the stack.
To achieve this, we need an additional stack.

To enqueue an item into the queue, first move all elements from the first stack to the second stack,
push the item into the first stack, and finally move all elements back to the first stack.
This ensures that the new item lies at the bottom of the stack and hence would be the last one to be removed.
To dequeue an item from the queue, return the top item from the first stack.


(By making deQueue operation costly): In en-queue operation, the new element is entered at the top of stack1.
In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and finally top of stack2 is returned.

enQueue(int x)
  1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue()
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
Here time complexity will be O(n)
 */
public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int num) {
        stack1.push(num);
    }

    public int dequeue() {
        peek();
        return stack2.pop();
    }

    public int peek() {
        if (stack2.empty())
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.empty() && stack2.empty();
    }
}

/*
Queue can also be implemented using one user stack and one Function Call Stack.
recursion (or Function Call Stack) is used to implement queue using only one user defined stack.

enQueue(x)
  1) Push x to stack1.

deQueue:
  1) If stack1 is empty then error.
  2) If stack1 has only one element then return it.
  3) Recursively pop everything from the stack1, store the popped item
    in a variable res,  push the res back to stack1 and return res

    The step 3 makes sure that the last popped item is always returned and since the recursion stops when there is only
    one item in stack1 (step 2), we get the last element of stack1 in deQueue() and all other items are pushed back in step
 */



/*
(By making enQueue operation costly): This method makes sure that oldest entered element is always at the top of stack 1,
so that deQueue operation just pops from stack1. To put the element at top of stack1, stack2 is used.

    enQueue(int x):

        While stack1 is not empty, push everything from stack1 to stack2.
        Push x to stack1 (assuming size of stacks is unlimited).
        Push everything back to stack1.

    Here time complexity will be O(n)

    deQueue():

        If stack1 is empty then error
        Pop an item from stack1 and return it

    Here time complexity will be O(1)
 */

class MyQueue2 {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void enQueue(int num) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new item into s1
        s1.push(num);

        // Push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue an item from the queue
    int deQueue() {
        // if first stack is empty
        if (s1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        // Return top of s1
        return s1.pop();
    }


}
