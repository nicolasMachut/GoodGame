/**
 * Created by nicolas on 21/03/15.
 */
public class Bag {

    private final static int DEFAULT_NB_ITEMS = 6;

    private Item[] items;
    private int nbItem = 0;

    public Bag () {
        this.items = new Item[DEFAULT_NB_ITEMS];
    }
    public void addItem (Item itemToAdd) throws BagFullException {
        if (!isFull()) {
            this.items[nbItem - 1] = itemToAdd;
        } else {
            throw new BagFullException();
        }
    }

    private boolean isFull() {
        return this.nbItem < this.items.length;
    }
}
