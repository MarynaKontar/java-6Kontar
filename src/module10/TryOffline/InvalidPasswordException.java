package module10.TryOffline;

/**
 * Created by User on 10.04.2017.
 */
public class InvalidPasswordException extends Exception {
    public InvalidPasswordException () {
    }

    public InvalidPasswordException ( String message ) {
        super ( message );
    }
}
