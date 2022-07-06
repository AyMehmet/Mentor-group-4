package Week_6_Methods_Loops;

import Week_10.Client;

import java.util.Scanner;

public class BankAccount1 {
    public static int balance=0;
    public  static int password=123;

    public static void main(String[] args) {


        //int balance = 0;
        int withdraw;
        int wrongpasswordcounter = 0;
        //int password = 123;

       Scanner scanner = new Scanner(System.in);
        //
        System.out.println("please enter your password : ");
        //int userinputpassword = scanner.nextInt();
        int userinputpassword = scanner.nextInt();
        while (wrongpasswordcounter <4) {
            if (userinputpassword == password) {
                menu();
                int action = scanner.nextInt();
                while (action != 3) {

                    switch (action) {
                        case 1:
                            System.out.println("please enter withdraw ammount");
                        //    deposit(scanner.nextInt());
                            break;

//

                        case 2:
                            System.out.println("please enter withdraw ammount");
                            withdraw(scanner.nextInt());
                            break;

                    }
                    menu();
                    action = scanner.nextInt();
                }
                break;
            }
            else {
                wrongpasswordcounter++;
                System.out.println("wrongpassword");
                if(wrongpasswordcounter<4) {
                    System.out.println(3 - wrongpasswordcounter + " try left ");
                    userinputpassword = scanner.nextInt();
                }
            }
        }
        if (wrongpasswordcounter==3)
        System.out.println("Your account is locked , Exiting");
        System.out.println("Exiting , have good day");
        scanner.close();
    }

    public static void menu(){
        System.out.println(" 1 : deposit ");
        System.out.println(" 2 : withdraw");
        System.out.println(" 3 : exit");
        System.out.println(" please enter your selection");
    }

    public static void deposit(Client deposit){
   //     balance = balance + deposit;
        System.out.println("your new balance is =" + balance);

    }
    public static void withdraw(int withdraw){
        if (withdraw <= balance) {
            System.out.println("you withdrawed =" + withdraw);
            balance = balance - withdraw;
            System.out.println("your new balance is =" + balance);
        } else if (withdraw > balance) {
            System.out.println("your balance is not enough");
        }
    }

//    public static int readUserInput(){
//        //Scanner scanner=new Scanner(System.in);
//        //int number=scanner.nextInt();
//        //scanner.close();
//        return scanner.nextInt();
//    }
}
