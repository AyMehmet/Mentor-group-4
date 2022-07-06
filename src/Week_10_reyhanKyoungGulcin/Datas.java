package Week_10_reyhanKyoungGulcin;

import java.util.ArrayList;

public class Datas {

    public static ArrayList<Client> getClientData() {

        Client client1 = new Client(1, "reyhan", "terzioglu", "male", 111, 1000);
        Client client2 = new Client(2, "kyoung", "kim", "female", 222, 1000);
        Client client3 = new Client(3, "gulcin", "kara", "female", 333, 1000);

        ArrayList<Client> clientDataBase = new ArrayList<>();

        clientDataBase.add(client1);
        clientDataBase.add(client2);
        clientDataBase.add(client3);

        return clientDataBase;

    }
}
