package A_StrategyDesignPattern.ExampleOne.WithoutStrategyPattern;

public class SportsVehical extends Vehical{

    // This is code is duplicated in SportsVehical and OffRoad Vehical bcz not avilable in Vehical class
    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
