package module6.task4;

/**
 * Java#6
 * Module 6 Task 4 (new)
 * Create CitizenMain class with a main method, where check how CitizenFactory works.
 *
 * @author Kontar Maryna
 */
public class CitizenMain {

    public static void main ( String[] args ) {

        // CitizenFactory factory = new CitizenFactory(); //Сделать приватный констуктор к фабрике.
        Citizen[] citizens = new Citizen[ 4 ];
        citizens[ 0 ] = CitizenFactory.createCitizen ( Citizen.CitizenType.ENGLISHMAN ); // см. TODO 1. в CitizenFactory  CitizenFactory.createCitizen(Citizen.CitizenType.ENGLISHMAN);
        citizens[ 1 ] = CitizenFactory.createCitizen ( Citizen.CitizenType.CHINESE );     // Сделать приватный констуктор к фабрике.
        citizens[ 2 ] = CitizenFactory.createCitizen ( Citizen.CitizenType.RUSSIAN );
        citizens[ 3 ] = CitizenFactory.createCitizen ( Citizen.CitizenType.ITALIAN );

        for ( Citizen citizen : citizens ) {
            citizen.sayHello ( );
        }
    }
}


//        for (int i = 0; i < citizens.length; i++) {
//            citizens[i] = factory.createCitizen(Citizen.CitizenType.values()[i]);
//        }
