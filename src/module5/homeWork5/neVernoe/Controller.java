package module5.homeWork5.neVernoe;

/**
 * Java#6
 * Module 5 Task 6
 * Create Controller class. It contains global variable
 * API daos[] = new API[3];
 * which contains all implementations of API interface.
 * Also, controller contains two methods
 * Room[] requestRooms(int price, int persons, String city, String hotel)
 * which finds all the rooms with requested params. Method use all daos available to make search.
 * Found rooms create to DB
 * Room[] check(API api1, API api2)
 * Check how many the same rooms two different daos return
 *
 * @author Kontar Maryna
 */
public class Controller {

    public static API[] apis = new API[3];
//    public static API[] daos = new API[]{new BookingComAPI(),new GoogleAPI(), new TripAdvisorAPI()};

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] roomArray = new Room[15];
        int count = 0;
        Room[] rooms;

        for (int i = 0; i < apis.length; i++) {
            rooms = apis[i].findRooms(price, persons, city, hotel);
            System.arraycopy(rooms, 0, roomArray, count, rooms.length);
            count += rooms.length;
        }
        return roomArray;
    }

    Room[] check(API api1, API api2) {

        return new Room[0];
    }
}
