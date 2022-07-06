package Week_12.reyhan;

import java.time.LocalDateTime;
import java.util.Scanner;

import static Week_12.reyhan.ClientFunctions.*;

public class AccountFunctions {

    public static int userInput() {

        int userInput = new Scanner(System.in).nextInt();
        return userInput;

    }

    public static void deposit(Client loggedInClient) {
        System.out.println("would you like to deposit money to your base account(1) or investment account(2)");
        int option = userInput();
        System.out.println("please enter deposit amount");
        int depositAmount = userInput();
        if (option == 1) {
            loggedInClient.getBaseAccount().setBalance(loggedInClient.getBaseAccount().getBalance() + depositAmount);
            System.out.println("your new balance is " + loggedInClient.getBaseAccount().getBalance());
        } else {
            if (userInput() < loggedInClient.getBaseAccount().getBalance()) {
                loggedInClient.getInvestAccount().setBalance(loggedInClient.getInvestAccount().getBalance() + depositAmount);
                loggedInClient.getBaseAccount().setBalance(loggedInClient.getBaseAccount().getBalance() - depositAmount);
                System.out.println("your new balance in investment account is " + loggedInClient.getInvestAccount().getBalance());

            }
        }


    }

    public static void withdraw(Client loggedInClient) {

        System.out.println("please enter withdraw amount");
        int withdrawAmount = userInput();

        if (loggedInClient.getBaseAccount().getBalance() >= withdrawAmount) {
            loggedInClient.getBaseAccount().setBalance(loggedInClient.getBaseAccount().getBalance() - withdrawAmount);
            System.out.println("you withdrew " + withdrawAmount);
            System.out.println("your new balance is " + loggedInClient.getBaseAccount().getBalance());
        } else {
            System.out.println("your balance is not enough");
        }

    }

    public static void showClientInfo(Client loggedInClient) {

        System.out.println("user information: ");
        System.out.println("client id: " + loggedInClient.getClient_Id());
        System.out.println("firstname: " + loggedInClient.getFirstName());
        System.out.println("lastname: " + loggedInClient.getLastName());
        System.out.println("gender: " + loggedInClient.getGender());
        System.out.println("balance: " + loggedInClient.getBaseAccount().getBalance());
    }

    public static void transfer(Client loggedInClient) {

        System.out.println("enter the id of the client you want to transfer money");
        int enteredID = userInput();
        Client transferClient = null;

        while (true) {

            transferClient = findClient(enteredID);
            if (transferClient == null) {
                System.out.println("invalid user id, please enter again");
                enteredID = userInput();
            } else {
                break;
            }

        }

        System.out.println("enter the amount you would like to transfer");
        int amount = userInput();
        while (loggedInClient.getBaseAccount().getBalance() < amount) {

            System.out.println("your balance is not enough\nPlease enter a new amount(1), or go back to the menu(2)");

            int option = userInput();
            if (option == 1) {
                System.out.println("enter the amount you would like to transfer");
                amount = userInput();
            } else {
                menu();
                return;
            }

        }

        loggedInClient.getBaseAccount().setBalance(loggedInClient.getBaseAccount().getBalance() - amount);
        transferClient.getBaseAccount().setBalance(transferClient.getBaseAccount().getBalance() + amount);

        System.out.println("you have successfully transferred $" + amount + " to " + transferClient.getFirstName() + " " + transferClient.getLastName());
        System.out.println("your new balance is " + loggedInClient.getBaseAccount().getBalance());

    }

    public static void createInvestAccount(Client loggedInClient) {
        Account investAccount = new Account(loggedInClient.getClient_Id(), 2, "investment", 0, LocalDateTime.now());
        loggedInClient.setInvestAccount(investAccount);
        System.out.println("your account was created successfully");
    }
}
