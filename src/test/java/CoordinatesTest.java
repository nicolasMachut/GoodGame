import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by nicolas on 21/03/15.
 */
public class CoordinatesTest {

    @Test
    public void testCoordinatesEqualTrue () {
        Coordinates coordinates = new Coordinates(0, 0);
        assertTrue(coordinates.equals(new Coordinates(0, 0)));
    }

    @Test public void testCoordinatesEqualFalse () {
        Coordinates coordinates = new Coordinates(0, 0);
        assertFalse(coordinates.equals(new Coordinates(1, 1)));
        assertFalse(coordinates.equals(new Player()));
    }
}
