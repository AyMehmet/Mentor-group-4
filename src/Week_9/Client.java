package Week_9;

public class Client {

    int client_id;
    String firstName;
    String lastName;
    String gender;
    int password;
    int balance;

    public void setInfo(int client_id, String firstName, String lastName, String gender, int password, int balance) {
        this.client_id = client_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.password = password;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}

