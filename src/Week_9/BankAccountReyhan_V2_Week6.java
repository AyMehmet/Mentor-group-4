package Week_9;

import java.util.ArrayList;
import java.util.Scanner;

import static sun.security.jgss.GSSUtil.login;

public class BankAccountReyhan_V2_Week6 {
    public static void main(String[] args) {


        Client client1=new Client();
        Client client2=new Client();
        Client client3=new Client();
        client1.setInfo(1, "memo","m","male",123,0);
        client2.setInfo(2, "lucy","m","female",223,1000);
        client3.setInfo(3, "hira","d","female",323,100);


        ArrayList<Client>  clientDataBase= new ArrayList<>();
        clientDataBase.add(client1);
        clientDataBase.add(client2);
        clientDataBase.add(client3);

//        int balance = 100;
//        int password = 123;

        Client loggedinClient=login(clientDataBase);

//
//        System.out.println("please enter your password");
//        int currenClientid=userInput();
//        System.out.println("please enter your password");
//        int inputPassword = userInput();
//
//
//        if (!(inputPassword == password)) {
//
//            for (int i = 0; i < 3; i++) {
//                System.err.println("incorrect password");
//                System.out.println("enter your password again");
//                inputPassword = userInput();
//
//                if (inputPassword == password) {
//                    break;
//                }
//            }
//        }

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

    private static Client login(ArrayList<Client>  clientDataBase) {

        Client loggedInClient = null;
        boolean isClientFound = false;

        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();
            int a = clientDataBase.size();

            for (int i = 0; i <= clientDataBase.size() - 1; i++) {
                if (clientDataBase.get(i).client_id == inputClient_Id && clientDataBase.get(i).password == inputPassword) {
                    System.out.println("Login Succesful");
                    //currentClientindex = i;
                    loggedInClient = clientDataBase.get(i);
                    isClientFound = true;
                    break;
                }
            }
            if (!isClientFound) {
                System.out.println(" Client-Id or Password is not correct!! Try again please !!!");
            } else break;
        }
        return loggedInClient;

//        System.out.println("please enter client id");
//        int currenClientid=userInput();
//        System.out.println("please enter your password");
//        int inputPassword = userInput();
//
//
//        if (!(inputPassword == password)) {
//
//            for (int i = 0; i < 3; i++) {
//                System.err.println("incorrect password");
//                System.out.println("enter your password again");
//                inputPassword = userInput();
//
//                if (inputPassword == password) {
//                    break;
//                }
//            }
//        }
//

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





