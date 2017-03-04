package module5.onLine.figure;

/**
 * Created by User on 21.02.2017.
 */
public class Parallelogram extends Figure {

    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected double width(){
        return a;
    }

    protected double height(){
        return b;
    }

    @Override
   public double square() {
        return a * b;
    }

    @Override
    public void draw(double res) {
        System.out.println("Draw square from parallelogram");
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Parallelogram that = (Parallelogram) obj;

        if (Double.compare(that.a, a) != 0) return false;   //return that.a == a && that.b == b
        return Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;

        //return 31 * (int) a + (int) b;
        //return 1;
    }
}
