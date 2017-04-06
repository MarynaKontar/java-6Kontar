package module10.TestExceptionsAndErrors;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by User on 06.04.2017.
 */
public class TestCheckedException {
    public static void main ( String[] args ) {
        try {
            saveToFile(new Object ());
        } catch (IOException e) {
            System.out.println ("Sorry..." );
//            System.err.println ("Sorry..." );
        }
    }

    private static void saveToFile (Object o) throws IOException{
        FileOutputStream out = new FileOutputStream ( "d:/tmp/doc.txt" );//может кинуть FileNotFoundException
//        out.write (  );//может кинуть IOException
        //поэтому лучше сразу прописать предка -  throws IOException
    }
}
