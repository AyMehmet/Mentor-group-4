package Week_12_memo;


import java.time.LocalDateTime;

import static Week_12_memo.Client_Service.findClient;
import static Week_12_memo.Client_Service.userInput;

public class Account_Service {


    public static void deposit(Client loggedinClient) {

        System.out.println("please enter deposit account : 1.Deposit Base Account 2. Deposit Invest Account ");
        switch ( userInput()) {
            case 1:
            System.out.println("please enter deposit amount");
            loggedinClient.getClient_Account().get(0).setBalance(loggedinClient.getClient_Account().get(0).getBalance()+userInput());
            System.err.println("your new balance is: "+ loggedinClient.getClient_Account().get(0).getBalance());
            break;
            case 2:
            System.out.println("please enter deposit amount");
            int depositAmount=userInput();
            if (depositAmount<loggedinClient.getClient_Account().get(0).getBalance()){
                loggedinClient.getClient_Account().get(1).setBalance(loggedinClient.getClient_Account().get(1).getBalance()+depositAmount);
                loggedinClient.getClient_Account().get(0).setBalance(loggedinClient.getClient_Account().get(0).getBalance()-depositAmount);
                System.err.println("your new invest balance is: "+ loggedinClient.getClient_Account().get(1).getBalance());
                System.err.println("your new base balance is: "+ loggedinClient.getClient_Account().get(0).getBalance());
            }
            else  System.err.println("your base balance is not enough");
            break;
        }
    }

    public static void  withdraw(Client loggedinClient) {

        System.out.println("please enter withdraw account : 1.Withdraw Base Account 2. Withdraw Invest Account ");
        switch ( userInput()) {
            case 1:
                System.out.println("please enter withdraw amount");
                loggedinClient.getClient_Account().get(0).setBalance(loggedinClient.getClient_Account().get(0).getBalance()-userInput());
                System.err.println("your new balance is: "+ loggedinClient.getClient_Account().get(0).getBalance());
                break;
            case 2:
                System.out.println("please enter withdraw amount");
                int withdrawAmount=userInput();
                if (withdrawAmount<loggedinClient.getClient_Account().get(1).getBalance()){
                    loggedinClient.getClient_Account().get(0).setBalance(loggedinClient.getClient_Account().get(0).getBalance()+withdrawAmount);
                    loggedinClient.getClient_Account().get(1).setBalance(loggedinClient.getClient_Account().get(1).getBalance()-withdrawAmount);
                    System.err.println("your new invest balance is: "+ loggedinClient.getClient_Account().get(1).getBalance());
                    System.err.println("your new base balance is: "+ loggedinClient.getClient_Account().get(0).getBalance());
                }
                else  System.err.println("your withdraw balance is not enough");
                break;
        }
    }


    public static void transfer(Client loggedinClient) {

        System.out.println("enter the id of the client you want to transfer money");
        int enteredID = userInput();
        Client transferClient= findClient(enteredID);

        if (transferClient.equals(null)) {
            System.out.println("Client to be transfered doesnt exit");
            return;
        } else {
            System.out.println("Enter transfer amount :");
            int transferAmount = userInput();
            if(transferAmount<=loggedinClient.getClient_Account().get(0).getBalance()){
                transferClient.getClient_Account().get(0).setBalance(transferClient.getClient_Account().get(0).getBalance()+transferAmount);
                loggedinClient.getClient_Account().get(0).setBalance(loggedinClient.getClient_Account().get(0).getBalance()-transferAmount);
                System.err.println("you transfered " + transferAmount);
                System.err.println("your new balance is " + loggedinClient.getClient_Account().get(0).getBalance());
            } else {
                System.err.println("your balance is not enough");
            }
        }
    }

    public static void createInvestAccount(Client loggedinClient) {
        loggedinClient.getClient_Account().add(new Account(loggedinClient.getClient_Id(), 2,"Investment",0, LocalDateTime.now()));
    }
}
