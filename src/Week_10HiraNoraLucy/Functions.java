package Week_10HiraNoraLucy;

import java.util.ArrayList;
import java.util.Scanner;

public class Functions {

    public static Week_10_reyhanKyoungGulcin.Client login(ArrayList<Week_10_reyhanKyoungGulcin.Client> clientDataBase) {

        Week_10_reyhanKyoungGulcin.Client loggedInClient = null;
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

    public static void deposit(Week_10_reyhanKyoungGulcin.Client loggedInClient) {

        System.out.println("please enter deposit amount");
        int depositAmount = userInput();
        loggedInClient.balance += depositAmount;
        System.out.println("your new balance is " + loggedInClient.balance);


    }

    public static void withdraw(Week_10_reyhanKyoungGulcin.Client loggedInClient) {

        System.out.println("please enter withdraw amount");
        int withdrawAmount = userInput();

        if (loggedInClient.balance >= withdrawAmount) {
            loggedInClient.balance -= withdrawAmount;
            System.out.println("you withdrew " + withdrawAmount);
            System.out.println("your new balance is " + loggedInClient.balance);
        } else {
            System.out.println("your balance is not enough");
        }

    }

    public static void showClientInfo(Week_10_reyhanKyoungGulcin.Client loggedInClient) {

        System.out.println("user information: ");
        System.out.println("client id: " + loggedInClient.client_id);
        System.out.println("firstname: " + loggedInClient.firstname);
        System.out.println("lastname: " + loggedInClient.lastName);
        System.out.println("gender: " + loggedInClient.gender);
        System.out.println("balance: " + loggedInClient.balance);
    }


    public static void transfer(Week_10_reyhanKyoungGulcin.Client loggedInClient) {

        Week_10_reyhanKyoungGulcin.Client transferClient = new Week_10_reyhanKyoungGulcin.Client(0, null, null, null, 0, 0);
        System.out.println("enter the id of the client you want to transfer money");
        int enteredID = userInput();
        boolean validID = false;

        while (true) {

            for (Week_10_reyhanKyoungGulcin.Client each : Datas.getClientData()) {
                if (each.client_id == enteredID) {
                    validID = true;
                    transferClient = new Week_10_reyhanKyoungGulcin.Client(enteredID, each.firstname, each.lastName, each.gender, each.password, each.balance);
                    break;
                }
            }

            if (validID) {
                break;
            }

            System.out.println("invalid user id, please enter again");
            enteredID = userInput();

        }

        System.out.println("enter the amount you would like to transfer");
        int amount = userInput();
        while (loggedInClient.balance < amount) {

            System.out.println("your balance is not enough");
            System.out.println("please enter a new amount(1), or go back to the menu(2)");
            int option = userInput();
            if (option == 1) {
                System.out.println("enter the amount you would like to transfer");
                amount = userInput();
            } else {
                menu();
                return;
            }

        }

        loggedInClient.balance -= amount;
        transferClient.balance += amount;

        System.out.println("you have successfully transferred $" + amount + " to " + transferClient.firstname + " " + transferClient.lastName);
        System.out.println("your new balance is " + loggedInClient.balance);

    }


    public static int menu() {

        System.out.println("1 : deposit");
        System.out.println("2 : withdraw");
        System.out.println("3 : transfer money");
        System.out.println("4 : show user information");
        System.out.println("5 : exit");
        System.out.println(" please enter your selection");
        return userInput();

    }


}
