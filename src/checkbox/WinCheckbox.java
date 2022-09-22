package checkbox;

/**
 * @author LARBAOUI Abbes <abbes.larbaoui@eadn.dz>
 * @created 22/09/2022 - 11:02
 * @project AbstractFactory
 */
public class WinCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("create windows checkbox");
    }
}
