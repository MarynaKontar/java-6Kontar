package module8.homeWork8;

import module8.homeWork8.food.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static module8.homeWork8.Country.*;

/**
 * Created by User on 25.03.2017.
 */
public class Main {
    public static void main ( String[] args ) {

        Map<Fruit, Double> fruits = new HashMap <> ();
        fruits.put (new Orange ( "Mini Oranges" ,ARGENTINA, 30), 28.0);
        fruits.put (new Apple ( " Fuji" ,GEORGIA, 40), 21.0);
        fruits.put (new Apple ( "Gala" ,LITHUANIA, 30), 14.0);

        Map<Food, Double> database = new HashMap <> ( );
        database.put ( new Eggs ( "Quail eggs" ,UKRAINE, 10), 23.0);
        database.put ( new Bread ( "Rye bread" ,UKRAINE, 10), 23.0);
        database.putAll ( fruits );



//        long k;
//        for ( int i = 0; i < 10; i++ ) {
//            k = IdGenerator.idGenerate ();
//            System.out.println (k);
//        }

    }
}
