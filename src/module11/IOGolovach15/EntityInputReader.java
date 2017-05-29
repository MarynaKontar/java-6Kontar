package module11.IOGolovach15;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by User on 16.05.2017.
 */
public class EntityInputReader implements EntityInput {

    private final Reader input;

    public EntityInputReader(Reader input) {
        this.input = input;
    }

    @Override
    public Person readPerson() throws IOException {
        input.read();
        int age = input.read(input.toString().toCharArray(),7,9);
        String name = input.read;

        return
        return null;
    }

    @Override
    public Point readPoint() throws IOException {
        return null;
    }
}
