import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by nicolas on 21/03/15.
 */
public class PlayerTest {

    private Player player;

    @Before
    public void before () {
        this.player = new Player();
    }

    @Test
    public void testAPlayerCanMoveForward () {
        Coordinates initialCoordinates = this.player.getCoordinates();
        Coordinates newCoordinates = new Coordinates(initialCoordinates.getX() + 1, initialCoordinates.getY());
        assertEquals(newCoordinates, this.player.moveForward());
    }

    @Test
    public void testPlayerCanMoveBack () {
        Coordinates initialCoordinates = this.player.getCoordinates();
        Coordinates newCoordinates = new Coordinates(initialCoordinates.getX() - 1, initialCoordinates.getY());
        assertEquals(newCoordinates, this.player.moveBack());
    }

    @Test
    public void testPlayerCanAttack () {
        NPC ennemy = new NPC();
        this.player.attack(ennemy);
        assertEquals(9, ennemy.getLifeRemaining());
    }
}
