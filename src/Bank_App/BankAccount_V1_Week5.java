package Bank_App;

import java.util.Scanner;

public class BankAccount_V1_Week5 {

    public static void main(String[] args) {


        int balance = 100;
        int withdraw;
        int pasword = 123;

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your pasword : ");
        int userinputpassword = scanner.nextInt();

        if (userinputpassword == pasword) {

            System.out.println(" 1 : deposit ");
            System.out.println(" 2 : withdraw");
            System.out.println(" 3 : exit");
            System.out.println(" please enter your selection");

            int action = scanner.nextInt();


            switch (action) {

                case 1:
                    System.out.println("please enter diposit  ammount");
                    int deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("your new balance is =" + balance);
                    break;
                case 2:
                    System.out.println("please enter withdraw ammount");
                    withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        System.out.println("you withdrawed =" + withdraw);
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
        else System.out.println("wrongpassword");
        System.out.println("exiting");
    }
}
