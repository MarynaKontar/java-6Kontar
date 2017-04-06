package module10.homeWork10;

/**
 * Java#6
 * Module 10 Task 3
 * Define an object reference and initialize it to null.
 * Try to call a method through this reference.
 * Now wrap the code in a try-catch clause to catch the exception.
 *
 * @author Kontar Maryna
 */
public class task3 {
    public static void main ( String[] args ) {
        Object o = null;
        try{
        System.out.println (o.hashCode ());
        } catch (NullPointerException e){
        }
    }
}
