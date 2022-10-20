package Week_26.Queue;

public class QNode<T> {
   T value;
   QNode<T> next;

    public QNode(T value) {
        this.value = value;
    }

}
