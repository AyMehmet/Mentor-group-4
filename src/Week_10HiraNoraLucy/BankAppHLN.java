package Week_10HiraNoraLucy;


import javax.xml.crypto.Data;

import static Week_10HiraNoraLucy.BankFunctionsHLN.Functions.*;
import static week_10_reyhanKyoungGulcin.Functions.showClientInfo;
import static week_10_reyhanKyoungGulcin.Functions.transfer;

public class BankAccountReyhan_V2_Week6r {
    public static void main(String[] args) {


        Client loggedinClient = login(Data.getClientData);
        for (int i = 0; i < 3; ) {
            switch (menu()) {

                case 1:
                    loggedinClient.balance+=deposit(loggedinClient);
                    System.out.println("New balance is: " + loggedinClient.balance);
//                        balance += deposit();
//                        System.out.println("your new balance is " + balance);
                    break;

                case 2:
                    loggedinClient.balance-=withdraw(loggedinClient);
                    System.out.println("New balance is: " + loggedinClient.balance);

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