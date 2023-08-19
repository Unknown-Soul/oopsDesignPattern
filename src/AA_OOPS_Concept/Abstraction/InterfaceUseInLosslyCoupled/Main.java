package AA_OOPS_Concept.Abstraction.InterfaceUseInLosslyCoupled;

public class Main {
    public static void main(String[] args){
    System.out.println("Hello world!");

    // Loose Coupling
     TaxCalculator taxCalculator = getCalculator();
     taxCalculator.calculateTax();
    }
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2022();
    }
}