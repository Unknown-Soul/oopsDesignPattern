package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern;

import A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies.DriveStrategies;

public class OffRoadVehical extends Vehicle{
    OffRoadVehical(DriveStrategies driveStrategies) {
        super(driveStrategies);
    }
}
