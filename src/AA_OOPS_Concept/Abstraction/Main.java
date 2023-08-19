package AA_OOPS_Concept.Abstraction;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        // sendMail() method is accessible from here hence providing abstraction by hiding complexties of sending email
        new MailService().sendMail();
    }

}
