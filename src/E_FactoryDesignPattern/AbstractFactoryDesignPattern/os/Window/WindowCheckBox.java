package E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Window;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.CheckBox;

public class WindowCheckBox implements CheckBox {
    @Override
    public void draw() {
        System.out.println("Drawing Window checkbox");
    }
}
