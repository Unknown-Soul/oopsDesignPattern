package E_FactoryDesignPattern.AbstractFactoryDesignPattern;

import E_FactoryDesignPattern.AbstractFactoryDesignPattern.UiFactory.UiFactory;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.Button;
import E_FactoryDesignPattern.AbstractFactoryDesignPattern.os.CheckBox;

public class Application {

    private CheckBox checkBox;
    private Button button;

    public Application(UiFactory uiFactory){
        this.checkBox = uiFactory.createCheckBox();
        this.button = uiFactory.createButton();
    }

    public void draw(){
        checkBox.draw();
        button.draw();
    }
}
