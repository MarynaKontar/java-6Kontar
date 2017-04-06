package module10.TestExceptionsAndErrors;

/**
 * Created by User on 05.04.2017.
 */
public class ExceptionTestTryCatch {
    public static void main ( String[] args ) {
        try {
            System.out.println ( 0 );
            System.err.println ( 333 );
            throw new RuntimeException ( );//искуственно сделали (""кинули") исклучение, чтобі оно попало в catch  (e=new RuntimeException ( ))
        //на самом деле исключение кидается, например, когда заходими в какую-то библиотеку
        } catch (RuntimeException e) {
            System.out.println ( "catch RuntimeException" );
        }

        System.out.println (2);




               try {
            System.out.println ( 0 );
            throw new RuntimeException ( );//после кидания exception ищется такой блок catch, в котором эта ошибка или ее предок
        } catch (Exception e) {  //Throwable тоже словит эту ошибку (т.к Throwable и Exception - предки RuntimeException),
            // а Error - не словит єту ошибку, т.к. не является предкомRuntimeException
            System.out.println ( "catch RuntimeException" );
        }

        System.out.println (2);
//0 catch RuntimeException  2
        System.out.println ("ghj" );

        try {
            System.out.println ( 0 );
            throw new RuntimeException ( );
        } catch (NullPointerException e) { //NullPointerException это наследник RuntimeException и поєтому здесь не ловится RuntimeException
            System.out.println ( "1" );
        } catch (RuntimeException e) {
            System.out.println ( "2" );//словит этот catch, п.ч. NullPointerException это наследник RuntimeException
        } catch (Exception e) {
            System.out.println ( "3" );
        }

        System.out.println (4);
//  0 2 4


//
//        System.out.println ("ghj" );
//        try {
//            System.out.println ( 0 );
//            throw new RuntimeException ( );
//        } catch (NullPointerException e) {
//            System.out.println ( "1" );
//        }
//        System.out.println (4);
//генерируется исключение т.к. NullPointerException не RuntimeException и не его предок (а наследник)


//        System.out.println ("ghj" );
//        try {
//            System.out.println ( 0 );
//            throw new RuntimeException ( );
//        } catch (NullPointerException e) {
//            System.out.println ( "1" );
//        }catch (ArithmeticException e) {
//            System.out.println ( "2" );
//        }
//        System.out.println (3);
//генерируется исключение




//
//        System.out.println ("ghj" );
//        try {
//            System.out.println ( 0 );
//            throw new NullPointerException ( );
//        } catch (ArithmeticException e) {
//            System.out.println ( "1" );
//        } catch (Exception e) {
//            System.out.println ( "2" );
//        } catch (RuntimeException e) {
//            System.out.println ( "3" );
//        }
//        System.out.println (4);
//ошибка компиляции, т.к. catch (RuntimeException e) никогда не сможет выполниться, п.ч. перехватится в catch (Exception e)
        //предок стоит перед потомком




//        System.out.println ("ghj" );
//        try {
//            System.out.println ( 0 );
//            throw new NullPointerException ();
//        } catch (NullPointerException e) {
//            System.out.println ( "1" );
//            throw new ArithmeticException (  );
//        } catch (ArithmeticException e) {
//            System.out.println ( "2" );
//        }
//        System.out.println (4);
////выполняется только первый catch - ловит NullPointerException, и генерит новый ArithmeticException, который не ловится
//        // следующим catch (ArithmeticException e), т.к. этот catch относится еще к  try.
//        // Поэтому здесь будет  ArithmeticException




//        System.out.println ("ghj" );
//        try {
//            System.out.println ( 0 );
//            throw new NullPointerException ();
//        } catch (NullPointerException e) {
//            System.out.println ( "1" );
//            throw e;
//        } catch (ArithmeticException e) {
//            System.out.println ( "2" );
//        }
//        System.out.println (4);
////тоже самое выдаст (ArithmeticException),

        System.out.println ("ghj" );
//        System.out.println (f() );
//RuntimeException, но печатает 0  1 п.ч.  finally приостанавливает RuntimeException, печатает 1,
// а потом выкидывается RuntimeException



//        System.out.println (g() );
        // 0 1 NullPointerException,


        try{
            System.out.println (10 );
            throw new NullPointerException (  );
        } catch(NullPointerException e) {
            System.out.println (11 );
        } finally {
            System.out.println (155 );
        }// за эту скобку не выйдем, если в catch или finally кмнем исключение ( throw new...)
        System.out.println (6 );



//
//        try{
//            System.out.println (0 );
//            throw new RuntimeException (  );
//        } catch(NullPointerException e) {
//            System.out.println (1 );
//        } finally {
//            System.out.println (55 );
//        }
//        System.out.println (6 );
////0  (catch не ловит п.ч. RuntimeException  не NullPointerException и не его наследник)  55(finally выполняется)  и кидает RuntimeException




//
//        try{
//            System.out.println (0 );
//            throw new NullPointerException (  );
//        } catch(NullPointerException e) {
//            System.out.println (1 );
//            throw new IllegalArgumentException (  );
//        } finally {
//            System.out.println (55 );
//        }// за эту скобку не выйдем, т.к. в catch кинули исключение ( throw new...)
//       // System.out.println (6 );
//        //0  1  55  IllegalArgumentException
//        //нейтрализовали NullPointerException с помощью catch, но кинули IllegalArgumentException, поэтому за конец блока
//        //finally не пойдет, но обязательно зайдет в блок finally (55)
//


//
//        try{
//            System.out.println (0 );
//            throw new NullPointerException (  );
//        } catch(NullPointerException e) {
//            System.out.println (1 );
//
//        } finally {
//            System.out.println (55 );
//            throw new IllegalArgumentException (  );
//        }// за эту скобку не выйдем, т.к. в finally кинули исключение ( throw new...)
//        // System.out.println (6 );
//        //0  1  55  IllegalArgumentException
//        //нейтрализовали NullPointerException с помощью catch, зашли в finally, но кинули IllegalArgumentException,
//        // поэтому за конец блока finally не пойдет



//        try{
//            System.out.println (0 );
//            throw new NullPointerException (  );
//        } catch(NullPointerException e) {
//            System.out.println (1 );
//            throw new IllegalArgumentException (  );
//        } catch(IllegalArgumentException e) {
//            System.out.println (2 );
//        } finally {
//            System.out.println (55 );
//        }// за эту скобку не выйдем, т.к. IllegalArgumentException не словится во втором catch п.ч. он принадлежит к try
//        // (т.е. к поиску throw new NullPointerException (  ))
//       // System.out.println (6 );
//        //0  1  55  IllegalArgumentException
//        //нейтрализовали NullPointerException с помощью catch, но кинули IllegalArgumentException,
//        // который  не словится во втором catch поэтому за конец блока
//        //finally не пойдет, но обязательно зайдет в блок finally (55)


    }





    private static int f () {
        try{
            System.out.println (0 );
//            return 45;  //0  1   45  finally приостанавливает return
            throw new RuntimeException (  );//finally приостанавливает RuntimeException, печатает 1, а потом выкидывается RuntimeException
        } finally {
            System.out.println (1 );
        }
    }


    private static int g () {
        try{
            System.out.println (0 );
            throw new RuntimeException (  );
        } finally {
            System.out.println (1 );
            throw new NullPointerException (  );
        }
    // 0 1 NullPointerException,
        // п.ч. сначала выкинулось RuntimeException, но приостановилось finally, в котором кинуло NullPointerException
        //ПОЭТОМУ НЕЛЬЗЯ В finally ПИСАТЬ throw И return. БЛОК try ДОЛЖЕН ОТВЕЧАТЬ ЗА ЛОГИКУ (throw И return),
        // А В finally ТОЛЬКО ТО, ЧЕМ В ЛЮБОМ СЛУЧАЕ ДОЛЖНО ВСЕ ЗАКОНЧИТЬСЯ В МЕТОДЕ (ДАННОЙ ЧАСТИ КОДА)
    }


}


//Иерархия исключений - ошибок :

//        Throwable (implements Serializable )   - checked
//        Error extends Throwable                - unchecked
//        Exception extends Throwable            - checked
//        RuntimeException extends Exception     - unchecked
