package E_FactoryDesignPattern.AbstractFactoryDesignPattern.UiFactory;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Button;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.CheckBox;

public interface UiFactory {

    public CheckBox createCheckBox();

    public Button createButton();
}
