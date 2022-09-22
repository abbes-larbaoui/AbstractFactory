package buttons;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 10:59
 * @project AbstractFactory
 */
public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("create a windows Button");
    }
}
