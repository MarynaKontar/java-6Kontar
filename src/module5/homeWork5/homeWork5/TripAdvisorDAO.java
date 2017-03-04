package module5.homeWork5.homeWork5;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by User on 02.03.2017.
 */
public class TripAdvisorDAO implements DAO{

    private static Room[] rooms = new Room[10];

    public TripAdvisorDAO() {

        rooms[0] = new Room(1, 100, 2, LocalDate.of(2017, Month.MARCH, 12),"Marriott", "London");
        rooms[1] = new Room(2, 200, 1, LocalDate.of(2017, Month.APRIL, 25),"Hyatt", "Kiev");
        rooms[2] = new Room(3, 300, 2, LocalDate.of(2017, Month.MAY, 10),"Hilton", "New York");
        rooms[3] = new Room(4, 200, 1, LocalDate.of(2017, Month.JUNE, 1),"Ritz", "Kiev");
        rooms[4] = new Room(11, 500, 3, LocalDate.of(2017, Month.FEBRUARY, 28),"Four Seasons", "Madrid");
    }


    @Override
    public Room save(Room room) {

        int count = RoomsInDBCount(rooms);
        rooms[count] = room;
        return room;
    }

    @Override
    public boolean delete(Room room) {

        for (int j = 0; j < rooms.length; j++) {

            if (rooms[j].equalsForAllFields(room)) {
                System.arraycopy(rooms, j + 1, rooms, j, rooms.length - j - 1);
                rooms[rooms.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        for (int j = 0; j < rooms.length; j++) {
            if (rooms[j].equals(room)) {
                rooms[j] = room;
                return room;
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {

        for (int j = 0; j < rooms.length; j++) {
            if (id == rooms[j].getId())
                return rooms[j];
        }
        return null;
    }

    @Override
    public Room[] createDB() {
        return rooms;
    }


    private int RoomsInDBCount(Room[] rooms) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null) {
                count++;
            }
        }
        return count;
    }



}
