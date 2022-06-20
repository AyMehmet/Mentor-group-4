package Week_5_If_Switch_Scan;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {


        int balance = 100;
        int withdraw;
        int password = 123;

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your password : ");
        int userinputpassword = scanner.nextInt();

        if (userinputpassword == password) {

            System.out.println(" 1 : deposit ");
            System.out.println(" 2 : withdraw");
            System.out.println(" 3 : exit");
            System.out.println(" please enter your selection");

            int action = scanner.nextInt();


            switch (action) {

                case 1:
                    System.out.println("please enter deposit  amount");
                    int deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("your new balance is =" + balance);
                    break;
                case 2:
                    System.out.println("please enter withdraw amount");
                    withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        System.out.println("you withdrew =" + withdraw);
                        balance = balance - withdraw;
                        System.out.println("your new balance is =" + balance);
                    } else if (withdraw > balance) {
                        System.out.println("your balance is not enough");
                    }
                    break;
                default:
                    System.out.println("default option");
            }
        }
        else System.out.println("wrong password");
        System.out.println("exiting");
    }
}
