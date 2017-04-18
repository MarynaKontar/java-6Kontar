package module11;

import java.io.*;

/**
 * Created by User on 12.04.2017.
 */
public class CopyFile {
    public static void main ( String[] args ) throws IOException{
//        FileInputStream in = null;
//        FileOutputStream out = null;
//
//        try {
//            in = new FileInputStream ( "resourses\\input.txt" );
//            out = new FileOutputStream ( "resourses\\output.txt" );
//
//            int c;
//            while ((c = in.read ( )) != -1) {
//                out.write ( c );
//            }
//        } finally {
//            if (in != null)
//                in.close ( );
//            if (out != null)
//                out.close ( );
//        }



        FileReader inn = null;
        FileWriter outt = null;

        try {
            inn = new FileReader("resourses\\input.txt");
            outt = new FileWriter("resourses\\output.txt");

            int c;
            while ((c = inn.read()) != -1) {
                outt.write(c);
            }
        }finally {
            if (inn != null) {
                inn.close();
            }
            if (outt != null) {
                outt.close();
            }
        }





    }
}




/**
 private Session session;
 private Scanner scanner;
 private BufferedReader br = null;

 public Menu(ProjectController controller, Session session) {

 }

 //Enter point to Menu
 public void mainMenu() {
 System.out.println("Hello! Wellcome to our project! \n " +
 "Choose what you want to do and write the appropriate number: \n" +
 "1. Login \n" +
 "2. Find hotel by hotel name. \n" +
 "3. Find hotel by city name. \n" +
 "4. Find room in hotel. \n" +
 "5. Create account \n" +
 "6. \n" +
 "7. \n");
 //       br = new BufferedReader(new InputStreamReader(Systen.in));
 //       String input = br.readLine();
 */