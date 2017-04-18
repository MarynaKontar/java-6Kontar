package module11;

import java.io.File;

/**
 * Created by User on 12.04.2017.
 */
public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/tmp/user/java/bin";
        /**создаст C: tmp.user.java.bin*/
        File d = new File (dirname);

        // Create directory now.
        System.out.println ( d.mkdirs ( ) );




    }
}
