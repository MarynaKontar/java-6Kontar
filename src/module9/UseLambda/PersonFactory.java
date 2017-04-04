package module9.UseLambda;

/**
 * Created by User on 01.04.2017.
 */
public interface PersonFactory<P extends Person> {

    P createPerson ( String firstName, String lastName );
    default void print(Person person){
        System.out.println (person.toString () );
    }

}
