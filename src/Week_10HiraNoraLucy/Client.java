package Week_10HiraNoraLucy;

public class Client {

    public int client_id;
    String firstname;
    String lastName;
    String gender;
    public int password;
    public int balance;

    public Client(int client_id, String firstname, String lastName, String gender, int password, int balance) {
        this.client_id = client_id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.gender = gender;
        this.password = password;
        this.balance = balance;
    }


    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                '}';



    }

}
