package module8.homeWork8;

import module8.homeWork8.food.Food;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Java#6
 * Module 8 Task 4
 * Реализуйте интерфейс IManageSystem для работы с базой данных товаров. Класс должен содержать поле:
 * Map<food, Double> database
 *
 * @author Kontar Maryna
 */
public final class ManageSystem<T extends Food> implements IManageSystem<T>{

    //чтобы никто не мог изменить класс - final?
    //private конструктор и static методы сделать не могу т.к. в интерфейсе нельзя делать статич. методы
    private Map<Food, Double> database;

    @Override
    public T save ( T obj, double price ) {
        return null;
    }

    @Override
    public T save ( T obj ) {
        return null;
    }

    @Override
    public void delete ( T obj ) {

    }

    @Override
    public void deleteById ( int id ) {

    }

    @Override
    public T get ( int id ) {
        return null;
    }

    @Override
    public Double getPrice ( T obj ) {
        return null;
    }

    @Override
    public Set <T> getProducts () {
        return null;
    }

    @Override
    public List <Double> getPrices () {
        return null;
    }
}
