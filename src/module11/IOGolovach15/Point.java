package module11.IOGolovach15;

/**
 * Created by User on 16.05.2017.
 */
public class Point extends Entity {

    public Point(int x, int y) {
        if (x < 0 || 15 < x)
            throw new IllegalArgumentException();
        if (y < 0 || 15 < y)
            throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
