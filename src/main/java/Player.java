/**
 * Created by nicolas on 21/03/15.
 */
public class Player {

    private final Inventory inventory;
    private Coordinates coordinates;

    public Player () {
        this.coordinates = new Coordinates();
        this.inventory = new Inventory();
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public Coordinates moveForward() {
        this.coordinates.setX(this.coordinates.getX() + 1);
        return this.coordinates;
    }

    public Coordinates moveBack() {
        this.coordinates.setX(this.coordinates.getX() - 1);
        return this.coordinates;
    }

    public void pickUp(Item item) {
        try {
            this.inventory.addItem(item);
        } catch (InventoryFullException e) {
            Log.console("Inventory is full ! ");
        }
    }
}

