package module11;

import java.io.*;

/**
 * Created by User on 12.04.2017.
 */
public class fileStreamTest {
    public static void main ( String[] args ) {
        try {
            byte bWrite [] = {99,100,45,44,55};
            OutputStream os = new FileOutputStream ("resourses\\test.txt");
//            os.write ( 44 );
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream ("resourses\\test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e) {
            System.out.print("Exception");
        }
    }
}
