package Week_9;

import static Week_9.Functions.login;
import static Week_9.Functions.menu;


public class BankAccountReyhan_V2_Week6r {
    public static void main(String[] args) {


        Client loggedinClient = login(Datas.getClientData());
        for (int i = 0; i < 3; ) {
            switch (menu()) {

                case 1:
                    deposit(loggedinClient);

//                        balance += deposit();
//                        System.out.println("your new balance is " + balance);
//                        break;

                case 2:
                    withdraw(loggedinClient);

////                        int withdraw = withdraw();
////
////                        if (withdraw <= balance) {
////
////                            System.out.println("you withdrawed " + withdraw);
////                            balance -= withdraw;
////                            System.out.println("your new balance is " + balance);
//
//                        } else {
//                            System.err.println("your balance is not enough");
//                        }
//                        break;

                    transfer (loggedinClient, transferClient);

                default:
                    System.out.println("you have exited the menu");
                    return;

            }
        }

    }
}


