package module9.UseLambda;

/**
 * Created by User on 01.04.2017.
 */
public class Person {
    private String firsttName;
    private String lastName;

    public Person () {
    }

    public Person ( String firsttName, String lasttName ) {
        this.firsttName = firsttName;
        this.lastName = lasttName;
    }

    public String getFirsttName () {
        return firsttName;
    }

    public String getLastName () {
        return lastName;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( "Person{" );
        sb.append ( "firsttName='" ).append ( firsttName ).append ( '\'' );
        sb.append ( ", lastName='" ).append ( lastName ).append ( '\'' );
        sb.append ( '}' );
        return sb.toString ( );
    }
}
