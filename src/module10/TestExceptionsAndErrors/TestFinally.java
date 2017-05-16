package module10.TestExceptionsAndErrors;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

/**
 * Created by User on 12.04.2017.
 */
public class TestFinally {
    public static void main ( String[] args ) {
//        try {
//            System.exit(0);
//        } catch(Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println ("fdghyjut" );
//        }


//        Exception ex = twoExceptionsMethod();
//        System.out.println(ex.getClass());
//
//        String s = twoExceptionsMethod2();
//        System.out.println(s);






        try {
            //TODO: some code
            String x = "abc";
            if (x.equals("abc")) {
                throw new IOException ("rtytui");
            } else {
                throw new FileNotFoundException ();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println ( e.getMessage ( ) );
        }



    }




    public static Exception twoExceptionsMethod() {
        try {
            return new IndexOutOfBoundsException();
        } finally {
            return new NullPointerException();
        }
    }

    public static String twoExceptionsMethod2() {
        try {
            throw new NullPointerException();
        }catch (NullPointerException ex) {
            System.out.println(ex.getMessage()+ " catch");;
        }
        finally {
            Exception ex2 = new Exception();
            return ex2.getMessage() + " finally";
        }
    }

}

