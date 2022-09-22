package app;

import buttons.Button;
import checkbox.CheckBox;
import factories.GuiFactory;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:09
 * @project AbstractFactory
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
