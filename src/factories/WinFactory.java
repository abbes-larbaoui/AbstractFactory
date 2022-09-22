package factories;

import buttons.Button;
import buttons.WinButton;
import checkbox.CheckBox;
import checkbox.WinCheckbox;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:06
 * @project AbstractFactory
 */
public class WinFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckbox();
    }
}
