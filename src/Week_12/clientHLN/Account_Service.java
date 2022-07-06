package Week_12.clientHLN;

import Week_11_memo.Client;

import static Week_11_memo.Client_Service.findClient;
import static Week_11_memo.Client_Service.userInput;

public class Account_Service {


    public static void deposit(Week_11_memo.Client loggedinClient) {
        System.out.println("please enter deposit amount");
        loggedinClient.getClient_Account().setBalance(loggedinClient.getClient_Account().getBalance()+userInput());
        System.err.println("your new balance is: "+ loggedinClient.getClient_Account().getBalance());
    }

    public static void  withdraw(Week_11_memo.Client loggedinClient) {
        System.out.println("please enter withdraw amount");
        int withdraw = userInput();
        if (withdraw<= loggedinClient.getClient_Account().getBalance()){
            loggedinClient.getClient_Account().setBalance(loggedinClient.getClient_Account().getBalance()-withdraw);
            System.err.println("You withdrawed " + withdraw + " $");
            System.err.println("Your new Balance is " + loggedinClient.getClient_Account().getBalance());
        }
        else {
            System.err.println("your balance is not enough");
        }
    }


    public static void transfer(Week_11_memo.Client loggedinClient) {

        System.out.println("enter the id of the client you want to transfer money");
        int enteredID = userInput();
        Client transferClient= findClient(enteredID);

        if (transferClient.equals(null)) {
            System.out.println("Client to be transfered doesnt exit");
            return;
        } else {
            System.out.println("Enter transfer amount :");
            int transferAmount = userInput();
            if(transferAmount<=loggedinClient.getClient_Account().getBalance()){
                transferClient.getClient_Account().setBalance(transferClient.getClient_Account().getBalance()+transferAmount);
                loggedinClient.getClient_Account().setBalance(loggedinClient.getClient_Account().getBalance()-transferAmount);
                System.err.println("you transfered " + transferAmount);
                System.err.println("your new balance is " + loggedinClient.getClient_Account().getBalance());
            } else {
                System.err.println("your balance is not enough");
            }
        }
    }


}
