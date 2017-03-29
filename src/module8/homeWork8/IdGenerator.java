package module8.homeWork8;

/**
 * Java#6
 * Module 8 Task 1
 * Создайте класс-утилиту IdGenerator, который будет генерировать и возвращать уникальный идентификатор
 * (реализацию продумайте самостоятельно).
 *
 * @author Kontar Maryna
 */
public class IdGenerator {

    private static long counter;

    private IdGenerator () {
    }


    /**
     * return id from 1
     * @return
     */
    public static long idGenerate () {
        return ++counter;
    }
}
