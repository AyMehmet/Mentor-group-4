package Week_12_memo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    private int client_Id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate creation_date;
    private char gender;
    private int password;


    private ArrayList<Account> client_Account;




        public Client(int client_Id, String firstName, String lastName, LocalDate birthday, LocalDate creation_date, char gender, int password) {
        this.client_Id = client_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.creation_date = creation_date;
        this.gender = gender;
        this.password = password;
    }

    public int getClient_Id() {
        return client_Id;
    }

    public void setClient_Id(int client_Id) {
        this.client_Id = client_Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<Account> getClient_Account() {
        return client_Account;
    }

    public void setClient_Account(ArrayList<Account> client_Account) {
        this.client_Account = client_Account;
    }

    public void addAccount(Account account){
        client_Account.add(account);
    }
}
