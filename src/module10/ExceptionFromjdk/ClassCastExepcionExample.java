package module10.ExceptionFromjdk;

/**
 * Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to [I
 * ПЫТАЮСЬ ПРИВЕСТИ РОДИТЕЛЯ (Object()) К ТИПУ НАСЛЕДНИКА (int[])
 */
public class ClassCastExepcionExample {
    public static void main ( String[] args ) {
        int[] array = (int[]) new Object();
    }
}
