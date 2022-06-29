package Week_9;

import java.util.Scanner;

public class BankAccountReyhan_V1 {

    public static void main(String[] args) {


        Client[] clientDataBase = new Client[10];

        Client client1 = new Client(1, "memo", "m", 'm', 0, 123);
        Client client2 = new Client(2, "Lucy", "G", 'f', 100, 223);
        Client client3 = new Client(3, "Kyong", "K", 'f', 200, 323);

        clientDataBase[0] = client1;
        clientDataBase[1] = client2;
        clientDataBase[2] = client3;

        Client tempClient = null;
        int currentClientindex = 0;
        Boolean isClientFound = false;


//        int balance = 100;
//        int password = 123;


        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();
            int a=clientDataBase.length;

            for (int i = 0; i <= 2 - 1; i++) {
                if (clientDataBase[i].client_Id == inputClient_Id && clientDataBase[i].password == inputPassword) {
                    System.out.println("Login Succesful");
                    currentClientindex = i;
                    tempClient = clientDataBase[i];
                    isClientFound = true;
                    break;
                }
            }
            if (!isClientFound) {
                System.out.println(" Client-Id or Password is not correct!! Try again please !!!");
            } else {
                isClientFound = false;
                break;
            }
        }


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
//        if (inputPassword == password) {

            for (int i = 0; i < 5; ) {

                System.out.println("1 : deposit");
                System.out.println("2 : withdraw");
                System.out.println("3 : transfer money");
                System.out.println("4 : show user information");
                System.out.println("5 : exit");
                System.out.println(" please enter your selection");

                int action = userInput();
                switch (action) {
                    case 1:
                        int deposit=deposit();
                        tempClient.balance += deposit;
                        clientDataBase[currentClientindex] = tempClient;
                        //clientDataBase[currentClientindex].balance += deposit();
                        System.out.println("your new balance is " + clientDataBase[currentClientindex]);
                        break;
                    case 2:
                        int withdraw = withdraw();
                        if (withdraw <= tempClient.balance) {
                            System.out.println("you withdrawed " + withdraw);
                            tempClient.balance -= withdraw;
                            clientDataBase[currentClientindex] = tempClient;
                            System.out.println("your new balance is " + tempClient.balance);
                        } else {
                            System.err.println("your balance is not enough");
                        }
                        break;
                    case 3:
                        System.out.println("Enter Client-ID to be made transfer ");
                        int clientId_toTransfer = userInput();
                        int transferamount = transfer();
                        if (transferamount <= tempClient.balance) {
                            for (i = 0; i <= clientDataBase.length - 1; i++) {
                                if (clientDataBase[i].client_Id == clientId_toTransfer) {
                                    clientDataBase[i].balance += transferamount;
                                    tempClient.balance -= transferamount;
                                    System.out.println("you transfered " + transferamount);
                                    System.out.println("your new balance is " + tempClient.balance);
                                    //clientDataBase[currentClientindex].balance -= transferamount;
                                    //clientDataBase[currentClientindex] = tempClient;
                                    isClientFound = true;
                                    break;
                                }
                            }
                            if (!isClientFound) {
                                System.out.println(" Client-Id  to be transfered is not found");
                            } else isClientFound = false;

                        } else {
                            System.out.println("your balance is not enough");
                        }
                        break;

                    case 4:
                        tempClient.toString();
                        break;

                    default:
                        System.out.println("you have exited the menu");
                        return;

                }
            }

//        } else {
//            System.err.println("wrong password");
//            System.out.println("exiting");
//        }

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

    public static int transfer() {
        System.out.println("please enter withdraw amount");
        int withdraw = userInput();
        return withdraw;

    }

}





