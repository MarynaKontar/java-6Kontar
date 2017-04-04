package module9.homeWork9;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static module9.homeWork9.Currency.*;

/**
 * Java#6
 * Module 9 Task 1
 *
 * This class consists of {@code static} utility methods for operating on Order
 *
 * @author Kontar Maryna
 */
public final class Orders {

    private Orders () {
    }

    public static void sortByPriceInDecreaseOrder ( List <Order> orders ) {
        orders.sort ( Comparator.comparing ( Order::getPrice, reverseOrder ( ) ) );
    }

    public static void sortByPriceAndUserCity ( List <Order> orders ) {
        orders.sort ( Comparator.comparing ( Order::getPrice )
                .thenComparing ( ( o1, o2 ) -> o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) ) ) );

        //TODO 1.  .thenComparing (Order::getUser().getCity(), Comparator.naturalOrder () ) );    не выходит
    }

    public static void sortByItemAndShopIdAndUserCity ( List <Order> orders ) {
        orders.sort ( Comparator
                .comparing ( Order::getItemName )
                .thenComparing ( Order::getShopIdentificator )
                .thenComparing ( ( o1, o2 ) -> o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) ) ) );
    }

    public static List <Order> getUniqueOrders ( List <Order> orders ) {
        return orders.stream ( )
                .distinct ( )
                .collect ( Collectors.toList ( ) );
//        return new ArrayList<> ( new HashSet<> ( orders ) );
    }

    public static List <Order> getOrdersWithPriceLessThan1500 ( List <Order> orders ) {
        return orders.stream ( )
                .filter ( ( Order o ) -> o.getPrice ( ) >= 1500 )
                .collect ( Collectors.toList ( ) );

//        List <Order> OrdersWithPriceLessThan1500 = new ArrayList <> ( orders );
//        OrdersWithPriceLessThan1500.removeIf ( o -> o.getPrice ( ) < 1500 );
//        return OrdersWithPriceLessThan1500;
    }

    public static List <Order> getOrdersWithSomeCurrency ( List <Order> orders, Currency currency ) {
        return orders.stream ( )
                .filter ( o -> o.getCurrency ( ) == currency )
                .collect ( Collectors.toList ( ) );

//        List <Order> ordersWithSomeCurrency = new ArrayList<> ( orders );
//        ordersWithSomeCurrency.removeIf ( o -> o.getCurrency ( ) != currency );
//        return ordersWithSomeCurrency;
    }

    public static Map <String, List <Order>> groupingByUniqueCities ( List <Order> orders ) {
        return orders.stream()
                .collect( Collectors.groupingBy(order -> order.getUser ().getCity ()));
    }

    public static boolean IfContainLastName ( List <Order> orders, String lastName ) {
        return (orders.stream ( ).anyMatch ( order -> order.getUser ( ).getLastName ( ) == lastName ));
    }

    public static void deleteOrdersInUSD ( List <Order> orders ) {
        orders.removeIf ( order -> order.getCurrency ( ) == USD );
    }
}




















//МОЖНО НЕ СМОТРЕТЬ. ОСТАВИЛА ДЛЯ СЕБЯ
//    public static void printSortedByPriceInDecreaseOrder ( List <Order> orders ) {
//        Optional.of ( orders.stream ( )
//                .sorted ( Comparator.comparing ( Order::getPrice, reverseOrder ( ) ) )
//                .collect ( Collectors.toList ( ) ) ).ifPresent ( System.out::print );
//    }


//    public static void printSortedByPriceAndUserCity ( List <Order> orders ) {
//        Optional.of ( orders.stream ( )
//                .sorted ( Comparator
//                        .comparing ( Order::getPrice )
//                        .thenComparing ( ( o1, o2 ) -> o1.getUser ( ).getCity ( ).compareTo ( o2.getUser ( ).getCity ( ) ) ) )
//                .collect ( Collectors.toList ( ) )).ifPresent ( System.out::print );
//    }
