package Week_10HiraNoraLucy;

import week_10_reyhanKyoungGulcin.Client;

import java.util.ArrayList;

public class Datas {

    public static ArrayList<week_10_reyhanKyoungGulcin.Client> getClientData() {

        week_10_reyhanKyoungGulcin.Client client1 = new week_10_reyhanKyoungGulcin.Client(1, "reyhan", "terzioglu", "male", 111, 1000);
        week_10_reyhanKyoungGulcin.Client client2 = new week_10_reyhanKyoungGulcin.Client(2, "kyoung", "kim", "female", 222, 1000);
        week_10_reyhanKyoungGulcin.Client client3 = new week_10_reyhanKyoungGulcin.Client(3, "gulcin", "kara", "female", 333, 1000);

        ArrayList<Client> clientDataBase = new ArrayList<>();

        clientDataBase.add(client1);
        clientDataBase.add(client2);
        clientDataBase.add(client3);

        return clientDataBase;

    }
}
