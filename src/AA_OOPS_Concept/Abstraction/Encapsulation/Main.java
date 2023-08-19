package AA_OOPS_Concept.Abstraction.Encapsulation;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        Account account = new Account();
        account.deposite(10);
        System.out.println(account.getBalance());
    }

}
