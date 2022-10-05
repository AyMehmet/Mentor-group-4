package Week_24;

import java.util.Stack;

public class FindGreatest_Reyhan {

    public static void main(String[] args) {

        int[] arr = { 10, 4, 6, 3, 5 };
        find(arr);

    }

    public static void find(int[] array) {


        Stack<Integer> stack = new Stack<>();

        for (int each : array) {

            if (stack.isEmpty()) {
                stack.push(each);
                continue;
            }

            if (stack.peek() <= each) stack.pop();

            stack.push(each);

        }

        stack.forEach(System.out::println);

    }
}
