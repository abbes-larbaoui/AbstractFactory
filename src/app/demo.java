package app;

import factories.GuiFactory;
import factories.MacFactory;
import factories.WinFactory;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:12
 * @project AbstractFactory
 */
public class demo {
    public static Application applicationConfig() {
        Application app;
        GuiFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = applicationConfig();
        app.paint();
    }
}
