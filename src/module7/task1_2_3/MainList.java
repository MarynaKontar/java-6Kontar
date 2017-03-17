package module7.task1_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;

/**
 * Create Main class where you create 10 Orders with 10 Users and put it to the List
 * - sort list by Order price in decrease order
 * - sort list by Order price in increase order AND User city
 * - sort list by Order itemName AND ShopIdentificator AND User city
 */
public class MainList {

    public static void main ( String[] args ) {

        //Order[] orders = new Order[10];

         User user1 = new User("Tanya", "Kysla", "Kiyv", 20000);
         User user2 = new User("Pavel", "Rosovskiy", "Kharkiv", 15000);
         User user3 = new User("Vladimir", "Burtsev", "Dnepropetrovsk", 2050);
         User user4 = new User("Andrey", "Ponomarenko", "Kyiv", 3200);
         User user5 = new User("Gingembre", "Guillaume", "Lviv", 4500);
         User user6 = new User("Maryna", "Kontar", "Lviv", 3200);
         User user7 = new User("Andrey", "Berezin", "Kharkiv", 20000);
         User user8 = new User("Alexandr", "Driga", "Kyiv", 15000);
         User user9 = new User("Denis", "Ivashkov", "Rivne", 2050);
         User user10 = new User("Vitalii", "Proskura", "Rivne", 2050);


        List <Order> orders = new ArrayList <> (10);


        Order order1 = new Order ( 50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1);
        Order order2 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6);
        Order order3 = new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3);
        Order order4 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2);
        Order order5 = new Order ( 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5);
        Order order6 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Iraton", user2);
        Order order7 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8);
        Order order8 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Ggi", user7);
        Order order9 = new Order ( 48, Currency.USD, "T-shirt model 25 L", "Oggi", user8);
        Order order10 = new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10);


       orders.addAll( Arrays.asList ( order1, order2, order3, order4, order5, order6,  order7, order8, order9, order10));

        //Collections.addAll ( orders, order1, order2, order3, order4, order5, order6,  order7, order8, order9, order10); //before java 8
        print ("Collection of orders: ",orders);

//        Collections.sort(orders); //before java 8

        orders.sort(reverseOrder());
        // Collections.sort(orders,reverseOrder()); //before java 8
        print ("Reverse order collection: ",orders);

        Collections.sort(orders, new Order.OrderPriceIncreaseAndUserCityComparator());
        print ("Order price in increase order and user city order collection: ",orders);

        Collections.sort(orders, new Order.OrderItemNameAndShopIdentificatorAndUserCityComparator());
        print ("Order item name and shop identificator and user city order collection: ",orders);

        /**
         * Удаление дубликатов
         */
        long start;
        start = System.currentTimeMillis();
        for ( int i = 0; i < 100000; i++ ) {
            orders.addAll ( Arrays.asList ( order1, order2, order3, order4, order5, order6,  order7, order8, order9, order10) );
            orders.add(new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10 ));
        }
        System.out.println("ArrayList add : " + ( System.currentTimeMillis() - start ) + " ms");
        System.out.println (orders.size () );

        start = System.currentTimeMillis();
        Object[] st = orders.toArray();
        for (Object s : st) {
            if (orders.indexOf(s) != orders.lastIndexOf(s)) {
                orders.remove(orders.lastIndexOf(s));
            }
        }
        System.out.println("ArrayList remove : " + ( System.currentTimeMillis() - start ) + " ms");
        System.out.println (orders.size () );

        start = System.currentTimeMillis();
        orders = orders.stream().distinct().collect( Collectors.toList());
        System.out.println("ArrayList remove : " + ( System.currentTimeMillis() - start ) + " ms");
        System.out.println (orders.size () );
    }


    private static void print (String string, List orders) {
        System.out.println ( string );
        System.out.println (orders);
    }

}




/*
*
*       orders.add ( new Order ( 50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1) );
        orders.add ( new Order ( 1500, Currency.UAH, "Shoes black model 102 s.38", "Miraton", user2) );
        orders.add ( new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3) );
        orders.add ( new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2) );
        orders.add ( new Order ( 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5) );
        orders.add ( new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2) );
        orders.add ( new Order ( 48, Currency.USD, "T-shirt model 35 L", "Oggi", user8) );
        orders.add ( new Order ( 48, Currency.USD, "T-shirt model 35 L", "Oggi", user8) );
        orders.add ( new Order ( 48, Currency.USD, "T-shirt model 35 L", "Oggi", user8) );
        orders.add ( new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10) );
*
*
*
        Order order1 = new Order ( 50, Currency.USD, "Shoes blue model 345 s.41", "Miraton", user1);
        Order order2 = new Order ( 1500, Currency.UAH, "Shoes black model 102 s.38", "Miraton", user2);
        Order order3 = new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3) );
        Order order4 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2);
        Order order5 = new Order ( 55, Currency.USD, "Dress yellow model 04 S", "Otto", user5) );
        Order order6 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2);
        Order order7 = new Order ( 48, Currency.USD, "T-shirt model 35 L", "Oggi", user8);
        Order order8 = new Order ( 48, Currency.USD, "T-shirt model 35 L", "Oggi", user8);
        Order order9 = new Order ( 48, Currency.USD, "T-shirt model 35 L", "Oggi", user8);
        Order order10 = new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10);
* */