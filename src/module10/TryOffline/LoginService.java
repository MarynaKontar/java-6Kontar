package module10.TryOffline;

/**
 * Created by User on 10.04.2017.
 */
public class LoginService {
    public void login(String userName, String password) throws InvalidPasswordException{
        if(password.length ()<4){
            throw new InvalidPasswordException("Your password is invalid");
        }
        System.out.println ("Login successe" );
    }


}
