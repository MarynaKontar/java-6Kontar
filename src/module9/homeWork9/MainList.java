package module9.homeWork9;

import java.util.*;
import static module9.homeWork9.Currency.*;
import static module9.homeWork9.Orders.*;

/**
 * Java#6
 * Module 9 Task 1
 * Create Main class where you create 10 Orders with 10 Users and put it to the List
 * - sort list by Order price in decrease order-отсортируйте список за ценой заказа по убыванию
 * - sort list by Order price in increase order AND User city-отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 * - sort list by Order itemName AND ShopIdentificator AND User city-отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
 * - delete duplicates from the list-удалите дублированные данные со списка
 * - delete items where price less than 1500-удалите объекты, где цена меньше 1500
 * - separate list for two list - orders in USD and UAH-разделите список на 2 списка - заказы в долларах и в гривнах
 * -разделите список на столько списков, сколько уникальных городов в User
 * -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
 * -удалите заказы в USD
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

        Order order1 = new Order ( 50, USD, "Shoes blue model 345 s.41", "Miraton", user1 );
        Order order2 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user6 );
        Order order3 = new Order ( 1100, Currency.UAH, "Bag model 45", "Ardo", user3 );
        Order order4 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order5 = new Order ( 55, USD, "Dress yellow model 04 S", "Otto", user5 );
        Order order6 = new Order ( 1500, Currency.UAH, "Shoes blue model 345 s.41", "Miraton", user2 );
        Order order7 = new Order ( 48, USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order8 = new Order ( 48, USD, "T-shirt model 25 L", "Ggi", user7 );
        Order order9 = new Order ( 48, USD, "T-shirt model 25 L", "Oggi", user8 );
        Order order10 = new Order ( 100, Currency.UAH, "Pork meet", "Silpo", user10 );

        orders.addAll ( Arrays.asList ( order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 ) );
        System.out.println ( "Collection of orders: " );
        orders.forEach ( System.out::print );

        //sort by Order price in decrease order
        System.out.println ( "Collection sorts by Order price in decrease order: " );
        sortByPriceInDecreaseOrder ( orders );
        orders.forEach ( System.out::print );

        //sorts by Order price in increase order and User city
        System.out.println ( "Collection sorts by Order price in increase order and User city: " );
        sortByPriceAndUserCity ( orders );
        orders.forEach ( System.out::print );

        //sorts by Order item name and shop identifier and user city
        System.out.println ( "Collection sorts by Order item name and shop identifier and user city: " );
        sortByItemAndShopIdAndUserCity ( orders );
        orders.forEach ( System.out::print );

        //delete duplicates
        System.out.println ( "Orders without duplicates (orders are equal when equals all Orders fields except id): " );
        List <Order> uniqueOrders = getUniqueOrders ( orders );
        uniqueOrders.forEach ( System.out::print );


        //delete items where price less than 1500
        System.out.println ( "Orders with price more than or equal 1500: " );
        List <Order> ordersWithPriceLessThan1500 = getOrdersWithPriceLessThan1500 ( orders );
        ordersWithPriceLessThan1500.forEach ( System.out::print );

        //separate list for two list - orders in USD and UAH
        System.out.println ( "Orders in USD: " );
        List <Order> ordersUSD = getOrdersWithSomeCurrency ( orders, USD );
        ordersUSD.forEach ( System.out::print );
        //Если надо только распечатать, то:
        //getOrdersWithSomeCurrency ( orders, USD ).forEach ( System.out::print );

        System.out.println ( "Orders in UAH: " );
        List <Order> ordersUAH = getOrdersWithSomeCurrency ( orders, UAH );
        ordersUAH.forEach ( System.out::print );


        //check if the set contains an order, where the user's last name is "Petrov"
        String lastName = "Petrov";
        System.out.println ( "Orders " + (IfContainLastName ( orders, lastName ) ?
                ""
                : "don't ")
                + "contain order with last name " + lastName );

        //separate list for as many lists as many unique cities are in User
        Map <String, List <Order>> uniqueCitiesMap = groupingByUniqueCities ( orders );
        uniqueCitiesMap.forEach ( ( key, value ) -> System.out.println ( key + ": " + value ) );

        //delete orders in USD
        System.out.println ( "Delete orders in USD: " );
        deleteOrdersInUSD ( orders );
        orders.forEach ( System.out::print );

    }
}
