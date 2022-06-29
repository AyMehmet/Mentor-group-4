package Week_10;



import java.util.ArrayList;
import java.util.Scanner;

public class GeneralFuntionsUtils {


    public  static  Client login() {

        Client loggedInClient = null;
        while (true) {
            System.out.println("please enter your client id");
            int inputClient_Id = userInput();
            System.out.println("please enter your password");
            int inputPassword = userInput();
            loggedInClient = findClient(inputClient_Id);
            if (!loggedInClient.equals(null) && loggedInClient.password == inputPassword) {
                System.out.println("Login Succesful");
                break;
            } else System.out.println(" Client-Id or Password is not correct!! Try again please !!!");
        }

        return loggedInClient;
    }

    public static Client findClient(int client_id){
        for (Client eachClient:ClientDataBase.getClientData()){
            if (eachClient.client_Id==client_id){
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

        System.out.println("1 : deposit");
        System.out.println("2 : withdraw");
        System.out.println("3 : transfer money");
        System.out.println("4 : show user information");
        System.out.println("5 : exit");
        System.out.println(" please enter your selection");
        return userInput();

    }
}
