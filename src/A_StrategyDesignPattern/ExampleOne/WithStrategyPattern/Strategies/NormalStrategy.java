package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies;

public class NormalStrategy implements DriveStrategies{
    @Override
    public void drive() {
        System.out.println("Normal Driving Capabilites");
    }
}
