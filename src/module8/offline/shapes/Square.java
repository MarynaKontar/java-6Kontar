package module8.offline.shapes;

/**
 * Created by citsym on 09.03.17.
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder (  );
        sb.append (super.toString () );
        return sb.toString ( );
    }
}
