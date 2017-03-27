package module8;

import LectureAndPractice.module3.webinar.Car;
import module8.homeWork8.food.Bread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 27.03.2017.
 */
public class UseGenerics {

    public static <T extends Comparable<? super T>> T max ( List <? extends T> list ) {
        int maxPrice = 0;
        T WithMaxValue = null;
        Collections.sort(list);
        WithMaxValue = list.get ( list.size () - 1 );
        return WithMaxValue;
    }

    public static void main ( String[] args ) {
        List <Car> cars = new ArrayList <> ( );
        Car honda1 = new Car ( 2010, "civik1", 20000, "Jack" );
        Car honda2 = new Car ( 2010, "civik2", 10000, "Jack" );
        cars.add ( honda1 );
        cars.add ( honda2 );

        Car max = max ( cars );
        System.out.println ( max );
        putIn ( 5.0454 );
        putIn ( new Double ( 5.0454 ) );
        putIn ( new Integer ( 5 ) );
//        putIn ( new String ("sdewt") );//compilation error

        List<String> names = new ArrayList <> (  );
        names.add ( "fdgtr" );
        names.add ( "eqwrt" );
        names.add ( "yuiopot" );
        names.add ( ".kjytg" );
        names.add ( "awsdfdhg" );
        System.out.println (max(names) );
    }

    static <T extends Number> void putIn ( T param ) {
    }

    ;

    static <T> void putTTIn ( Class <? super Bread> param ) {
    }


}
