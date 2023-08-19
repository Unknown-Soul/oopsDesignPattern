package AA_OOPS_Concept.Abstraction.Polymorphism;

public abstract class UIControl {
    public void enable(){
        System.out.println("Enabled");
    }

    // abstract method have defination not declaration
    // only abstract class can have abstract methods
    // any class that extend abstract class need to impliment abstratct method by default
    public abstract void draw();
}
