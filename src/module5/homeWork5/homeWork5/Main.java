package module5.homeWork5.homeWork5;

/**
 * Created by User on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(500, 3, "Madrid", "Four Seasons");
        controller.requestRooms(300,  2,  "Hilton", "New York");
        controller.requestRooms(200, 1,"Hyatt", "Kiev");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());

        DAO dao = new DAOImplementation();

        
    }


}
