package module8.homeWork8.homeWork8WithoutInheritance;

import java.util.HashMap;
import java.util.Map;

import static module8.homeWork8.homeWork8WithoutInheritance.Country.*;

/**
 * Java#6
 * Module 8 Task 4
 * Проверьте работу Manage System в классе Main (на примере 5+ продуктов).
 *
 * @author Kontar Maryna
 */
public class Main {
    public static void main ( String[] args ) {

        ManageSystem manageSystem = new ManageSystem();
        manageSystem.save ( new Food ( "Quail eggs", UKRAINE, 10 ), 23.0 );
        manageSystem.save ( new Food ( "Rye bread", UKRAINE, 10 ) );
        manageSystem.save ( new Food ( "Wheat bread", UKRAINE, 7 ), 11 );
        Food tea = manageSystem.save ( new Food ( "Silver tip", SRI_LANKA, 365 * 3 ));
        Food orange = new Food ( "Mini Oranges", ARGENTINA, 30 );

        Map <Food, Double> fruitsDatabase = new HashMap <> ( );
        fruitsDatabase.put ( orange, 29.0);
        fruitsDatabase.put ( new Food ( "Fuji", GEORGIA, 40 ), 21.0 );
        fruitsDatabase.put ( new Food ( "Gala", LITHUANIA, 30 ), 14.0 );
        manageSystem.saveAll ( fruitsDatabase );


        System.out.println ( manageSystem.printDatabase ( ) );
        System.out.println ( manageSystem.getProducts ( ) );
        System.out.println ( manageSystem.getPrices ( ) );
        System.out.println ( manageSystem.getPrice ( tea ) );
        System.out.println ( manageSystem.get ( 4 ) );
        manageSystem.delete ( orange );
        manageSystem.deleteById ( 3 );
//        manageSystem.deleteById ( 2 );

        System.out.println ( manageSystem.printDatabase ( ) );
        manageSystem.printProductsSortedByName ( );
        manageSystem.printProductsSortedByPrice ( );

    }
}
