package module11.IOGolovach15;

import java.io.*;

/**
 * Created by User on 16.05.2017.
 */
public class EntityInputStream implements EntityInput {

    private final DataInput input;

    public EntityInputStream(InputStream input) {
        this.input = new DataInputStream(input);
    }

    @Override
    public Person readPerson() throws IOException {
        int age = input.readInt();
        if (!input.readBoolean())
            return null; //return new Person("", age);
        else {
            String name = input.readUTF();
            return new Person(name, age);
        }
    }

    @Override
    public Point readPoint() throws IOException {
        int value = input.readInt();
        int x = value >> 4;
        return null;
    }
}
