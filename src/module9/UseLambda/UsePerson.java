package module9.UseLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 01.04.2017.
 */
public class UsePerson {
    public static void main ( String[] args ) {
        PersonFactory personFactory = Person::new;//это значит, что метод createPerson в PersonFactory будет вызывать
        // конструктор в Person с соответствующей (методу createPerson) сигнатурой
        List<Person> personsList= new ArrayList<> (  );
        personsList.add(personFactory.createPerson ( "Peter1", "ParkerC" ));
        personsList.add(personFactory.createPerson ( "Peter2", "ParkerA" ));
        personsList.add(personFactory.createPerson ( "Peter3", "ParkerB" ));

        System.out.println (personsList );

personsList.sort ( Comparator.comparing ( Person::getLastName ) ); //Comparator.comparing () возврщает компаратор
personsList.sort ( Comparator.comparing ( Person::getLastName, Comparator.reverseOrder () ) );
        System.out.println (personsList );






    }
}
