package Week_5_If_Switch_Scan;

import java.util.Scanner;

public class Divizible {

    public static void main(String[] args) {


    /*      1. Read the user input int number from console.
            2. If number is divisible by 3 print  " Divisible by  3 "
            3. If number is divisibe by 5 print  " Divisible by 5 "
            4. If number is divisible both by 3 and 5 " Divisible by 3 and 5"
            5. If number is not divisible by 3,5 or both print " Non Divisible "

     */

        System.out.println("Please input number  : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        if (((num % 3) == 0) && ((num % 5) == 0)) { // Is it a multiple of 3 & 5?
            System.out.println("Divizible by 3 and 5 ");
            if ((num % 3) == 0) // Is it a multiple of 3?
                System.out.println("Divizible by 3");
        }if ((num % 5) == 0) // Is it a multiple of 5?
            System.out.println("Divizible by 5");
        else  System.out.println("Non Divizible"); // Not a multiple of 3 or 5
    }
}
