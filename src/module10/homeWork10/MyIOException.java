package module10.homeWork10;

import java.io.IOException;

/**
 * MyIOException and its subclasses are checked exceptions
 */
public class MyIOException extends IOException {
    private String exceptionDescribe;

    public MyIOException ( String message ) {
        super ( message );
        exceptionDescribe = message;
    }

    public void print(){
        System.out.println ( exceptionDescribe );
    }
}
