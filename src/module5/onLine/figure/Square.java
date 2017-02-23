package module5.onLine.figure;

/**
 * Created by User on 21.02.2017.
 */
public class Square extends Parallelogram {
    public Square(double a) {
        super(a, a);
    }



    @Override
    void draw(double sq) {
        System.out.println("Call draw from square!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("This is square: ");
        sb.append(width());
        return sb.toString();
        //return "This is sq:" + width();
    }

    public double perimeter(){
        return 4 * width();
    }
}
