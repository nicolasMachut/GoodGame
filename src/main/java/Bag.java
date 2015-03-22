/**
 * Created by nicolas on 21/03/15.
 */
public class Bag {

    private final static int DEFAULT_NB_ITEMS = 6;

    private Item[] items;
    private int nbItem = 0;

    public Bag () {
        this(DEFAULT_NB_ITEMS);
    }

    public Bag (int nbItems) {
        this.items = new Item[nbItems];
    }

    public void addItem (Item itemToAdd) throws BagFullException {
        if (!isFull()) {
            this.items[nbItem] = itemToAdd;
            this.nbItem++;
        } else {
            throw new BagFullException();
        }
    }

    public boolean isFull() {
        return this.nbItem == this.items.length;
    }
}
