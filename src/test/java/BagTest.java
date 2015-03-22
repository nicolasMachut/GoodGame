import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by nicolas on 21/03/15.
 */
public class BagTest {

    @Test(expected = BagFullException.class)
    public void testAddItemBagFull () throws BagFullException {
        Bag bag = new Bag(1);
        bag.addItem(new Item());
        bag.addItem(new Item());
    }

    @Test
    public void testBagIsFullTrue () throws BagFullException {
        Bag bag = new Bag(1);
        bag.addItem(new Item());
        assertTrue(bag.isFull());
    }

    @Test
    public void testBagIsFullFalse () throws BagFullException {
        Bag bag = new Bag(2);
        bag.addItem(new Item());
        assertFalse(bag.isFull());
    }
}
