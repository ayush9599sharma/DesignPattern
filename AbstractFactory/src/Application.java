import component.Button;
import component.Checkbox;
import uifactory.UIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
