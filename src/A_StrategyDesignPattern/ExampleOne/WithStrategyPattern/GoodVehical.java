package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern;

import A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies.DriveStrategies;

public class GoodVehical extends Vehicle{
    GoodVehical(DriveStrategies driveStrategies) {
        super(driveStrategies);
    }
}
