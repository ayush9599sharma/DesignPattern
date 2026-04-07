package os.win;

import component.Checkbox;

public class WinCheckBox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Windows CheckBox");
    }
}
