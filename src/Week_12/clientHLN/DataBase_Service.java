package Week_12.clientHLN;


import Week_11_memo.Account;
import Week_11_memo.Client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataBase_Service {

    static ArrayList<Week_11_memo.Client>  clientData=new ArrayList<>();


    public static void createDataBase(){

        Week_11_memo.Account account1=new Week_11_memo.Account(1,1,"Base",0, LocalDateTime.now());
        Week_11_memo.Account account2=new Week_11_memo.Account(2,1,"Base",0, LocalDateTime.now());
        //Account account3=new Account(2,2,"Investment",0, LocalDateTime.now());
        Week_11_memo.Account account4=new Account(3,1,"Base",0,LocalDateTime.now());

        Week_11_memo.Client client3=new Week_11_memo.Client(3,"Reyhan","r",LocalDate.of(2000,1,1),LocalDate.now(),'f',323,account4);
        Week_11_memo.Client client1=new Week_11_memo.Client(1,"memo","m", LocalDate.of(1976,01,01),LocalDate.now(),'m',123,account1);
        Week_11_memo.Client client2=new Week_11_memo.Client(2,"lucy","g", LocalDate.of(1985,01,01),LocalDate.now(),'f',223,account2);

        clientData.add(client1);
        clientData.add(client2);
        clientData.add(client3);


    }

    public static ArrayList<Week_11_memo.Client> getClientData() {
        return clientData;
    }

    public  static void addNewClient(Week_11_memo.Client client){
        clientData.add(client);

    }

    public  static void removeClient(Client client){
        clientData.remove(client);

    }
}
