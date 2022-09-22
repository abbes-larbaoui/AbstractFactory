package factories;

import buttons.Button;
import buttons.MacButton;
import checkbox.CheckBox;
import checkbox.MacCheckbox;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:07
 * @project AbstractFactory
 */
public class MacFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckbox();
    }
}
