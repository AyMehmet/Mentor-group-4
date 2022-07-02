package Week_10;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClientDataBase {

    static ArrayList<Client>  clientData=new ArrayList<>();

    public static void createDataBase(){
        clientData.add(new Client(1,"memo","m", LocalDate.of(1976,01,01),LocalDate.now(),'m',100,123));
        clientData.add(new Client(2,"lucy","g", LocalDate.of(1985,01,01),LocalDate.now(),'f',100,223));
    }


    public static ArrayList<Client> getClientData() {
        if ( clientData.size()==0 )createDataBase();
        return clientData;
    }



    public  static void addNewClient(Client client){
        clientData.add(client);

    }

    public  static void removeClient(Client client){
        clientData.remove(client);

    }



}
