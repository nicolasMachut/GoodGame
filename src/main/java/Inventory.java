/**
 * Created by nicolas on 21/03/15.
 */
public class Inventory {

    private static final int MAXIMUM_BAGS = 5;

    private Bag[] bags;

    public Inventory () {
        this.bags = new Bag[MAXIMUM_BAGS];
        this.bags[0] = new Bag();
    }

    public void addItem(Item item) throws InventoryFullException {
       for (Bag bag : bags) {
            try {
                bag.addItem(item);
                return;
            } catch (BagFullException e) {
                // Ignore Exception, test with another bag
            }
       }
        throw new InventoryFullException();
    }
}
