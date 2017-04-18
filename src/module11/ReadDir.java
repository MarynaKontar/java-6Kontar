package module11;

import java.io.File;
import java.util.Arrays;

/**
 * Created by User on 12.04.2017.
 */
public class ReadDir {
    public static void main(String[] args) {
        File file = null;
        String[] paths;

        try {
            // create new file object

            file = new File ("src\\module10");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
            //Arrays.stream ( paths ).forEach ( System.out :: println );
        }catch(Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
