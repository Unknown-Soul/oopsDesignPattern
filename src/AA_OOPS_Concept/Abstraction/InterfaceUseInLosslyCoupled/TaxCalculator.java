package AA_OOPS_Concept.Abstraction.InterfaceUseInLosslyCoupled;
/**
 * Imagine Interface as Chef
 * Ram and Sham are classes that implement interface
 * So if Thier is change in Ram funcationlity of ram it wont change funcationlty of Sham
 * But it A new funcationlity is added in Chef interface ram and sham have to implement them.
 * */
public interface TaxCalculator {
    float calculateTax();

}
