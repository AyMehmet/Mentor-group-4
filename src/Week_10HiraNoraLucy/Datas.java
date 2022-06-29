package Week_10HiraNoraLucy;

import Week_10_reyhanKyoungGulcin.Client;

import java.util.ArrayList;

public class Datas {

    public static ArrayList<Week_10_reyhanKyoungGulcin.Client> getClientData() {

        Week_10_reyhanKyoungGulcin.Client client1 = new Week_10_reyhanKyoungGulcin.Client(1, "reyhan", "terzioglu", "male", 111, 1000);
        Week_10_reyhanKyoungGulcin.Client client2 = new Week_10_reyhanKyoungGulcin.Client(2, "kyoung", "kim", "female", 222, 1000);
        Week_10_reyhanKyoungGulcin.Client client3 = new Week_10_reyhanKyoungGulcin.Client(3, "gulcin", "kara", "female", 333, 1000);

        ArrayList<Client> clientDataBase = new ArrayList<>();

        clientDataBase.add(client1);
        clientDataBase.add(client2);
        clientDataBase.add(client3);

        return clientDataBase;

    }
}
