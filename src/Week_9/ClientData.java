package Week_9;

import java.util.ArrayList;

public class ClientData {


    public static ArrayList<Client> getClientData() {

        ArrayList<Client> clientDataBase = new ArrayList<>();
        clientDataBase.add(new Client(1, "memo", "m", 'm', 0, 123));
        clientDataBase.add(new Client(2, "Lucy", "G", 'f', 100, 223));
        clientDataBase.add(new Client(3, "Kyong", "K", 'f', 200, 323));
        return clientDataBase;
    }

}
