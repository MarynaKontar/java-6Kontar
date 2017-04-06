package module10.homeWork10;

/**
 * Java#6
 * Module 10 Task 2
 * Create your own exception class using the extends keyword.
 * Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
 * Write a method that prints out the stored String.
 * Create a try-catch clause to exercise your new exception.
 *
 * @author Kontar Maryna
 */
public class task2 {
    public static void main ( String[] args ) {

        MyArithmeticException oo = new MyArithmeticException ( "Throw MyArithmeticException." );

        try {
            throw oo;
        } catch (MyArithmeticException e) {
            e.print ( );
            System.out.println ( "Catch " + e.getClass ( ).getSimpleName ( ) + "." );
            try {
                throw oo;
            } catch (RuntimeException re) {
                oo.print ();
                System.out.println ( "Catch " + re.getClass ( ).getSimpleName ( ) + " again." );
            }
        }


        System.out.println ( "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );

        try {
            throw new MyArithmeticException ( "Throw new MyArithmeticException." );
        } catch (MyArithmeticException e) {
            e.print ();
            System.out.println ( "Catch new " + e.getClass ( ).getSimpleName ( ) + "." );
        } catch (RuntimeException e) {
            System.out.println ( "This will never happen." );
        }
//        catch (ArithmeticException e) {
//            System.out.println ( "Compilation error." );
//        }



        System.out.println ( "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );

        try {
            throw new MyArithmeticException ( "Throw MyArithmeticException." );
        } catch (Error e) {
            System.out.println ( "This will never happen." );
        } catch (ArithmeticException e) {
            System.out.println ( "Catch again " + e.getClass ( ).getSimpleName ( ) + "." );
        }


    }
}
