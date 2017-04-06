package module10.TestExceptionsAndErrors;

/**
 * Created by User on 05.04.2017.
 */
public class TestThrows {
    public static void main ( String[] args ) throws Exception {
//        Exception e = new Exception (  );// можно создавать cheked объекты (например, Exception) не объявляя throws Exception
        //пока мы его не "кинули" (throw e;). Если кидаем, то для cheked надо прописывать throws или try - catch.
        // Но смысла просто создавать объект Exception нет

        throw new Exception ( );


//для  RuntimeException и Error не надо писать в методе main throws RuntimeException или throws Error,
// т.к. RuntimeException (и его наследники) и   Error(и его наследники) - uncheked
//        throw new RuntimeException (  );  //
//        throw new Error();



    }
}
