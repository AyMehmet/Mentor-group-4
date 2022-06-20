package Week_9;

import java.util.ArrayList;

public class Datas {

    public static ArrayList<Client> getClientData() {

        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        client1.setInfo(1, "memo", "m", "male", 123, 0);
        client2.setInfo(2, "lucy", "m", "female", 223, 1000);
        client3.setInfo(3, "hira", "d", "female", 323, 100);


        ArrayList<Client> clientDataBase = new ArrayList<>();
        clientDataBase.add(client1);
        clientDataBase.add(client2);
        clientDataBase.add(client3);

        return clientDataBase;
    }
}