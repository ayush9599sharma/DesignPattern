package uifactory;
import component.Button;
import component.Checkbox;

public interface UIFactory {

    Button createButton();
    Checkbox createCheckBox();

}
