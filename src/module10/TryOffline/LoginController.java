package module10.TryOffline;

/**
 * Created by User on 10.04.2017.
 */
public class LoginController {
    LoginService loginService = new LoginService ();
    public void login (String userName, String password) {
        try {
            loginService.login ( userName, password);
        }catch (InvalidPasswordException e){ //BussinessException e
            System.out.println ( e);
            sendEmailToUser();
        }
    }

    private void sendEmailToUser () {
        System.out.println ("send email" );
    }
}
