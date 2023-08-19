package E_FactoryDesignPattern;

import E_FactoryDesignPattern.Shapes.Circle;
import E_FactoryDesignPattern.Shapes.Rectangle;
import E_FactoryDesignPattern.Shapes.Shape;

public class ShapeFactory {

    public Shape drawShape(String shape){
        switch (shape){
            case "CIRCLE":
                    return  new Circle();
            case "RECTANGLE":
                    return  new Rectangle();
            default:
                    return new Rectangle();
        }
    }
}
