package Week_9;

import static Week_9.BankFunctionUtils.*;
import static Week_9.ClientData.getClientData;
import static Week_9.GeneralFuntionsUtils.*;

public class BankAccountReyhan_V4 {

    public static void main(String[] args) {

        Client loggedClient=login(getClientData());

        for (int i = 0; i < 5; ) {

            int action = menu();
            switch (action) {
                case 1:
                    deposit(loggedClient);
                    break;
                case 2:
                    withdraw(loggedClient);
                    break;
                case 3:
                    transfer(loggedClient,findClient(getClientData()));
                    break;
                case 4:
                    System.out.println(loggedClient);
                    break;
                default:
                    System.out.println("you have exited the menu");
                    return;
            }
        }
    }
}





