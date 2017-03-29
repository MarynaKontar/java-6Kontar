package module8.homeWork8;

import module8.homeWork8.food.Food;

import java.util.ArrayList;
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
 * Добавьте в интерфейс методы и проверьте их работу:
 * void printProductsSortedByName(); - выводит список «продукт-цена», отсортированных по имени продукта.
 * void printProductsSortedByPrice();- выводит список «продукт-цена», отсортированных по цене продукта (по возрастанию).
 *
 * @author Kontar Maryna
 */
interface IManageSystem <T> {

    T save( T obj, double price);
    T save ( T food );
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();
    void printProductsSortedByName();
    void printProductsSortedByPrice();
}






// Мартин "Чистій код" (2017) стр. 47  - интерфейсы должны быть без префиксов (ManageSystem),
// а их реализация может быть ManageSystemImp. Потому что клиент чаще работает с интерфейсом, а префиксы отвлекают от смысла