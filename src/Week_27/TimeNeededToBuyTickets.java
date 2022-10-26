package Week_27;

import java.util.*;
import java.util.stream.Collectors;

public class TimeNeededToBuyTickets {

    public static void main(String[] args) {

        int[] tickets1 = {2, 3, 2};
        int[] tickets2 = {5, 1, 1, 1};

        System.out.println(getTimeWithQueue(tickets1, 2));
        System.out.println(getTimeWithQueue(tickets2, 0));

        System.out.println(timeRequiredToBuyWithQueue(tickets1, 2));

        System.out.println(timeRequiredToBuyFast(tickets2, 0));

        System.out.println(getTheTime1(tickets1, 2));
        System.out.println(getTheTime1(tickets2, 0));

        System.out.println(getTheTime2(tickets1, 2));
        System.out.println(getTheTime2(tickets2, 0));


    }

    public static int getTimeWithQueue(int[] tickets, int k) {
        Queue<Integer> ticketQueue = new ArrayDeque<>();

        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] == 0) {
                    continue;
                }
                if (tickets[k] == 0) {
                    break;
                }
                ticketQueue.add(tickets[i]--);
            }
        }
        return ticketQueue.size();
    }


    public static int timeRequiredToBuyWithQueue(int[] tickets, int k) {
        Queue<Integer> ticketQueue = Arrays.stream(tickets).boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        int totalTime = 0;
        while (!ticketQueue.isEmpty()) {

            int leftTicketCount = ticketQueue.poll()-1;
            totalTime++;

            if (leftTicketCount == 0){
                if (k == 0){
                    return totalTime;
                }
                else if (k > 0){
                    k--;
                }
            }
            else {
                ticketQueue.add(leftTicketCount);
                if (k > 0){
                    k--;
                }
                else if (k == 0){
                    k = ticketQueue.size() - 1;
                }
            }
        }

        return -1;
    }

    public static int timeRequiredToBuyFast(int[] tickets, int k) {
        int seconds = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] < tickets[k]) {
                seconds += tickets[i];
            } else {
                if (i <= k) {
                    seconds += tickets[k];
                } else {
                    seconds += tickets[k] - 1;
                }
            }
        }
        return seconds;

    }

    public static int getTheTime1(int[] tickets, int k) {
        int seconds = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                seconds += Math.min(tickets[k], tickets[i]);
            } else {
                seconds += Math.min(tickets[k] - 1, tickets[i]);
            }
        }

        return seconds;
    }

    public static int getTheTime2(int[] tickets, int k) {
        int seconds = 0;
        int index = 0;

        while (tickets[k] != 0) {

            if (tickets[index] != 0) {
                seconds++;
                tickets[index] -= 1;
            }

            index++;
            if (index == tickets.length) {
                index = 0;
            }
        }
        return seconds;
    }

    // TC : O(n) SC : O(n)
    static int withDeque(int[] tickets, int k) {
        int result = 0;
        Deque<int[]> deque = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            int[] person = {tickets[i], 0};
            if (i == k)
                person[1] = 1;
            deque.addLast(person);
        }

        while (!deque.isEmpty()) {
            int[] front = deque.pollFirst();
            result++;
            if (--front[0] > 0) {
                deque.addLast(front);
            }
            if (front[1] == 1 && front[0] == 0)
                return result;
        }
        return result;
    }
}
