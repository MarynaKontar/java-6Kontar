package module8.homeWork8;

import module8.homeWork8.food.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static module8.homeWork8.Country.*;

/**
 * Java#6
 * Module 8 Task 4
 * Проверьте работу Manage System в классе Main (на примере 5+ продуктов).
 *
 * @author Kontar Maryna
 */
public class Main {
    public static void main ( String[] args ) {

        ManageSystem <Food> manageSystem = new ManageSystem <> ( );
        manageSystem.save ( new Eggs ( "Quail eggs", UKRAINE, 10 ), 23.0 );
        manageSystem.save ( new Bread ( "Rye bread", UKRAINE, 10 ) );
        manageSystem.save ( new Bread ( "Wheat bread", UKRAINE, 7 ), 11 );
        Food tea = manageSystem.save ( new Tea ( "Silver tip", SRI_LANKA, 365 * 3 ), 580 );

        tea.setName ( "cgfghh" );
        //TODO 9. Вопрос по безопасно данніх в database. Я могу менять данные в базе данных (database) не используя  manageSystem:
        //как лучше избежать этого? кроме того, что set-ы убрать
        // Методы  класса Food сделать package private чтобі они были доступны ManageSystem, но не пользователю класса?
        // Попытаться сделать Food (его наследников) immutable  - убрать set, сделать поля final. Но класс я не могу сделать final.
        // Или чтобы методы в ManageSystem возвращали копии объектов (пока не знаю как)

        // Немножко надуманный вопрос. Ты можешь менять данные, потому что у нас НЕ реальная БД, а обычная мапа внутри java.
        // В реальной жизни БД находится отдельно и вщаимодействие с ней проходит через специальные библиотеки.
        // В таких случаях классы конструируются и работают по другому.

        Orange orange = new Orange ( "Mini Oranges", ARGENTINA, 30 );
        manageSystem.save ( orange );

        Map <Fruit, Double> fruitsDatabase = new HashMap <> ( );
        fruitsDatabase.put ( new Apple ( " Fuji", GEORGIA, 40 ), 21.0 );
        fruitsDatabase.put ( new Apple ( "Gala", LITHUANIA, 30 ), 14.0 );
        manageSystem.saveAll ( fruitsDatabase );


        System.out.println ( manageSystem.printDatabase ( ) );
        System.out.println ( manageSystem.getProducts ( ) );
        System.out.println ( manageSystem.getPrices ( ) );
        System.out.println ( manageSystem.getPrice ( orange ) );
        System.out.println ( manageSystem.get ( 4 ) );
        manageSystem.delete ( orange );
        manageSystem.deleteById ( 3 );
        System.out.println ( manageSystem.printDatabase ( ) );
        manageSystem.printProductsSortedByName ( );
        manageSystem.printProductsSortedByPrice ( );

    }
}
