package Week_10_reyhanKyoungGulcin;

import static Week_10_reyhanKyoungGulcin.Functions.*;

public class BankApp {

    public static void main(String[] args) {

        Client loggedInClient = login(Datas.getClientData());

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

                default:
                    System.out.println("you have exited the menu");
                    return;

            }
        }

    }
}



