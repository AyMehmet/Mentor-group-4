package Week_27;



public class TicketTask_Reyhan {

    public static void main(String[] args) {

    }

    public static int timeTaken(int[] tickets, int k) {

        int countTime = 0;

        while (true) {

            for (int i = 0; i < tickets.length; i++) {

                if (tickets[k] == 0) {
                    return countTime;
                }

                if (tickets[i] != 0) {
                    tickets[i] = tickets[i] - 1;
                    countTime++;
                }
            }
        }
    }

    public static int timeTaken2(int[] tickets, int k) {

        MyQueue<Integer> queue = new MyQueue<>();

        for (int ticket : tickets) {
            queue.enqueue(ticket);
        }

        int count = 0;
        int index = 0;

        QNode<Integer> current = queue.front;

        while (!queue.isEmpty()) {

            if (current.value - 1 == 0 && index == k) {
                return ++count;
            }
            if (current.value != 0) {

                current.value = current.value - 1;
                count++;
            }

            if (index + 1 == tickets.length) {
                index = 0;
            } else {
                index++;
            }

            if (current.next == null) {
                current = queue.front;
            } else {
                current = current.next;
            }
        }

        return count;
    }
}
