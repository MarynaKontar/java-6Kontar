package taskFromMinov;
import LectureAndPractice.module3.webinar.Car;
import module4.zoo.Animal;
import module4.zoo.mammal.Monkey;

import java.util.LinkedHashMap;
import java.util.Map;
import static taskFromMinov.LRUCache.lruCache;

/**
 * Created by User on 23.03.2017.
 */
public class LRUCacheTest {

    public static void main(String[] args ) {

//        Map<Object, Object> lru = lruCache(4); //В кеш можно класть пары любых сочетаний типов?
        Map<Object, Object> lru = new LinkedHashMap<> (  );
        lru.put(3, "1");
        lru.put(3, "2");
        lru.put("goit", "3");
        lru.put(3, "3");
        lru.put(4, "3");
        System.out.println(lru);
//
        System.out.println ( lru.get ( 3 ));
//        lru.get ( 1 );
//
//        lru.put(5, "fdg");
//        lru.put(5.56, 5);
//        System.out.println(lru);




//        Map<Object, Object> lru1 = lruCache(6);
//        lru1.put ( 120, new Monkey ("Varay" ) );
//        System.out.println (lru1.put ( 120, new Monkey ("Varay" ) ));
//        lru1.put ( 124, new Monkey ("Katya" ) );
//        lru1.put ( 122, new Monkey ("Varay" ) );
//        lru1.put ( 128, new Monkey ("Varay" ) );
//        System.out.println (lru1 );
    }
}


/**
 *  Map<Object, Object> lru = lruCache(4); //В кеш можно класть пары любых сочетаний типов?
 lru.put(0, "1");//удалится, т.к. maxSize=4, а єлементов вначале положили 5
 lru.put(1, "2");
 lru.put("goit", "3");
 lru.put(3, "3");
 lru.put(4, "3");
 //put(->HashMap.java) -> putVal(->HashMap.java, 624)... -> afterNodeInsertion(->LinkedHashMap.java,297) ->
 // removeEldestEntry(LinkedHashMap.java,299->!!!ПЕРЕОПРЕДЕЛЯЕТСЯ В LRUCache.java, 16) -> removeNode (->HashMap.java)
 // -> afterNodeRemoval (->LinkedHashMap.java, 283) (переписывает ссылки на after - before)
 System.out.println(lru);

 lru.get ( "goit" );//сместит в конец от "удаляемой" части т.к. к нему обращались
 lru.get ( 1 );// -//-//-//
 // (lruCache создается с таким конструктором,у которого accessOrder=true, поєтому ЭЛЕМЕНТЫ сохраняются
 // не в порядке вставки, а В ПОРЯДКЕ ОБРАЩЕНИЯ )
 // get -> if(accessOrder) afterNodeAccess(->LinkedHashMap.java,305) -> (делает node последней)


 lru.put(5, "fdg");//(1, "2") удаляется т.к. размер превысил  maxSize (добавили 5-ый элемент)
 lru.put(5.56, 5);//(3, "3") удаляется т.к. размер превысил  maxSize (добавили 5-ый элемент)
 System.out.println(lru);
 */
