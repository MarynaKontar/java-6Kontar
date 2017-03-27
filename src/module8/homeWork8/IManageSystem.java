package module8.homeWork8;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Java#6
 * Module 8 Task 3
 * Создайте универсальный интерфейс IManageSystem(T) с такими методами:
 * T save(T obj, double price);
 * T save(T obj);
 * void delete(T obj) ;
 * void deleteById(int id);
 * T get(int id);
 * Double getPrice(T obj);
 * Set<T> getProducts();
 * List<Double> getPrices();
 *
 * @author Kontar Maryna
 */
interface IManageSystem<T extends Comparable<T>> {

    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    Collection<Double> getPrices();

}


// Мартин "Чистій код" (2017) стр. 47  - интерфейсы без префиксов (ManageSystem),
// а их реализация может быть ManageSystemImp. Потому что клиент чаще работает с интерфейсом, а префиксы отвлекают от смысла