package module5.homeWork5.homeWork5;

import java.time.LocalDate;
import java.time.Month;

import static module5.homeWork5.homeWork5.Controller.apis;


/**
 * Created by User on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        DAO[] dao = new DAO[]{new BookingComDAO(), new GoogleDAO(), new TripAdvisorDAO()};
        DAO bookingComDAO = new BookingComDAO();
        DAO googleDAO= new GoogleDAO();
        DAO tripAdvisorDAO= new TripAdvisorDAO();

        controller.requestRooms(500, 3, "Madrid", "Four Seasons");
        controller.requestRooms(300, 2, "Hilton", "New York");
        controller.requestRooms(200, 1, "Hyatt", "Kiev");

        controller.check(bookingComDAO, googleDAO);
        controller.check(bookingComDAO, tripAdvisorDAO);
        controller.check(googleDAO, tripAdvisorDAO);

//        DAO dao = new GoogleDAO();
//
        Room roomForDelete = new Room(1, 100, 2, LocalDate.of(2017, Month.MARCH, 12), "Marriott", "London");


        for (Room room : dao[0].createDB()) {
            System.out.println(room);
        }
        System.out.println("");
        for (Room room : dao[1].createDB()) {
            System.out.println(room);
        }
        System.out.println("");

        delete(roomForDelete, dao);


        for (Room room : dao[0].createDB()) {
            System.out.println(room);
        }
        System.out.println("");
        for (Room room : dao[1].createDB()) {
            System.out.println(room);
        }
        save(roomForDelete, dao);
    }

    private static void save(Room room, DAO[] dao) {
        for (int i = 0; i < apis.length; i++) {
            dao[i].save(room);
        }
    }

    private static void delete(Room room, DAO[] dao) {
        for (int i = 0; i < apis.length; i++) {
            dao[i].delete(room);
        }
    }


}
