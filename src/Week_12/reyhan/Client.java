package Week_12.reyhan;

import java.time.LocalDate;

public class Client {

    private int client_Id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private LocalDate creation_date;
    private char gender;
    private int password;

    private Account baseAccount;
    private Account investAccount;

    public Client(int client_Id, String firstName, String lastName, LocalDate birthday, LocalDate creation_date, char gender, int password, Account baseAccount, Account investAccount) {
        setClient_Id(client_Id);
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setCreation_date(creation_date);
        setPassword(password);
        setBaseAccount(baseAccount);
        setInvestAccount(investAccount);
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

    public Account getBaseAccount() {
        return baseAccount;
    }

    public void setBaseAccount(Account baseAccount) {
        this.baseAccount = baseAccount;
    }

    public Account getInvestAccount() {
        return investAccount;
    }

    public void setInvestAccount(Account investAccount) {
        this.investAccount = investAccount;
    }
}
