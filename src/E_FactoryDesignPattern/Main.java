package E_FactoryDesignPattern;

import E_FactoryDesignPattern.Shapes.Shape;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.drawShape("CIRCLE");
        shape.draw();
    }
}