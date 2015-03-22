/**
 * Created by nicolas on 21/03/15.
 */
public class NPC {

    private int lifeRemaining;

    public NPC () {
        this.lifeRemaining = 10;
    }

    public int getLifeRemaining() {
        return lifeRemaining;
    }

    public void takeMajorDamage(int majorDamage) {
        this.lifeRemaining -= majorDamage;
    }
}
