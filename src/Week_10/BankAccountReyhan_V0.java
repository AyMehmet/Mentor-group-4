package Week_10;

import java.util.Scanner;

public class BankAccountReyhan_V0 {

    public static void main(String[] args) {


        int balance = 100;
        int password = 123;

        System.out.println("please enter your password");
        int inputPassword = userInput();
        if (!(inputPassword == password)) {

            for (int i = 0; i < 3; i++) {
                System.err.println("incorrect password");
                System.out.println("enter your password again");
                inputPassword = userInput();

                if (inputPassword == password) {
                    break;
                }
            }
        }

        if (inputPassword == password) {

            for (int i = 0; i < 3; ) {

                System.out.println("1 : deposit");
                System.out.println("2 : withdraw");
                System.out.println("3 : exit");
                System.out.println(" please enter your selection");

                int action = userInput();
                switch (action) {

                    case 1:

                        balance += deposit();
                        System.out.println("your new balance is " + balance);
                        break;

                    case 2:

                        int withdraw = withdraw();

                        if (withdraw <= balance) {

                            System.out.println("you withdrawed " + withdraw);
                            balance -= withdraw;
                            System.out.println("your new balance is " + balance);

                        } else {
                            System.err.println("your balance is not enough");
                        }
                        break;

                    default:
                        System.out.println("you have exited the menu");
                        return;

                }
           }


        } else {
            System.err.println("wrong password");
            System.out.println("exiting");
        }

    }

    public static int userInput() {

        int userInput = new Scanner(System.in).nextInt();
        return userInput;

    }

    public static int deposit() {

        System.out.println("please enter deposit amount");
        int deposit = userInput();
        return deposit;

    }

    public static int withdraw() {

        System.out.println("please enter withdraw amount");
        int withdraw = userInput();
        return withdraw;

    }

}





