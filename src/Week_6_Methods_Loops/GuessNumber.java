package Week_6_Methods_Loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        //   int target = 50;
        int target = (int) (Math.random()*100);
        // System.out.println(target);
        System.out.println("Enter your estimation");
        int guess = sc.nextInt();
        int count = 1;
        while (guess!=target) {
            if (guess > target) {
                System.err.println("Your estimation is greater than target number.");
            } else {
                System.err.println("Your estimation is less than target number.");
            }
            System.out.println("Re-enter your estimation : ");
            guess = sc.nextInt();
            count++;
        }
        System.out.println("Your estimation is correct at " + count + " try.");
        sc.close();
    }
}
