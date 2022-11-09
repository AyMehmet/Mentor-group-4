package Week_29;

import java.util.Stack;

public class MyQueue_Reyhan {

    Stack<Integer> queue = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    void enqueue(int num){

        queue.push(num);
    }

    int dequeue(){

        while (!queue.isEmpty()){

            temp.push(queue.pop());

        }

        int removed = temp.pop();

        while (!temp.isEmpty()){

            queue.push(temp.pop());
        }

        return removed;

    }

    int peek(){

        while (!queue.isEmpty()){

            temp.push(queue.pop());

        }

        return temp.peek();

    }

    boolean isEmpty(){

        return queue.isEmpty();

    }
}
