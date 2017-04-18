package module11;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by User on 13.04.2017.
 */
public class InputStreamTest {
    public static void main ( String[] args ) throws IOException {
        FileReader  inn = new FileReader ("resourses\\text.txt");
        InputStream inFile = new FileInputStream ( "resourses\\text.txt" );
        readFullyByByte(inFile);
        System.out.println ("\n\n\n" );

        InputStream inUrl = new FileInputStream ( "http://google.com" );
        readFullyByByte(inFile);
        System.out.println ("\n\n\n" );
    }

    private static void readFullyByByte ( InputStream in ) throws IOException {
    while (true) {
        int oneByte = in.read ( );
    if (oneByte != -1) {
        System.out.println ((char) oneByte );
    } else {
        System.out.println ("\n" + "end" );
        break;
    }
    }
    }
}
