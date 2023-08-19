package AA_OOPS_Concept.Abstraction;

// hiding unUtilise
public class MailService {
    public void sendMail(){
    connect();
    authenticate();
    disconnect();
    }

    // it is inner funcationality of sending mail user dont need all these to know what email service do
    // So we make it private hence made it abstract
    private void connect(){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
