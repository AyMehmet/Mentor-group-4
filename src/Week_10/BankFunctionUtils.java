package Week_10;


//import static Week_10.GeneralFuntionsUtils.findClient;
//import static Week_10.GeneralFuntionsUtils.userInput;

public class BankFunctionUtils {

 /*   public static void deposit(Client loggedinClient) {
        System.out.println("please enter deposit amount");
        loggedinClient.balance+=userInput();
        System.out.println("Your current balance is =" + loggedinClient.balance);
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


    public static void transfer(Client loggedinClient) {

        System.out.println("enter the id of the client you want to transfer money");
        int enteredID = userInput();
        Client transferClient= findClient(enteredID);
       // boolean validID = false;

        if (transferClient.equals(null)) {
            System.out.println("Client to be transfered doesnt exit");
            return;
        } else {
            System.out.println("Enter transfer amount :");
            int transferAmount = userInput();
            if (transferAmount <= loggedinClient.balance) {
                transferClient.balance += transferAmount;
                loggedinClient.balance -= transferAmount;
                System.out.println("you transfered " + transferAmount);
                System.out.println("your new balance is " + loggedinClient.balance);
            } else {
                System.out.println("your balance is not enough");
            }
        }
    }

  */

}
