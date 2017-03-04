package module5.offLine.initializationOrder;

/**
 * Created by User on 28.02.2017.
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private int x2 = printInit("static Beetle.x2 initialized");
}
