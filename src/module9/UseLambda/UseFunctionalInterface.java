package module9.UseLambda;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by User on 01.04.2017.
 */
public class UseFunctionalInterface {
    public static void main ( String[] args ) {

        //Predicate         Represents a predicate (boolean-valued function) of one argument.
        //public interface Predicate<T> {boolean test(T t);}
        Predicate <String> predicate = s -> s.length ( ) > 0;
        System.out.println ( predicate.test ( "Foo" ) );
        boolean stringTest = predicate.and ( s -> s.length ( ) < 3 ).negate ( ).test ( "dfghjt" );
        System.out.println ( stringTest );

        Predicate <Boolean> nonNull = Objects::nonNull;
        System.out.println ( nonNull.test ( null ) );

        Predicate <String> isEmpty = String::isEmpty;
        Predicate <String> isNotEmpty = isEmpty.negate ( );
        System.out.println ( isNotEmpty.test ( "" ) );

        //Function         accepts one argument and produces a result.
        //public interface Function<T, R> {R apply(T t);}
        //Function<ВХОДЯЩИЙ ТИП, ВЫХОДЯШИЙ ТИП>
        Function <String, Integer> toInteger = Integer::valueOf;
        Function <String, String> backToString = toInteger.andThen ( String::valueOf );
        System.out.println ( backToString.apply ( "126" ) );

        //Supplier    предоставляют результат заданного типа. В отличии от функций, поставщики не принимают аргументов.
        //НЕТ ВХОДЯЩИХ, ВЫХОДЯЩИЙ - ЗАДАННЫЙ ТИП
        //public interface Supplier<T> { T get();  }
        Supplier<Person> personSupplier = Person::new;
        System.out.println ( personSupplier.get ( ) );

        //Consumer  представляют собой операции, которые производятся на одним входным аргументом.
        // VOID НАД ВХОДЯЩИМ АРГУМЕНТОМ
        //public interface Consumer<T> {void accept(T t);}
        Consumer<Person> greeter = person -> System.out.println ("Hello " + person.getFirsttName () );
        greeter.accept ( new Person ( "Luke", "Skywalker" ) );


        //Comparator
        //public interface Comparator<T> { int compare(T o1, T o2);....}
//        Comparator<Person> comparator = (p1, p2) -> p1.getFirsttName ().compareTo ( p2.getFirsttName () );
        Comparator<Person> comparator = Comparator.comparing ( Person::getFirsttName);
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");
        comparator.compare ( p1, p2 );
        comparator.reversed ().compare ( p1, p2 );


        /**
         * Опциональные значения
         Опциональные значения (optionals) не являются функциональными интерфейсами, однако являются удобным
         средством предотвращения NullPointerException.
         Опциональные значение — это по сути контейнер для значения, которое может быть равно null.
         Например, вам нужен метод, который возвращает какое-то значение, но иногда он должен возвращать пустое значение.
         Вместо того, чтобы возвращать null, в Java 8 вы можете вернуть опциональное значение.
         */
         Optional<String> optional = Optional.of("bam");
        System.out.println ( optional.isPresent ( ) );  //true
        System.out.println ( optional.get ( ) );   // "bam"
        System.out.println ( optional.orElse ( "fallback" ) );  // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"


    }


}
