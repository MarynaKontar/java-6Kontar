package module11;

import java.io.File;
import java.nio.file.FileSystem;

/**
 * Created by User on 18.04.2017.
 */
public class CreateFileExample {
    public static void main ( String[] args ) {
        try{
            File file = new File ("src/module11/testDirectory/testFile.txt");
            if (file.createNewFile ()){
                System.out.println(file.getAbsolutePath());
            System.out.println ("File is created" );}
            else {System.out.println ("File already exists" );
                System.out.println(file.getAbsolutePath());}
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
