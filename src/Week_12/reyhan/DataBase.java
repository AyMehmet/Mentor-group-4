package Week_12.reyhan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataBase {

    private static ArrayList<Client> clientData = new ArrayList<>();


    public static void createDataBase() {

        Account baseAccount1 = new Account(1, 1, "Base", 100, LocalDateTime.now());
        Account investAccount1 = new Account(1, 2, "Investment", 100, LocalDateTime.now());
        Account baseAccount2 = new Account(2, 1, "Base", 0, LocalDateTime.now());
        Account investAccount2 = new Account(2, 2, "Investment", 100, LocalDateTime.now());
        Account baseAccount3 = new Account(2, 1, "Base", 0, LocalDateTime.now());
        Account investAccount3 = new Account(2, 2, "Investment", 100, LocalDateTime.now());

        Client client1 = new Client(1, "Reyhan", "terzioglu", LocalDate.of(2000, 1, 1), LocalDate.now(), 'F', 111, baseAccount1, investAccount1);
        Client client2 = new Client(2, "Kyoung", "Kim", LocalDate.of(1976, 01, 01), LocalDate.now(), 'F', 222, baseAccount2, investAccount2);
        Client client3 = new Client(3, "Gulcin", "Kara", LocalDate.of(1985, 01, 01), LocalDate.now(), 'F', 333, baseAccount3, investAccount3);

        clientData.add(client1);
        clientData.add(client2);
        clientData.add(client3);


    }

    public static ArrayList<Client> getClientData() {
        return clientData;
    }

    public static void addNewClient(Client client) {
        clientData.add(client);

    }

    public static void removeClient(Client client) {
        clientData.remove(client);


    }

}
