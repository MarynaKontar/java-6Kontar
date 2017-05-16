package module11;

import java.io.File;

/**
 * Created by User on 12.04.2017.
 */
public class CreateDir {
    public static void main(String args[]) {
        String dirname = "C:\\Users\\User\\IdeaProjects\\javaCore6Kontar\\src\\module11\\testDirectory";
        /**создаст C: tmp.user.java.bin*/     //(/tmp/user/java/bin)
        File d = new File (dirname);

        // Create directory now.
        System.out.println ( d.mkdirs ( ) );




    }
}
