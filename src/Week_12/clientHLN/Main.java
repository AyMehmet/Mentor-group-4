package Week_12.clientHLN;



import Week_11_memo.Client;
import Week_11_memo.Client_Service;
import Week_11_memo.DataBase_Service;

import static Week_11_memo.Account_Service.*;
import static Week_11_memo.Client_Service.login;

public class Main {

    public static void main(String[] args) {
        DataBase_Service.createDataBase();

        Client loggedClient=login();


        for (int i = 0; i < 5; ) {

            int action = Client_Service.menu();
            switch (action) {
                case 1:
                    deposit(loggedClient);
                    break;
                case 2:
                    withdraw(loggedClient);
                    break;
                case 3:
                    transfer(loggedClient);
                    break;

                case 4:
                    // createInvestAccount(loggedClient);

                    break;

                case 5:
                    System.out.println(loggedClient);
                    break;
                default:
                    System.out.println("you have exited the menu");
                    return;
            }
        }
    }
}




