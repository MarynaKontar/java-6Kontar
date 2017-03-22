package module7.task1_2_3;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.reverseOrder;

/**
 * Java#6
 * Module 7 Task 2
 * Create Main class where you create 10 Orders with 10 Users and put it to the List
 * - sort list by Order price in decrease order
 * - sort list by Order price in increase order AND User city
 * - sort list by Order itemName AND ShopIdentificator AND User city
 * - delete duplicates from the list
 * - delete items where price less than 1500
 * - separate list for two list - orders in USD and UAH
 *
 * @author Kontar Maryna
 */
public class MainList {

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

        List <Order> orders = new ArrayList <> ( 10 );

        Order order1 = new Order ( 50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1 );
        Order order2 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6 );
        Order order3 = new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3 );
        Order order4 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order5 = new Order ( 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5 );
        Order order6 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order7 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order8 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Ggi", user7 );
        Order order9 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order10 = new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10 );

        orders.addAll ( Arrays.asList ( order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 ) );
        System.out.println ( "Collection of orders: " );
        orders.forEach ( System.out::print );

        //    !!!!!!!!!!!           BEFORE JAVA 8
        //sort by Order price in decrease order
        Collections.sort ( orders, reverseOrder ( ) );
        print ( "Collection sorts by Order price in decrease order: ", orders );

        //sorts by Order price in increase order and User city
        Collections.sort ( orders, new Comparator <Order> ( ) {
            @Override
            public int compare ( Order o1, Order o2 ) {
                int priceIncreaseComparision = ((Integer) (o1.getPrice ( ))).compareTo ( o2.getPrice ( ) );
                if (priceIncreaseComparision != 0) {
                    return priceIncreaseComparision;
                }
                return o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) );
            }
        } );
        print ( "Collection sorts by Order price in increase order and User city: ", orders );


        //sorts by Order item name and shop identifier and user city
        Collections.sort ( orders, new Comparator <Order> ( ) {
            @Override
            public int compare ( Order o1, Order o2 ) {
                int itemNameComparision = o1.getItemName ( ).compareTo ( o2.getItemName ( ) );
                if (itemNameComparision != 0) {
                    return itemNameComparision;
                }
                int shopIdentificatorComparision = o1.getShopIdentificator ( ).compareTo ( o2.getShopIdentificator ( ) );
                if (shopIdentificatorComparision != 0) {
                    return shopIdentificatorComparision;
                }
                return o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) );
            }
        } );
        print ( "Collection sorts by Order item name and shop identifier and user city: ", orders );


        //deleting duplicates (orders are equal when equals all Orders fields except id)
        List <Order> uniqueOrders1 = new ArrayList <> ( new HashSet <> ( orders ) );
        print ( "Collection without duplicates: ", uniqueOrders1 );

        //delete items where price less than 1500
        List <Order> ordersWithPriceLessThan1500_1 = new ArrayList <> ( orders );
        for ( Iterator <Order> iterator = ordersWithPriceLessThan1500_1.iterator ( ); iterator.hasNext ( ); ) {
            if (iterator.next ( ).getPrice ( ) < 1500)
                iterator.remove ( );
        }
        print ( "Collection without items where price less than 1500: ", ordersWithPriceLessThan1500_1 );


        //separate list for two list - orders in USD and UAH
        List <Order> ordersUSD1 = new ArrayList <> ();
        List <Order> ordersUAH1 = new ArrayList <> ();
        for ( Order order : orders ) {
            if (order.getCurrency() == Currency.UAH)
                ordersUAH1.add (order);
            else if (order.getCurrency() == Currency.USD)
                ordersUSD1.add (order);        }
        print ( "Orders in USD: " ,ordersUSD1);
        print ( "Orders in UAH: ",ordersUAH1 );


        //separate list for as many lists as many unique cities are in User
        Map<String, List<Order>> uniqueCitiesMap = new TreeMap <> ();
        String city;
        for ( Order order : orders ) {
            city = order.getUser().getCity();
            List<Order> list = uniqueCitiesMap.get (city);
            if(list == null){
                list = new ArrayList <Order> ();
            uniqueCitiesMap.put ( city,list );
            }
                list.add ( order );
        }
        for ( String key : (uniqueCitiesMap.keySet ( )) ) {
            print ( key.toString (), uniqueCitiesMap.get ( key ));
        }


//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //    !!!!!!!!!!!           WITH LAMBDAS
        //sort by Order price in decrease order
        orders.sort ( reverseOrder ( ) );
        System.out.println ( "Collection sorts by Order price in decrease order: " );
        orders.forEach ( System.out::print );

        //sorts by Order price in increase order and User city
        orders.sort ( ( Order o1, Order o2 ) -> {
            int priceIncreaseComparision = ((Integer) (o1.getPrice ( ))).compareTo ( o2.getPrice ( ) );
            if (priceIncreaseComparision != 0) {
                return priceIncreaseComparision;
            }
            return o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) );
        } );
        System.out.println ( "Collection sorts by Order price in increase order and User city: " );
        orders.forEach ( System.out::print );

        //sorts by Order item name and shop identifier and user city
        orders.sort ( ( o1, o2 ) -> {
            int itemNameComparision = o1.getItemName ( ).compareTo ( o2.getItemName ( ) );
            if (itemNameComparision != 0) {
                return itemNameComparision;
            }
            int shopIdentificatorComparision = o1.getShopIdentificator ( ).compareTo ( o2.getShopIdentificator ( ) );
            if (shopIdentificatorComparision != 0) {
                return shopIdentificatorComparision;
            }
            return o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) );
        } );
        System.out.println ( "Collection sorts by Order item name and shop identifier and user city: " );
        orders.forEach ( System.out::print );

        //deleting duplicates (orders are equal when equals all Orders fields except id)
        List <Order> uniqueOrders = new ArrayList <> ( new HashSet <> ( orders ) );
        System.out.println ( "Collection without duplicates: " );
        uniqueOrders.forEach ( ( order ) -> System.out.print ( order ) );

        //delete items where price less than 1500
        List <Order> ordersWithPriceLessThan1500 = new ArrayList <> ( orders );
        ordersWithPriceLessThan1500.removeIf ( o -> o.getPrice ( ) < 1500 );
        System.out.println ( "Collection without items where price less than 1500: " );
        ordersWithPriceLessThan1500.forEach ( ( order ) -> System.out.print ( order ) );

        //separate list for two list - orders in USD and UAH
        List <Order> ordersUSD = new ArrayList <> ( orders );
        ordersUSD.removeIf ( o -> o.getCurrency ( ) != Currency.USD );
        System.out.println ( "Orders in USD: " );
        ordersUSD.forEach ( ( order ) -> System.out.print ( order ) );

        List <Order> ordersUAH = new ArrayList <> ( orders );
        ordersUAH.removeAll ( ordersUSD );
        System.out.println ( "Orders in UAH: " );
        ordersUAH.forEach ( ( order ) -> System.out.print ( order ) );

        //separate list for as many lists as many unique cities are in User
        //Did not do this with lambdas
    }


    private static void print ( String string, List orders ) {
        System.out.println ( string );
        System.out.println ( orders );
    }
}
