package Week_29;

public class Queue_Reyhan_Imp {

    public static void main(String[] args) {

        MyQueue_Reyhan myQueue = new MyQueue_Reyhan();

        myQueue.enqueue(1);
        myQueue.enqueue(2);

        System.out.println(myQueue.dequeue()); // 1

        myQueue.enqueue(3);
        myQueue.enqueue(4);

        System.out.println(myQueue.isEmpty()); // false

        myQueue.enqueue(5);

        System.out.println(myQueue.dequeue()); // 2

        myQueue.enqueue(6);

        System.out.println(myQueue.peek()); //

    }
}
