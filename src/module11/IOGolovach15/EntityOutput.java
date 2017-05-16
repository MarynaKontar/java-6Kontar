package module11.IOGolovach15;

import java.io.IOException;

/**
 * Created by User on 16.05.2017.
 */
public interface EntityOutput {

    void writePerson(Person person) throws IOException;

    void writePoint(Point point) throws IOException;
}
