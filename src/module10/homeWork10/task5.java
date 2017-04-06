package module10.homeWork10;

/**
 * Java#6
 * Module 10 Task 5
 * Create three new types of exceptions. Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 *
 * @author Kontar Maryna
 */
public class task5 {
    public static void main ( String[] args ) {

        try {
            throwsTreeExceptions();
        } catch (MyNumberFormatException | MyNullPointerException | MyIOException e) {
            System.out.println ("Catch!!!" );
        }
    }

    private static void throwsTreeExceptions () throws MyIOException {

        try{
            throw new MyNumberFormatException ( );
        } catch (MyNumberFormatException e){
            try{
            throw new MyNullPointerException();
            } catch (MyNullPointerException e1){
            }
        }

        throw new MyIOException("Throw MyIOException.");
    }
}
