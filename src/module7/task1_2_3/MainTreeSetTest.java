package module7.task1_2_3;

import java.util.*;

/**
 * Java#6
 * Module 7 Task 3
 * Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet.
 * You should create 8 unique and two duplicated Orders
 * - check if set contain Order where User’s lastName is - “Petrov”
 * - print Order with largest price using only one set method - get
 * - delete orders where currency is USD using Iterator
 *
 * @author Kontar Maryna
 */
public class MainTreeSetTest {
    public static void main ( String[] args ) {
        User user1 = new User ( "Tanya", "Kysla", "Kyiv", 20000 );
        User user2 = new User ( "Pavel", "Rosovskiy", "Kharkiv", 15000 );
        User user3 = new User ( "Vladimir", "Burtsev", "Dnepropetrovsk", 2050 );
        User user4 = new User ( "Andrey", "Ponomarenko", "Kyiv", 3200 );
        User user5 = new User ( "Gingembre", "Guillaume", "Lviv", 4500 );
        User user6 = new User ( "Maryna", "Kontar", "Lviv", 3200 );
        User user7 = new User ( "Andrey", "Berezin", "Kharkiv", 20000 );
        User user8 = new User ( "Alexandr", "Driga", "Kyiv", 15000 );
        User user9 = new User ( "Denis", "Ivashkov", "Rivne", 2050 );
        User user10 = new User ( "Vitalii", "Proskura", "Rivne", 2050 );

        TreeSet <Order> orders = new TreeSet <> ( );

        orders.add ( new Order ( 50, Currency.USD, "Slippers yellow model 345 s.41", "Otto", user1 ) );
        orders.add ( new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6 ) );
        orders.add ( new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3 ) );
        orders.add ( new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 ) );
        orders.add ( new Order ( 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5 ) );
        orders.add ( new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user4 ) );
        orders.add ( new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 ) );
        orders.add ( new Order ( 15, Currency.USD, "Cap model 12", "Oggi", user7 ) );
        orders.add ( new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 ) );
        orders.add ( new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10 ) );

        System.out.println ( "Orders: " + orders );

        System.out.println ( ifContainOrderWithLastName ( orders, "Berezin" ) );

        List <Order> maxPrice = orderWithMaxPrice ( orders );
        System.out.println ( maxPrice );

        removeOrdersWithCurrencyInUSD ( orders );
        System.out.println ( "Orders without currency in USD: \n" + orders );


    }

    private static void removeOrdersWithCurrencyInUSD ( TreeSet <Order> orders ) {
        Iterator <Order> iterator = orders.iterator ( );
        Order order;
        while (iterator.hasNext ( )) {
            order = iterator.next ( );
            if (order.getCurrency ( ) == Currency.USD)
                iterator.remove ( );
        }
    }


    //TODO 4. Что-то я сильно намудрила с єтим методом (аж два прохода по дереву, но только с get проше не выходит.
    // В комментариях второй вариант метода с last ())
    private static List <Order> orderWithMaxPrice ( TreeSet <Order> orders ) {
        List <Order> maxPriceList = new ArrayList <> ( );
        int maxPrice = 0;
        for ( Order order : orders ) {
            if (order.getPrice ( ) > maxPrice) {
                maxPrice = order.getPrice ( );
            }
        }
        for ( Order order : orders ) {
            if (order.getPrice ( ) == maxPrice)
                maxPriceList.add ( order );
        }
        return maxPriceList;
//        Order maxPrice1 = orders.last ();
//        for ( Order order : orders ) {
//            if (order.getPrice() == maxPrice1.getPrice())
//                maxPriceList.add ( order );
//        }
//        return maxPriceList;
    }

    private static boolean ifContainOrderWithLastName ( TreeSet <Order> orders, String lastName ) {
        for ( Order order : orders ) {
            if (order.getUser ( ).getLastName ( ).equals ( lastName )) {
                return true;
            }
        }
        return false;
    }
}
