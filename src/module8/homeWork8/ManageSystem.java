package module8.homeWork8;

import module8.homeWork8.food.Food;

import java.util.*;
import java.util.function.Predicate;

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
public final class ManageSystem <T extends Food> implements IManageSystem <T> {

    //TODO  2. чтобы никто не мог изменить методы класса (унаследовав его) - final class?
    //private конструктор и все методы static в интерфейсе сделать? (только обнаружила,
    // что в интерфейсе можно не абстрактные статич. методы делать), но тогда нет смысла в реализации интерфейса
    //и Андрей говорил, что методы интерфейса работают медленнее


    private Map <T, Double> database = new HashMap <> ( );

    @Override
    public T save ( T food, double price ) {
        database.put ( food, price );
        return food;
    }

    @Override
    public  T save ( T food ) {
        database.put ( food, 0.0 );
        return food;
        //TODO 3. в чем будет разница, если написать  public <T> T save ( T food ) {...} ?
        //TODO 4. В реальности цены указывают в BigDecimal?   database.put(food, new BigDecimal (null/0.0) ); ?
        //Цена null или 0.0? Если null, то printProductsSortedByPrice () будет выдавать ошибку при сравнении с null
    }

    public void saveAll ( Map <? extends T, Double> newDatabase ) {  //НАПИСАЛА ДЛЯ УДОБСТВА ДОБАВЛЕНИЯ ЦЕЛЫХ MAP В database
        database.putAll ( newDatabase );
    }


    @Override
    public void delete ( T food ) {
        database.remove ( food );
    }

    @Override
    public void deleteById ( int id ) {
        Set <T> setOfFoods = database.keySet ( );
//      //first variant
//        for ( Iterator <T> iterator = setOfFoods.iterator ( ); iterator.hasNext ( ); ) {
//            if (iterator.next ( ).getId ( ) == id)
//                iterator.remove ( );
//        }
//      //second variant
//        setOfFoods.removeIf ( new Predicate <T> ( ) {
//            @Override
//            public boolean test ( T t ) {
//                return t.getId () == id;
//            }
//        } );
//      //third variant
        setOfFoods.removeIf (t -> t.getId () == id);
        //TODO 8. что значит подчеркивание id? effectivelly final?
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
        if (food == null) return 0.0;
        return database.get ( food );
        //TODO 6. если database.get ( food ) == null? возвращать null или 0.0?
    }

    @Override
    public Set <T> getProducts () {
        return database.keySet ( );
    }

    @Override
    public List <Double> getPrices () {
        return new ArrayList <> ( database.values ( ) );
        //return Collections.unmodifiableCollection ( database.values () );
        //TODO  7. как Collection в List лучше перевести?
    }

    @Override
    public void printProductsSortedByName () {
//      //first variant
//        Map <T, Double> sortedByNameDatabase = new TreeMap <> ( new Comparator <T> ( ) {
//            @Override
//            public int compare ( T o1, T o2 ) {
//                return o1.getName ().compareTo ( o2.getName () );
//            }
//        } );

//      //second variant
        Map <T, Double> sortedByNameDatabase = new TreeMap <> ((o1,o2) -> o1.getName ().compareTo ( o2.getName () ));
        sortedByNameDatabase.putAll(database);
        System.out.println ("Product sorted by name: (СОРТИРУЕТ ПО ИМЕНИ ТОВАРА, НО Я ЕШЕ ПРОПИСАЛА ПЕРЕД ИМЕНЕМ ТОВАРА, НАЗВАНИЕ КЛАССА)" );
        System.out.println ( sortedByNameDatabase );
    }

    @Override
    public void printProductsSortedByPrice () {
        List <Map.Entry <T, Double>> list = new LinkedList <> ( database.entrySet ( ) );
//      //first variant
//        list.sort ( new Comparator <Map.Entry <T, Double>> ( ) {
//            @Override
//            public int compare ( Map.Entry <T, Double> o1, Map.Entry <T, Double> o2 ) {
//                return o1.getValue ( ).compareTo ( o2.getValue ( ) );
//            }
//        } );
//      //second variant
        list.sort ( ( o1, o2 ) -> { return o1.getValue ( ).compareTo ( o2.getValue ( ) );
        } );

        System.out.println ("Product sorted by price:" );
        for ( Map.Entry <T, Double> entry : list )
            System.out.println ( entry.getKey ( ).toString ( ) + " Price: "  + entry.getValue ( ) );
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

















/**
 * И все таки остался такой вопрос. В начале при проектировании, если я знаю что мне надо будет сортировать элементы database и с этой базой будет работать ManageSystem, не надо ли мне в ManageSystem (или его интерфейсе) указать, что эта система будет работать только с сортируемыми  объектами (= класс которых имплементирует Comparable)? В том виде, как сделано у меня, я могу написать класс
 */