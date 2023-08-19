package E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Mac;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Button;

public class MacButton implements Button {
    @Override
    public void draw() {
        System.out.println("Drawing Mac button");
    }
}
