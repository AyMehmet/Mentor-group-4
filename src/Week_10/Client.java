package Week_10;

import java.time.LocalDate;

public class Client {
    int client_Id;
    String firstName;
    String lastName;
    LocalDate birthday;
    LocalDate creationTimeofAccount;
    char gender;
    int balance;
    int password;


    public Client(int client_Id, String firstName, String lastName, LocalDate birthday, LocalDate creationTimeofAccount, char gender, int balance, int password) {
        this.client_Id = client_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.creationTimeofAccount = creationTimeofAccount;
        this.gender = gender;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "client_Id=" + client_Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", balance=" + balance +
                ", password=" + password +
                '}';
    }
}
