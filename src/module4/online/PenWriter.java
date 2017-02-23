package module4.online;

/**
 * Created by User on 14.02.2017.
 */
public abstract class PenWriter implements Writer {

    private int amount;
    boolean isReady;

//    public PenWriter(int amount) {
//        this.amount = amount;
//    }

   @Override
    public void write(String s){
        if (isReady)
            System.out.println("Write " + s + "with pen");
            else refill();
        }

    protected abstract void refill();
//    {
//        .//if (pen == gelPen) change gel
//    }


//    @Override
//    public void write(String str) {
//        System.out.println("Write from pen...");
//        writePen(str);
//    }

    //public abstract void writePen(String str);
}


