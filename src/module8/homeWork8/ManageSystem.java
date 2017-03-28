package module8.homeWork8;

import module8.homeWork8.food.Food;

import java.util.*;

/**
 * Java#6
 * Module 8 Task 4
 * Реализуйте интерфейс IManageSystem для работы с базой данных товаров. Класс должен содержать поле:
 * Map<Food, Double> database
 * <p>
 * Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене.
 * Поле должно быть доступно только внутри данного класса.
 *
 * @author Kontar Maryna
 */
public final class ManageSystem<T extends Food & Comparable <? extends T>> implements IManageSystem <T> {

    //TODO  2. чтобы никто не мог изменить класс - final?
    //private конструктор и static методы сделать не могу т.к. в интерфейсе нельзя делать статич. методы

    private Map <T, Double> database = new HashMap <> ( );

    @Override
    public T save ( T food, double price ) {
        database.put ( food, price );
        return food;
    }

    @Override
    public T save ( T food ) {
        database.put ( food, null );
        return food;
        //TODO 4. В реальности цены указывают в BigDecimal?   database.put ( food, new BigDecimal (null) );
        //Цена null или 0.0?
    }

    public void saveAll ( Map <T, Double> newDatabase ) {  //НАПИСАЛА ДЛЯ УДОБСТВА
        database.putAll ( newDatabase );
    }

    @Override
    public void delete ( T food ) {
        database.remove ( food );
    }

    @Override
    public void deleteById ( int id ) {
        Set <T> setOfFoods = database.keySet ( );
        for ( Iterator <T> iterator = setOfFoods.iterator ( ); iterator.hasNext ( ); ) {
            if (iterator.next ( ).getId ( ) == id)
                iterator.remove ( );
        }
    }

    @Override
    public T get ( int id ) {
        Set <T> setOfFoods = database.keySet ( );
        for ( T food : setOfFoods ) {
            if (food.getId ( ) == id)
                return food;
        }
        return null;
    }

    @Override
    public Double getPrice ( T food ) {
        return database.get ( food );
        //TODO 5. если database.get ( food ) == null? возвращать null или 0.0?
    }

    @Override
    public Set <T> getProducts () {
        return database.keySet ( );
    }

    @Override
    public List <Double> getPrices () {
        return new ArrayList <> ( database.values ( ) );
        //return Collections.unmodifiableCollection ( database.values () );
        //TODO  3. как Collection в List лучше перевести?
    }

    @Override
    public void printProductsSortedByName () {
        Map <T, Double> sortedByNameDatabase = new TreeMap <> ( database );
        System.out.println ( sortedByNameDatabase );
    }

    @Override
    public void printProductsSortedByPrice () {
        List <Map.Entry <T, Double>> list = new LinkedList <> ( database.entrySet ( ) );
        list.sort ( new Comparator <Map.Entry <T, Double>> ( ) {
            @Override
            public int compare ( Map.Entry <T, Double> o1, Map.Entry <T, Double> o2 ) {
                return o1.getValue ( ).compareTo ( o2.getValue ( ) );
            }
        } );

//        list.sort ( ( o1, o2 ) -> { return o1.getValue ( ).compareTo ( o2.getValue ( ) );
//        } );
        for ( Map.Entry <T, Double> entry : list )
            System.out.println ( entry.getKey ( ).toString ( ) + entry.getValue ( ) );
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( "database=\n" );
        for ( Map.Entry <T, Double> database : database.entrySet ( ) )
            sb.append ( database.getKey ( ) ).append ( " Price: " ).
                    append ( database.getValue ( ) ).append ( "\n" );
        return sb.toString ( );
    }

    public String printDatabase () {
        return toString ( );
    }
}
