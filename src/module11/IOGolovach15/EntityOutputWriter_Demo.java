package module11.IOGolovach15;

import java.io.*;

/**
 * Created by User on 17.05.2017.
 */
public class EntityOutputWriter_Demo {
    public static void main(String[] args) throws IOException {

//        CharArrayWriter buff = new CharArrayWriter();
//        EntityOutput out = new EntityOutputStream(buff);

        EntityOutput out = new EntityOutputWriter(new OutputStreamWriter(System.out));
        out.writePoint(new Point(4, 8));
        out.writePerson(new Person("Ann", 25));
        out.writePoint(new Point(0, 0));
        out.writePerson(new Person("Mike", 45));

        EntityInput input = new EntityInputReader(new CharArrayReader((out.toString().toCharArray())));
        System.out.println(input.readPoint());
        System.out.println(input.readPerson());
        System.out.println(input.readPoint());
        System.out.println(input.readPerson());
    }
}
