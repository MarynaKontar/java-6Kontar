package module5.onLine.figure;

/**
 * Created by User on 21.02.2017.
 */
public class Line {   // АГРЕГАЦИЯ : Line УМИРАЕТ ПРИ УМИРАНИИ FIGURE
    private double start;
    private double end;

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }
}
