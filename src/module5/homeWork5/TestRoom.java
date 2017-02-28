package module5.homeWork5;

import module5.homeWork5.homeWork5.*;
import module5.homeWork5.homeWork5.Room;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

/**
 * Created by User on 28.02.2017.
 */
public class TestRoom {
    public static void main(String[] args) {

        int price = 500;
        int persons = 3;
        String city = "Madrid";
        String hotel = "Four Seasons";

//        module5.homeWork5.homeWork5.Room[] rooms = new module5.homeWork5.homeWork5.Room[5];
//        rooms[0] = new module5.homeWork5.homeWork5.Room(1, 100, 2, LocalDate.of(2017, Month.MARCH, 12), "Marriott", "London");
//        rooms[1] = new module5.homeWork5.homeWork5.Room(2, 200, 1, LocalDate.of(2017, Month.APRIL, 25), "Hyatt", "Kiev");
//        rooms[2] = new module5.homeWork5.homeWork5.Room(3, 300, 2, LocalDate.of(2017, Month.MAY, 10), "Hilton", "New York");
//        rooms[3] = new module5.homeWork5.homeWork5.Room(4, 200, 1, LocalDate.of(2017, Month.JUNE, 1), "Ritz", "Kiev");
//        rooms[4] = new module5.homeWork5.homeWork5.Room(5, 500, 3, LocalDate.of(2017, Month.FEBRUARY, 28), "Four Seasons", "Madrid");


        API[] apis = new API[]{new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

//    module5.homeWork5.homeWork5.Room[] rooms = new module5.homeWork5.homeWork5.Room[15];
        Room[] roomArray = new Room[15];
//        Room[] rooms1 = apis[0].findRooms(price, persons, city, hotel);
//        Room[] rooms2 = apis[1].findRooms(price, persons, city, hotel);
//        Room[] rooms3 = apis[2].findRooms(price, persons, city, hotel);
//        System.arraycopy(rooms1, 0, roomArray, 0,  rooms1.length);
//        System.arraycopy(rooms2, 0, roomArray, rooms1.length, rooms2.length);
//        System.arraycopy(rooms3, 0, roomArray,  rooms1.length + rooms2.length, rooms3.length);
//        System.out.println(Arrays.deepToString(roomArray));

        int count = 0;
        Room[] rooms;
        for (int i = 0; i < apis.length; i++) {
            rooms = apis[i].findRooms(price, persons, city, hotel);
            System.arraycopy(rooms, 0, roomArray, count,  rooms.length);
            count += rooms.length;
        }


        for (Room room : roomArray) {
            System.out.println(room.getId());
        }
    }
}