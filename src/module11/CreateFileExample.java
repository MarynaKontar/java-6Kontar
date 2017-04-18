package module11;

import java.io.File;

/**
 * Created by User on 18.04.2017.
 */
public class CreateFileExample {
    public static void main ( String[] args ) {
        try{
            File file = new File ("src/module11/newFile.txt");
            if (file.createNewFile ())
                System.out.println ("File is created" );
            else System.out.println ("File already exists" );
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
