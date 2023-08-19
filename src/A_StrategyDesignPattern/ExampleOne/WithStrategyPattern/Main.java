package A_StrategyDesignPattern.ExampleOne.WithStrategyPattern;

import A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies.NormalStrategy;
import A_StrategyDesignPattern.ExampleOne.WithStrategyPattern.Strategies.SportsStrategy;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new GoodVehical(new NormalStrategy());
        vehicle.drive();
        Vehicle vehicle1 = new OffRoadVehical(new SportsStrategy());
        vehicle1.drive();
    }
}