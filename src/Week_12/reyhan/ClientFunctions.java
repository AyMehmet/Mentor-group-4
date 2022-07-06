package Week_12.reyhan;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientFunctions {

    public static Client login(ArrayList<Client> clientDataBase) {

        Client loggedInClient = null;
        boolean isClientFound = false;

        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();

            for (int i = 0; i <= clientDataBase.size() - 1; i++) {
                if (clientDataBase.get(i).getClient_Id() == inputClient_Id && clientDataBase.get(i).getPassword() == inputPassword) {
                    System.out.println("Login Succesful");
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

    public static int userInput() {

        int userInput = new Scanner(System.in).nextInt();
        return userInput;

    }

    public static Client findClient(int client_id){
        for (Client eachClient: DataBase.getClientData()){
            if (eachClient.getClient_Id()==client_id){
                return eachClient;
            }
        }
        return null;
    }

    public static int menu() {

        System.out.println("1 : deposit");
        System.out.println("2 : withdraw");
        System.out.println("3 : transfer money");
        System.out.println("4 : show user information");
        System.out.println("5 : create investment account");
        System.out.println("6 : exit");
        System.out.println(" please enter your selection");
        return userInput();

    }

}
