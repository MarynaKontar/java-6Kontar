package module5.homeWork5.homeWork5;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by User on 02.03.2017.
 */
public class BookingComDAO implements DAO {

    private static Room[] rooms = new Room[10];

    public BookingComDAO() {

        rooms[0] = new Room(1, 100, 2, LocalDate.of(2017, Month.MARCH, 12), "Marriott", "London");
        rooms[1] = new Room(6, 500, 3, LocalDate.of(2017, Month.FEBRUARY, 28), "Four Seasons", "Madrid");
        rooms[2] = new Room(2, 200, 1, LocalDate.of(2017, Month.APRIL, 25), "Hyatt", "Kiev");
        rooms[3] = new Room(7, 500, 3, LocalDate.of(2017, Month.FEBRUARY, 23), "Four Seasons", "Madrid");
//        rooms[2] = new Room(3, 300, 2, LocalDate.of(2017, Month.MAY, 10),"Hilton", "New York");
//        rooms[3] = new Room(4, 200, 1, LocalDate.of(2017, Month.JUNE, 1),"Ritz", "Kiev");
        rooms[4] = new Room(8, 500, 3, LocalDate.of(2017, Month.FEBRUARY, 25), "Four Seasons", "Madrid");
    }


    @Override
    public Room save(Room room) {

        int count = RoomsInDBCount(rooms);
        rooms[count] = room;
        System.out.println("Save: " + room);
        return room;  //TODO 1. почему функция save не void? Или может это надо  для того, чтобы возвращать null, если закончился массив БД
        //(мы же не должны  были в задании пока расширять массив БД?)
    }

    @Override
    public boolean delete(Room room) {

        for (int j = 0; j < rooms.length; j++) {
            if (rooms[j] != null && rooms[j].equalsForAllFields(room)) {
                System.arraycopy(rooms, j + 1, rooms, j, rooms.length - j - 1);
                rooms[rooms.length - 1] = null;
                System.out.println("Delete: " + room);
                return true;
            }
        }
        System.out.println("Delete: there isn't room in DB");
        return false;
    }

    @Override
    public Room update(Room room) {

        for (int j = 0; j < rooms.length; j++) {
            if (rooms[j].getId() == room.getId()) {  //rooms[j].equals(room
                rooms[j] = room;
                System.out.println("Update: " + room);
                return room;
            }
        }
        System.out.println("Update: there isn't room in DB");
        return null;  //TODO 2.правильно ли, что, если нет комнаты с данным id, то надо вернуть пустую комнату?
    }

    @Override
    public Room findById(long id) {

        for (int j = 0; j < rooms.length; j++) {
            if (id == rooms[j].getId()) {
                System.out.println("find by id: " + id + " " + rooms[j]);
                return rooms[j];
            }
        }
        System.out.println("Find by id: there isn't room in DB");
        return null;
    }

    @Override
    public Room[] getAll() {
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
