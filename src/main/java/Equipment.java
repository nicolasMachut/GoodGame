/**
 * Created by nicolas on 22/03/15.
 */
public class Equipment {

    private MainWeapon mainWeapon;
    private Helmet helmet;

    public Equipment () {
        this.mainWeapon = new Sword();
        this.helmet = new Helmet();
    }
}
