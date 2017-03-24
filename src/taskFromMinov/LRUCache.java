package taskFromMinov;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Реализовать LRU кеш и задавать размер сколько в этом кеше будет максимум элементов
 * Из кеша при привышении maxSize удаляются элементы, к которым обрашались давнее всего.
 * Размер элементов не учитывается, как и количество обрашений к данному элементу.
 */
public final class LRUCache {
    private LRUCache(){}

    public static <K,V> Map<K,V> lruCache(final int maxSize) {
        return new LinkedHashMap<K, V>(maxSize*4/3, 0.75f, true){

            /**
             * use in afterNodeInsertion (LinkedHashMap.java,297) to decide if remove Node
             * if (size() > maxSize) Node remove
             * @param eldest
             * @return
             */
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > maxSize;
            }
        };
    }
}