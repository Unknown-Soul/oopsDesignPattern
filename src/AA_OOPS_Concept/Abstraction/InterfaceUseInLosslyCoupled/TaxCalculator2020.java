package AA_OOPS_Concept.Abstraction.InterfaceUseInLosslyCoupled;

public class TaxCalculator2020 implements  TaxCalculator{
    @Override
    public float calculateTax() {
        return 2020;
    }

    public float calculateInsurance(){
        return 0;
    }
}
