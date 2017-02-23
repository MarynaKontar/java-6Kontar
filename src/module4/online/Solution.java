package module4.online;

/**
 * Created by User on 14.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Writer[] writers = new Writer[2];
       writers[0] = new BlackboardWriter();
        writers[1] = new InkPenWriter();
        //это КОВАРИАНТНОСТЬ ТИПОВ, когда интерфейсу можно присвоить обїект
        //Writer writer3 = new BlackboardWriter();

        for (Writer writer : writers) {
            writer.write("hello");
        }


        WriteType t = WriteType.BRUSH;
        System.out.println(t.name());
        System.out.println(t.ordinal());

    }
}
