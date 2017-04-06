package module10.ExceptionFromjdk;

/**
 * Exception in thread "main" java.lang.StackOverflowError
 at module10.ExceptionFromjdk.StackOverflowErrorExample.f(StackOverflowErrorExample.java:12)
 ПЕРЕПОЛНЯЕТСЯ ПАМЯТЬ СТЕКА - Т.Е. ЛОКАЛЬНАЯ ПАМЯТЬ ВЫДЕЛЕННАЯ ПОД ВНУТРЕННИЕ ПЕРЕМЕННЫЕ МЕТОДА
 т.е ЕЕ МОЖНО ПЕРЕПОЛНИТЬ НАПЛОДИВ КУЧУ ПЕРЕМЕННЫХ ВНУТРИ МЕТОДА (В НАШЕМ СЛУЧАЕ - РЕКУРСИЯ)
 */
public class StackOverflowErrorExample {
    public static void main ( String[] args ) {
        f();
    }

    private static void f () {
        f ();
    }
}
