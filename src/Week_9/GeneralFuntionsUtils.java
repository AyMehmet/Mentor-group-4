package Week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneralFuntionsUtils {


    public static Client login(ArrayList<Client> clientDataBase) {

        Client loggedInClient = null;
        boolean isClientFound = false;

        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();
            int a = clientDataBase.size();

            for (int i = 0; i <= clientDataBase.size() - 1; i++) {
                if (clientDataBase.get(i).client_Id == inputClient_Id && clientDataBase.get(i).password == inputPassword) {
                    System.out.println("Login Succesful");
                    //currentClientindex = i;
                    loggedInClient = clientDataBase.get(i);
                    isClientFound = true;
                    break;
                }
            }
            if (!isClientFound) {
                System.out.println(" Client-Id or Password is not correct!! Try again please !!!");
            } else break;
        }
        return loggedInClient;
    }

    public static Client findClient(int client_id, ArrayList<Client> clientDataBase){
        for (Client eachClient:clientDataBase){
            if (eachClient.client_Id==client_id){
                return eachClient;
            }
        }
        return null;
    }

    public static Client findClient( ArrayList<Client> clientDataBase){

        System.out.println("Enter Client-ID to be transfered ");
        int clientId_toTransfer = userInput();
        Client tobetransferedClient=null;

        for (Client eachClient:clientDataBase){
            if (eachClient.client_Id==clientId_toTransfer){
                tobetransferedClient=eachClient;
                break;
            }
        }
        return tobetransferedClient;
    }

    public static int userInput() {
        int userInput = new Scanner(System.in).nextInt();
        return userInput;
    }


    public static int  menu (){

        System.out.println("1 : deposit");
        System.out.println("2 : withdraw");
        System.out.println("3 : transfer money");
        System.out.println("4 : show user information");
        System.out.println("5 : exit");
        System.out.println(" please enter your selection");
        return userInput();

    }
}
