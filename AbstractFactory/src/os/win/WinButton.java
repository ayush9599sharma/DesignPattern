package os.win;

import component.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
