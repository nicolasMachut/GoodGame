/**
 * Created by nicolas on 21/03/15.
 */
public class Player {

    private final Inventory inventory;
    private Coordinates coordinates;
    private Equipment equipment;

    public Player () {
        this.coordinates = new Coordinates();
        this.inventory = new Inventory();
        this.equipment = new Equipment();
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

    public void attack(NPC ennemy) {
        ennemy.takeMajorDamage(1);
    }
}

