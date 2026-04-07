package uifactory;

import component.Button;
import component.Checkbox;
import os.mac.MacButton;
import os.mac.MacCheckBox;

public class MacUIFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
