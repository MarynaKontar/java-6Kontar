package module5.offLine.initializationOrder;

/**
 * Created by User on 28.02.2017.
 */
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private int x1 = printInit("static Insect.x1 initialized");
public int r = 5;
public final int rr = 25;
    int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
