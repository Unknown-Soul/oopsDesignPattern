package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern;

import A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies.DriveStrategies;

public class SportsVehical extends Vehicle {
    SportsVehical(DriveStrategies driveStrategies) {
        super(driveStrategies);
    }
}
