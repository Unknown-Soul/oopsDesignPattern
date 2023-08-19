package AA_OOPS_Concept.Abstraction.Polymorphism;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        TextBox textBox = new TextBox();
        // inheritance
        //enable is method of extended class UIControl
        textBox.enable();
        // polymorphism
        drawUIControl(new CheckBox());
    }

    // polymorphism as at run drawUIControl can take any form
    public static void drawUIControl(UIControl uiControl){
        uiControl.draw();
    }
}