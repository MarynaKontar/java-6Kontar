package module10.ExceptionFromjdk;

/**
 * ЧТО РАНЬШЕ УПАДЕТ(ЗАКОНЧИТСЯ ПАМЯТЬ В) STACK ИЛИ HEAP (StackOverflowError ИЛИ OutOfMemoryError)
 * ЕСЛИ ПЛОДИМ БОЛЬШИЕ СУШНОСТИ В heap (new Object[]{new Object[SIZE], size=1 Mb) то заканчивается быстрее куча (OutOfMemoryError)
 * Если маленькие (по 1 Kb), то быстрее заканчивается стек (StackOverflowError)
 */
public class OOME_vs_SOEExample {
//    public static final int SIZE = 1024 * 1024; //1 Mb   //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    public static final int SIZE = 1024 ; //1 Kb   //Exception in thread "main" java.lang.StackOverflowError
    public static void main ( String[] args ) {
        f(new Object[]{new Object[SIZE]});

    }

    private static void f ( Object[] tail ) {
        f(new Object[]{tail, new Object[SIZE]});
    }
}
