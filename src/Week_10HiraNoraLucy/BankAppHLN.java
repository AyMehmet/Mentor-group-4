package Week_10HiraNoraLucy;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAppHLN {


    static Client login(ArrayList<Client> clientDataBase) {

        Client loggedInClient = null;
        boolean isClientFound = false;

        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();

            for (int i = 0; i <= clientDataBase.size() - 1; i++) {
                if (clientDataBase.get(i).client_id == inputClient_Id && clientDataBase.get(i).password == inputPassword) {
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


    public static int userInput() {

        int userInput = new Scanner(System.in).nextInt();
        return userInput;

    }
    public static int deposit(Client client) {
        System.out.println("Your balance is: " + client.balance);
        System.out.println("please enter deposit amount");
        int deposit = userInput();
        return deposit;

    }
    public static int withdraw(Client client) {
        System.out.println("Your balance is: " + client.balance);
        System.out.println("please enter withdraw amount");
        int withdraw = userInput();
        return withdraw;

    }
    public static void transfer(Client client){
        System.out.println("Your balance is: " + client.balance);
        System.out.println("Enter the recipient id: ");
        int id = userInput();

        System.out.println("How much do you want to transfer: ");
        int amount = userInput();

        for (Client each : Datas.getClientData()) {
            if(id == each.client_id){
                each.balance+=amount;
                client.balance-=amount;
                System.out.println("Sender balance = " + client.balance);
                System.out.println("Recipient balance = " +each.balance);
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


