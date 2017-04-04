package module9.UseLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by User on 02.04.2017.
 */
public class UseStream {
    public static void main ( String[] args ) {
        List <String> list = new ArrayList <> ( );
        list.add ( "aaa" );
        list.add ( "bbb" );
        list.add ( "abc" );
        list.add ( "ddd" );
        list.add ( "fed" );

        //filter
        //Операция Filter принимает предикат, который фильтрует все элементы потока.
        // Эта операция является промежуточной, т.е. позволяет нам вызвать другую операцию (например, forEach) над результатом.
        list.stream ( )
                .filter ( ( t ) -> t.contains ( "b" ) )
                .forEach ( System.out::println );


//        list.sort ( Comparator.reverseOrder ( ) );//        list.sort ( (o1,o2)->o2.compareTo ( o1 ) );
//        list.forEach ( System.out::println );

        //sorted
        // создает всего лишь отсортированное представление и не влияет на порядок элементов в исходной коллекции.
        // Порядок строк в list остается нетронутым.
        list.stream ( ).sorted ( ( o1, o2 ) -> o2.compareTo ( o1 ) ).forEach ( System.out::println );

        list.forEach ( System.out::println );


        // map
        // Промежуточная операция map преобразовывает каждый элемент в другой объект при помощи переданной функции.
        // Следующий пример преобразовывает каждую строку в строку в верхнем регистре.
        // Однако вы так же можете использовать map для преобразования каждого объекта в объект другого типа.
        // Тип результирующего потока зависит от типа функции, которую вы передаете при вызове map.

        list.stream ( )
                .map ( String::toUpperCase )
                .sorted ( Comparator.reverseOrder ( ) )
                .forEach ( System.out::print );

        list.forEach ( System.out::println );




       //collect предоставляет данные не в виде потока, а в виде обычной коллекции
        list = list.stream ( )
                .map ( String::toUpperCase )
                .sorted ( Comparator.reverseOrder ( ) )
                .collect ( Collectors.toList () );

        list.forEach ( System.out::println );


        list.stream ( )
                .map ( String::toCharArray )
                .forEach ( System.out::print );
    }
}
