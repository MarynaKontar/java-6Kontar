package module10.homeWork10;

import java.io.IOException;

/**
 * Java#6
 * Module 10 Task 4
 * Create a class with two methods, f( ) and g( ).
 * In g( ), throw an exception of a new type that you define.
 * In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
 * Test your code in main( ).
 *
 * @author Kontar Maryna
 */
public class task4 {
    public static void main ( String[] args ) throws IOException {
        f ( );
        //или main ( String[] args ) throws IOException
        // или обернуть вызов f() в try-catch
    }


    private static void g () {
        throw new MyArithmeticException ( "Throw MyArithmeticException in g()." );
    }

    private static void f () throws IOException {
        try {
            g ( );
        } catch (MyArithmeticException e) {
            e.print ( );
            MyIOException me = new MyIOException ( "Will throw MyIOException but will not catch it" );
            me.print ( );
            throw me;
        }
    }
}
