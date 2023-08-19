package E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Window;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Button;

public class WindowButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing Window button");
    }
}
