package A_StrategyDesignPattern.ExampleOne.WithoutStrategyPattern;

public class Main {
    public static void main(String[] args){
        Vehical newVehical = new OffRoadVehical();
        newVehical.drive();
    }
}