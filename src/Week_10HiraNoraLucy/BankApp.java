package Week_10HiraNoraLucy;

import Week_10_reyhanKyoungGulcin.Client;
import Week_10_reyhanKyoungGulcin.Datas;

import static Week_10_reyhanKyoungGulcin.Functions.*;

public class BankApp {

    public static void main(String[] args) {

        Client loggedinClient = login(Datas.getClientData());
        for (int i = 0; i < 3; ) {
            switch (menu()) {

                case 1:
                    deposit(loggedinClient);
//                        balance += deposit();
//                        System.out.println("your new balance is " + balance);
                    break;

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
                    break;

                case 3:

                    transfer(loggedinClient);
                    break;


                default:
                    System.out.println("you have exited the menu");
                    return;

            }
        }


    }
}



