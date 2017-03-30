package module8.offline.shapes;

/**
 * Created by citsym on 09.03.17.
 */
public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare ( rectangle.a, a ) != 0) return false;
        return Double.compare ( rectangle.b, b ) == 0;
    }

    @Override
    public int hashCode () {
        int result;
        long temp;
        temp = Double.doubleToLongBits ( a );
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits ( b );
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( this.getClass ().getSimpleName ());
        sb.append ( "{ a=" ).append ( a );
        sb.append ( ", b=" ).append ( b );
        sb.append ( "}\n" );
        return sb.toString ( );
    }
}
