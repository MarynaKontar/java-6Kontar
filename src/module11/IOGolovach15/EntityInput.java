package module11.IOGolovach15;

import java.io.IOException;

/**
 * Created by User on 16.05.2017.
 */
public interface EntityInput {

    public  Person readPerson() throws IOException;
    public  Point readPoint() throws IOException;
}
