package E_FactoryDesignPattern.AbstractFactoryDesignPattern.UiFactory;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Button;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.CheckBox;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Mac.MacButton;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Mac.MacCheckBox;

public class MacUiFactory implements UiFactory{
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
