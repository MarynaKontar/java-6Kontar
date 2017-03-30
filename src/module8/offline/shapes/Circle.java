package module8.offline.shapes;

/**
 * Created by citsym on 09.03.17.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( "Circle{" );
        sb.append ( "radius=" ).append ( radius );
        sb.append ( "}\n" );
        return sb.toString ( );
    }
}
