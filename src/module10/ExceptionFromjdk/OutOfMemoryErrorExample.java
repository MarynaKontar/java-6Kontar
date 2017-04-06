package module10.ExceptionFromjdk;

/**
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * "КУЧА" (heap) ПОЛНОСТЬЮ ЗАПОЛНЯЕТСЯ ОНОВЫМИ ОБЪЕКТАМИ С ПОМОЩЬЮ БЕСКОНЕЧНОГО while.
 * И КОГДА КУЧА ЗАПОЛНИТСЯ ВЫДАЕТ ОШИБКУ OutOfMemoryError
 */
public class OutOfMemoryErrorExample {
    public static final int SIZE = 1024 * 1024; //1 Mb
    public static void main ( String[] args ) {
        Object[] tail = null;
        while(true){
            tail = new Object[]{tail, new Object[SIZE]};
        }

    }
}
