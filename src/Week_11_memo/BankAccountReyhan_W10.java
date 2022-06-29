package Week_11_memo;










import static Week_10.BankFunctionUtils.*;
import static Week_10.GeneralFuntionsUtils.login;



public class BankAccountReyhan_W10 {

    public static void main(String[] args) {

        Client loggedClient= login();

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
                    System.out.println(loggedClient);
                    break;
                default:
                    System.out.println("you have exited the menu");
                    return;
            }
        }
    }
}





