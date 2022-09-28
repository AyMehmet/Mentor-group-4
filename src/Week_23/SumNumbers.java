package Week_23;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumNumbers {

    public static void main(String[] args) {
        System.out.println(sumofNumbers1(2,4));
        System.out.println(sumofNumbers1(2,4));
        System.out.println(sumofNumbers2(2,4));
    }

    private static int sumofNumbers(int num1, int num2) {
        int result = 0;
        if (num1<num2) {
            result = num1 + num2 + sumofNumbers(num1 + 1, num2 - 1);
        }
        return result;


    }

    private static int sumofNumbers1(int num1, int num2) {
        return IntStream.rangeClosed(num1,num2).sum();
    }

    private static int sumofNumbers2(int num1, int num2) {
        return IntStream.rangeClosed(num1,num2).reduce(0, (a,b)->a+b);
    }


}
