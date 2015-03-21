/**
 * Created by nicolas on 21/03/15.
 */
public class Coordinates {

    private int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates () {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals (Object coordinatesObj) {

        if (!(coordinatesObj instanceof Coordinates)) {
            return false;
        }

        Coordinates coordinates = (Coordinates) coordinatesObj;

        return coordinates.getX() == this.getX() && coordinates.getY() == this.getY();
    }

    @Override
    public String toString () {
        return this.getX() + "," + this.getY();
    }
}
