package module10.homeWork10;

/**
 * MyArithmeticException and its subclasses are unchecked exceptions
 */
public class MyArithmeticException extends ArithmeticException {

    private String exceptionDescribe;
    public MyArithmeticException ( String s ) {
       super ( s );
       exceptionDescribe = s;
    }

    public void print(){
        System.out.println ( exceptionDescribe );
    }
}
