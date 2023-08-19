package E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Mac;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Drawing Mac checkbox");
    }
}
