package D_DecoratorDesignPattern.Decorator;

import D_DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
