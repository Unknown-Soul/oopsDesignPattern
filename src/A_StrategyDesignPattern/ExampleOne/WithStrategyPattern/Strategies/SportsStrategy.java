package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies;

public class SportsStrategy implements DriveStrategies{
    @Override
    public void drive() {
        System.out.println("Sports Driving Capabilites");
    }
}
