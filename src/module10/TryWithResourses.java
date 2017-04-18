package module10;

import java.io.*;
import java.util.Properties;

/**
 * Created by User on 10.04.2017.
 */
public class TryWithResourses {
    public static void main ( String[] args ) throws FileNotFoundException, IOException {
      try (
          FileInputStream fs = new FileInputStream ( "resourses\\ourProperties.properties" )) {
//          //C:\Users\User\IdeaProjects\java-6Kontar\
////        int k;
////        char symbol;
////        while ((k = fs.read ( )) != -1) {
////            symbol = (char) k;
////            System.out.print (symbol );
////        }
//          Properties properties = new Properties ( );
//          properties.load ( fs );
//          System.out.println ( properties.getProperty ( "userName", "rty" ) );
//
//          fs.close ( );
      }

      try (BufferedReader bf = new BufferedReader ( new FileReader ( "resourses\\ourProperties.properties" )) ){
//          bf.lines().forEach ( System.out::println);
          System.out.println ( bf.readLine ( ) );// одну строку читает
          String readLine = "";
          while(readLine != null){
              readLine = bf.readLine ();
              System.out.println (readLine );
          }
      }


      }
    }

