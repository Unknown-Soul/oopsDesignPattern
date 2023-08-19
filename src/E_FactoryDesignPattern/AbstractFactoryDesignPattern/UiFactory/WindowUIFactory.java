package E_FactoryDesignPattern.AbstractFactoryDesignPattern.UiFactory;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Button;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.CheckBox;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Window.WindowButton;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Window.WindowCheckBox;

public class WindowUIFactory implements UiFactory{
    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
