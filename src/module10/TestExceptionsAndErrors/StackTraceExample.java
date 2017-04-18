package module10.TestExceptionsAndErrors;

/**
 * Created by User on 11.04.2017.
 */
public class StackTraceExample {
    public static void main ( String[] args ) {
        try{
            aaa();
        }catch(RuntimeException e){
//            e.printStackTrace ();
        StackTraceElement[] stackTraceElements = e.getStackTrace ();
            for ( StackTraceElement oneCall : stackTraceElements ) {
                System.out.println (oneCall.getMethodName () );

            }
        }
    }

    private static void aaa () {
        bbb();
    }

    private static void bbb () {
        ccc();
    }

    private static void ccc () {
        throw new RuntimeException (  );
    }
}


/**
 * java.lang.RuntimeException
 at module10.TestExceptionsAndErrors.StackTraceExample.ccc(StackTraceExample.java:24)
 at module10.TestExceptionsAndErrors.StackTraceExample.bbb(StackTraceExample.java:20)
 at module10.TestExceptionsAndErrors.StackTraceExample.aaa(StackTraceExample.java:16)
 at module10.TestExceptionsAndErrors.StackTraceExample.main(StackTraceExample.java:9)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:498)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
 */
