package Week_12.reyhan;

import static Week_12.reyhan.ClientFunctions.*;
import static Week_12.reyhan.AccountFunctions.*;

public class BankApp {

    public static void main(String[] args) {

        DataBase.createDataBase();

        Client loggedInClient = login(DataBase.getClientData());

        while (true) {

            switch (menu()) {

                case 1:
                    deposit(loggedInClient);
                    break;

                case 2:
                    withdraw(loggedInClient);
                    break;

                case 3:
                    transfer(loggedInClient);
                    break;

                case 4:
                    showClientInfo(loggedInClient);
                    break;

                case 5:
                    createInvestAccount(loggedInClient);
                    break;

                default:
                    System.out.println("you have exited the menu");
                    return;

            }
        }

    }
}
