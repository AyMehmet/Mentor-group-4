package Week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountReyhan_V3 {

    public static void main(String[] args) {

//        Client[] clientDatabase=new Client[10];
//
//        Client client1 = new Client(1, "memo", "m", 'm', 0, 123);
//        Client client2 = new Client(2, "Lucy", "G", 'f', 100, 223);
//        Client client3 = new Client(3, "Kyong", "K", 'f', 200, 323);
//
//        clientDataBase[0] = client1;
//        clientDataBase[1] = client2;
//        clientDataBase[2] = client3;

        ArrayList<Client> clientDataBase = new ArrayList<>();

        clientDataBase.add(new Client(1, "memo", "m", 'm', 0, 123));
        clientDataBase.add(new Client(2, "Lucy", "G", 'f', 100, 223));
        clientDataBase.add(new Client(3, "Kyong", "K", 'f', 200, 323));


        Client tempClient = null;
        //currentClientindex = 0;
        Boolean isClientFound = false;
        Client loggedinClient=login(clientDataBase);

//        int balance = 100;
//        int password = 123;


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

//            System.out.println("1 : deposit");
//            System.out.println("2 : withdraw");
//            System.out.println("3 : transfer money");
//            System.out.println("4 : show user information");
//            System.out.println("5 : exit");
//            System.out.println(" please enter your selection");

            int action = menu();
            switch (action) {
                case 1:
                    deposit(loggedinClient);
//                    int deposit = deposit();
//                    tempClient.balance += deposit;
//                    clientDataBase.set(currentClientindex, tempClient);
//                    //clientDataBase[currentClientindex].balance += deposit();
//                    System.out.println("your new balance is " + clientDataBase.get(currentClientindex));
                       break;
                case 2:
                    withdraw(loggedinClient);
//                    int withdraw = withdraw();
//                    if (withdraw <= tempClient.balance) {
//                        System.out.println("you withdrawed " + withdraw);
//                        tempClient.balance -= withdraw;
//                        //clientDataBase.set(currentClientindex, tempClient);
//                        System.out.println("your new balance is " + tempClient.balance);
//                    } else {
//                        System.err.println("your balance is not enough");
//                    }
                    break;
                case 3:
                    transfer(loggedinClient,findClient(clientDataBase));

//                    System.out.println("Enter Client-ID to be transfered ");
//                    int clientId_toTransfer = userInput();
//                    Client tobetransferedClient=findClient(clientId_toTransfer, clientDataBase);
//                        if (tobetransferedClient.equals(null)) {
//                            System.out.println("Client to be transfered doesnt exit");
//                        }
//                         else{
//                            System.out.println("Enter amount to be transfered :");
//                            transfer(loggedinClient,tobetransferedClient,userInput());
//                        }
//


//                    System.out.println("Enter amount to be transfered ");
//                    int transferamount = transfer();
//                    if (transferamount <= tempClient.balance) {
//                        for (i = 0; i <= clientDataBase.size() - 1; i++) {
//                            if (clientDataBase.get(i).client_Id == clientId_toTransfer) {
//                                clientDataBase.get(i).balance += transferamount;
//                                tempClient.balance -= transferamount;
//                                System.out.println("you transfered " + transferamount);
//                                System.out.println("your new balance is " + tempClient.balance);
//                                //clientDataBase[currentClientindex].balance -= transferamount;
//                                //clientDataBase[currentClientindex] = tempClient;
//                                isClientFound = true;
//                                break;
//                            }
//                        }
//                        if (!isClientFound) {
//                            System.out.println(" Client-Id  to be transfered is not found");
//                        } else isClientFound = false;
//
//                    } else {
//                        System.out.println("your balance is not enough");
//                    }
                    break;

                case 4:
                    System.out.println(loggedinClient);
                    break;
                default:
                    System.out.println("you have exited the menu");
                    return;

            }
        }
    }


    public static Client login( ArrayList<Client> clientDataBase) {

        Client loggedInClient = null;
        boolean isClientFound = false;

        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();


            for (int i = 0; i <= clientDataBase.size() - 1; i++) {
                if (clientDataBase.get(i).client_Id == inputClient_Id && clientDataBase.get(i).password == inputPassword) {
                    System.out.println("Login Succesful");

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
    }

   public static Client findClient(int client_id, ArrayList<Client> clientDataBase){
        for (Client eachClient:clientDataBase){
            if (eachClient.client_Id==client_id){
                return eachClient;
            }
        }
        return null;
   }

    public static Client findClient( ArrayList<Client> clientDataBase){

        System.out.println("Enter Client-ID to be transfered ");
        int clientId_toTransfer = userInput();
        Client tobetransferedClient=null;

        for (Client eachClient:clientDataBase){
            if (eachClient.client_Id==clientId_toTransfer){
                tobetransferedClient=eachClient;
                break;
            }
        }
         return tobetransferedClient;
    }

    public static int userInput() {
        int userInput = new Scanner(System.in).nextInt();
        return userInput;
    }

    public static void deposit(Client loggedinClient) {
        System.out.println("please enter deposit amount");
        //int deposit = userInput();
        loggedinClient.balance+=userInput();
        System.out.println("Your current balance is =" + loggedinClient.balance);
        //return deposit;
    }

    public static void  withdraw(Client loggedinClient) {
        System.out.println("please enter withdraw amount");
        int withdraw = userInput();
        if (withdraw <= loggedinClient.balance) {
            System.out.println("you withdrawed " + withdraw);
            loggedinClient.balance -= withdraw;
            System.out.println("your new balance is " + loggedinClient.balance);
        } else {
            System.err.println("your balance is not enough");
        }
    }

    public static void transfer(Client loggedinClient, Client transferedClient, int transferAmount) {

        if (transferAmount <= loggedinClient.balance) {
            transferedClient.balance += transferAmount;
            loggedinClient.balance -= transferAmount;
            System.out.println("you transfered " + transferAmount);
            System.out.println("your new balance is " + loggedinClient.balance);
        } else {
            System.out.println("your balance is not enough");
        }
    }

        public static void transfer(Client loggedinClient, Client transferedClient) {

            if (transferedClient.equals(null)) {
                System.out.println("Client to be transfered doesnt exit");
                return;
            } else {

                System.out.println("Enter transfer amount :");
                int transferAmount = userInput();
                if (transferAmount <= loggedinClient.balance) {
                    transferedClient.balance += transferAmount;
                    loggedinClient.balance -= transferAmount;
                    System.out.println("you transfered " + transferAmount);
                    System.out.println("your new balance is " + loggedinClient.balance);
                } else {
                    System.out.println("your balance is not enough");
                }
            }
        }

    public static int  menu (){

        System.out.println("1 : deposit");
        System.out.println("2 : withdraw");
        System.out.println("3 : transfer money");
        System.out.println("4 : show user information");
        System.out.println("5 : exit");
        System.out.println(" please enter your selection");
        return userInput();

    }
}





