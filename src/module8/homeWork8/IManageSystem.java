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
// Согласен. Но, в реальной жизни, не всегда всё как по книге. Ты можешь попасть на проект, в котором уже существует
// какая-то своя внутренняя конвенция имён и нарушать её тебе не разрешат(да и проект из-за этого станет менее
// последователен и понятен). Так что делаем 2 вывода: 1. Если пишем сами - используем best practice и рекомендации умных людей.
// 2. На работе в должности Junior - можем сделать ремарку и показать, что мы читаем книги, но в конечном случае послушать
// старших коллег.