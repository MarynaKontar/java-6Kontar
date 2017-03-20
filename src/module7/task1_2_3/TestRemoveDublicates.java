package module7.task1_2_3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by User on 16.03.2017.
 */
public class TestRemoveDublicates {
    public static void main ( String[] args ) {
        User user1 = new User ( "Tanya", "Kysla", "Kiyv", 20000 );
        User user2 = new User ( "Pavel", "Rosovskiy", "Kharkiv", 15000 );
        User user3 = new User ( "Vladimir", "Burtsev", "Dnepropetrovsk", 2050 );
        User user4 = new User ( "Andrey", "Ponomarenko", "Kyiv", 3200 );
        User user5 = new User ( "Gingembre", "Guillaume", "Lviv", 4500 );
        User user6 = new User ( "Maryna", "Kontar", "Lviv", 3200 );
        User user7 = new User ( "Andrey", "Berezin", "Kharkiv", 20000 );
        User user8 = new User ( "Alexandr", "Driga", "Kyiv", 15000 );
        User user9 = new User ( "Denis", "Ivashkov", "Rivne", 2050 );
        User user10 = new User ( "Vitalii", "Proskura", "Rivne", 2050 );


        List <Order> orders = new ArrayList <> ( 120 );


        Order order1 = new Order ( 50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1 );
        Order order2 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6 );
        Order order3 = new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3 );
        Order order4 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order5 = new Order ( 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5 );
        Order order6 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Iraton", user2 );
        Order order7 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order8 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Ggi", user7 );
        Order order9 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order10 = new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10 );


       //                        ADD ELEMENTS TO LIST
        orders.addAll ( Arrays.asList ( order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 ) );
        long start;
        final int LIST_SIZE = 2;

        start = System.currentTimeMillis ( );
        for ( int i = 0; i < LIST_SIZE; i++ ) {
            orders.addAll ( Arrays.asList ( order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 ) );
            //orders.add ( new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10 ) );
        }
        System.out.println ( "TIME OF ADDING ELEMENTS TO THE ArrayList : " + (System.currentTimeMillis ( ) - start) + " ms" );
        //165 ms       for 1100010 size
        System.out.println ( orders.size ( ) );

//                              REMOVE DUPLICATES ELEMENTS FROM ArrayList

//        //        1. remove from array
//        start = System.currentTimeMillis ( );
//        Object[] st = orders.toArray ( );
//        for ( Object s : st ) {
//            if (orders.indexOf ( s ) != orders.lastIndexOf ( s )) {
//                orders.remove ( orders.lastIndexOf ( s ) );
//            }
//        }
//        System.out.println ( "ArrayList delete duplicates(remove from array) : " + (System.currentTimeMillis ( ) - start) + " ms" );
//        System.out.println ( orders.size ( ) );
//        System.out.println (orders );
//        //86681 ms      for 1100010 size


//        //        2. stream
//        start = System.currentTimeMillis();
//        orders = orders.stream().distinct().collect( Collectors.toList());
//        System.out.println("ArrayList delete duplicates(stream) : " + ( System.currentTimeMillis() - start ) + " ms");
//        System.out.println (orders.size () );
//        //~200-277 ms      for 1100010 size



//        //        3. LinkedHashSet
//        start = System.currentTimeMillis();
//        orders = new ArrayList<Order>(new LinkedHashSet<Order> (orders));
//        System.out.println("ArrayList delete duplicates(LinkedHashSet (сохраняется порядок)) : "
//                + ( System.currentTimeMillis() - start ) + " ms");
//        System.out.println ( orders );
//        //73-148 ms      for 1100010 size


        //        4. HashSet1
        start = System.currentTimeMillis();
        orders = new ArrayList<>(new HashSet<> (orders));
        System.out.println("ArrayList delete duplicates(HashSet) : " + ( System.currentTimeMillis() - start ) + " ms");
        System.out.println ( orders );
        //~100-175 ms      for 1100010 size


//        //        5. HashSet2
//        start = System.currentTimeMillis ( );
//        Set <Order> ordersSetDublicates = new HashSet <> ( );
//        ordersSetDublicates.addAll ( orders );
//        orders.clear ( );
//        orders.addAll ( ordersSetDublicates );
//        System.out.println ( "ArrayList delete duplicates(HashSet) : " + (System.currentTimeMillis ( ) - start) + " ms" );
//        //106-336 ms    for 1100010 size
//        System.out.println ( orders.size ( ) );//
//        System.out.println ( ordersSetDublicates.size ( ) );//


//        //        6. Iterator + contains
//        List <Order> ordersListUnique = new ArrayList <> ( );
//        start = System.currentTimeMillis ( );
//        Iterator <Order> orderIterator = orders.iterator ( );
//        Order next;
//        System.out.println ( orders.size ( ) );
//        while (orderIterator.hasNext()) {
//            next = orderIterator.next();
//            if (!ordersListUnique.contains(next))
//                ordersListUnique.add(next);
//        }
//        System.out.println ( "ArrayList delete duplicates(Iterator + contains) : " + (System.currentTimeMillis ( ) - start) + " ms" );
//        // ~ 38-69 ms    for 1100010 size
//        System.out.println (ordersListUnique);



//        //        7. contains + removeAll + addAll
//        start = System.currentTimeMillis ( );
//       Set<Order> ordersSetDublicates = findDuplicates(orders);
//        //System.out.println ( ordersSetDublicates );
//        orders.removeAll ( ordersSetDublicates );
//        orders.addAll ( ordersSetDublicates );
//        System.out.println ( "ArrayList delete duplicates(contains + removeAll + addAll) : "
//                + (System.currentTimeMillis ( ) - start) + " ms" );
//        //150-336 ms    for 1100010 size
//        System.out.println ( orders );

    }


//    public static Set<Order> findDuplicates(List<Order> list) {
//        Set<Order> items = new HashSet<>();
//        Set<Order> duplicates = new HashSet<>();
//        for (Order item : list) {
//            if (items.contains(item)) {
//                duplicates.add(item);
//        } else {
//            items.add(item);
//        }
//        } return duplicates; }




}
