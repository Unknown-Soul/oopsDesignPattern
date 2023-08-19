package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern;

import A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies.DriveStrategies;

public class Vehicle {
    DriveStrategies driveStrategies;

    // This is constructor injection
    Vehicle(DriveStrategies driveStrategies){
            this.driveStrategies = driveStrategies;
    }

    public void drive(){
        driveStrategies.drive();
    }
}
