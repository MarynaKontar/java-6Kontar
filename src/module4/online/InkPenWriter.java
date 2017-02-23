package module4.online;

/**
 * Created by User on 14.02.2017.
 */
public class InkPenWriter extends PenWriter {
    @Override
    protected void refill() {
        System.out.println("Change ink");
    }


}
