package uifactory;

import component.Button;
import component.Checkbox;
import os.win.WinButton;
import os.win.WinCheckBox;

public class WinUIFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckBox();
    }
}
