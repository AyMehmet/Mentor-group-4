package Week_12.clientHLN;

import Week_11_memo.Client;
import Week_11_memo.DataBase_Service;

import java.util.Scanner;

public class Client_Service {


    public  static Week_11_memo.Client login() {

        Week_11_memo.Client loggedInClient = null;
        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();
            loggedInClient = findClient(inputClient_Id);
            if (!(loggedInClient==null) && loggedInClient.getPassword() == inputPassword){
                System.out.println("Login Succesful");
                break;

            }
            else if ((loggedInClient==null) || loggedInClient.getPassword() != inputPassword) {
                System.out.println(" Client-Id or Password is not correct!! Try again please !!!");

            }
//            //if (!loggedInClient.equals(null) && loggedInClient.getPassword()== inputPassword) {
//                System.out.println("Login Succesful");
//                break;
//            } else System.out.println(" Client-Id or Password is not correct!! Try again please !!!");
        }

        return loggedInClient;
    }

    public static Week_11_memo.Client findClient(int client_id){
        for (Client eachClient: DataBase_Service.getClientData()){
            if (eachClient.getClient_Id()==client_id){
                return eachClient;
            }
        }
        return null;
    }

    public static int userInput() {
        int userInput = new Scanner(System.in).nextInt();
        return userInput;
    }


    public static int  menu (){

        System.out.println("1 : deposit/deposit from base to investment");
        System.out.println("2 : withdraw/ withdraw from investment to base");
        System.out.println("3 : transfer money");
        System.out.println("4 : create InvestmentAccount");
        System.out.println("5 : show user information");
        System.out.println("6 : exit");
        System.out.println(" please enter your selection");
        return userInput();

    }
}
