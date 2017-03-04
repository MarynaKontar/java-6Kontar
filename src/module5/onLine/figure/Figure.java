package module5.onLine.figure;

/**
 * Created by User on 21.02.2017.
 */
public abstract class Figure {

    private Line[] lines;

    public Line[] getLines() {
        return lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    public String name() {
        return "This is figure";
    }


    public void calculateAndDraw() {
        double res = square();
        draw(res);
    }

    //   public void writeToNetWork(){  //этого метода не должно быть, п.ч. один класс должен нести отвтственноть за один функционал
//
//   }

    //plain figure
    public abstract double square();

    public abstract void draw(double sq);

}
