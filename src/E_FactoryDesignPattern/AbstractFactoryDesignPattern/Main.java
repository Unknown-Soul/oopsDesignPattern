package E_FactoryDesignPattern.AbstractFactoryDesignPattern;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.UiFactory.MacUiFactory;
import E_FactoryDesignPattern.ShapeFactory;
import E_FactoryDesignPattern.Shapes.Shape;

public class Main {
    public static void main(String[] args){
       Application application = new Application(new MacUiFactory());
       application.draw();
    }
}