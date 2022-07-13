package Week_12;

public class EmailService {

    public void sendEmail(){
        connect();
        authanticate();
        disconnect();

    }

    private void connect(){
        System.out.println("connecting");
    }
    private void authanticate(){
        System.out.println("auntantication");
    }

    private void disconnect(){
        System.out.println("disconnecting");
    }

}
