package D_DecoratorDesignPattern;

import D_DecoratorDesignPattern.BasePizza.BasePizza;
import D_DecoratorDesignPattern.BasePizza.Margherita;
import D_DecoratorDesignPattern.Decorator.ExtraCheese;

public class Main {
    public static void main(String[] args){
        BasePizza pizza = new ExtraCheese(new Margherita());
        Integer cost = pizza.cost();
        //System.out.println(cost);
        // adding second slice of cheese
        pizza = new ExtraCheese(pizza);
        cost = pizza.cost();
        System.out.println(cost);
    }
}