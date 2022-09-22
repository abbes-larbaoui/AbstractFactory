package factories;

import buttons.Button;
import checkbox.CheckBox;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:05
 * @project AbstractFactory
 */
public interface GuiFactory {
    Button createButton();
    CheckBox createCheckbox();
}
