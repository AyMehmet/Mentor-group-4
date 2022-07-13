package Week_12_memo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataBase_Service {

    static ArrayList<Client>  clientData=new ArrayList<>();


    public static void createDataBase(){

        Account account1=new Account(1,1,"Base",0, LocalDateTime.now());
        Account account2=new Account(2,1,"Base",0, LocalDateTime.now());
        //Account account3=new Account(2,2,"Investment",0, LocalDateTime.now());
        Account account3=new Account(3,1,"Base",0,LocalDateTime.now());

        Client client3=new Client(3,"Reyhan","r",LocalDate.of(2000,1,1),LocalDate.now(),'f',323);
        Client client1=new Client(1,"memo","m", LocalDate.of(1976,01,01),LocalDate.now(),'m',123);
        Client client2=new Client(2,"lucy","g", LocalDate.of(1985,01,01),LocalDate.now(),'f',223);



        client1.addAccount(account1);
        client2.addAccount(account2);
        client3.addAccount(account3);


        clientData.add(client1);
        clientData.add(client2);
        clientData.add(client3);


    }

    public static ArrayList<Client> getClientData() {
        return clientData;
    }

    public  static void addNewClient(Client client){
        clientData.add(client);

    }

    public  static void removeClient(Client client){
        clientData.remove(client);

    }
}
