package module7.voprosOtvet;

/**
 * Created by User on 13.03.2017.
 */
public class UsePrimitives {
    int var; //можно не инициализировать, п.ч.  статич. получают начальное значение при подгрузке классса в приложение
    public static void main ( String[] args ) {
        int varLocal = 10; //в методе всегда надо инициализировать
        for ( int i = 0; i < varLocal; i++ ) {

        }
        if (true){
            method ( );
        }    }

    private static void method () {
        method();
    }
}
