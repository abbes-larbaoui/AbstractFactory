package buttons;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:00
 * @project AbstractFactory
 */
public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("create mac Button");
    }
}
