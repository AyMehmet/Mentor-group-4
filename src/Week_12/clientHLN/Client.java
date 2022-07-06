package Week_12.clientHLN;

import Week_11_memo.Account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private int client_Id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate creation_date;
    private char gender;
    private int password;

    private Account client_Account;

    private InvestAccount client_InvestAccount;



    public Client(int client_Id, String firstName, String lastName, LocalDate birthday, LocalDate creation_date, char gender, int password, Account client_Account, InvestAccount client_InvestAccount) {
        this.client_Id = client_Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.creation_date = creation_date;
        this.gender = gender;
        this.password = password;
        this.client_Account = client_Account;
        this.client_InvestAccount = client_InvestAccount;
    }

    public InvestAccount getClient_InvestAccount() {
        return client_InvestAccount;
    }

    public void setClient_InvestAccount(InvestAccount client_InvestAccount) {
        this.client_InvestAccount = client_InvestAccount;
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

    public Account getClient_Account() {
        return client_Account;
    }

    public void setClient_Account(Account client_Account) {
        this.client_Account = client_Account;
    }
}
