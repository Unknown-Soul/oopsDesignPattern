package AA_OOPS_Concept.Abstraction.Encapsulation;

public class Account {
    //encapsulate method and variable in one
    private float balance;


    public void deposite(float balance){
        this.balance += balance;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public float getBalance(){
        return balance;
    }
}
