package module5.homeWork5.neVernoe;

//import static module5.homeWork5.neVernoe.BookingComAPI.rooms;
//import static module5.homeWork5.neVernoe.GoogleAPI.rooms;
//import static module5.homeWork5.neVernoe.TripAdvisorAPI.rooms;
import module5.homeWork5.neVernoe.*;

import static module5.homeWork5.neVernoe.Controller.apis;

/**
 * Java#6
 * Module 5 Task 5
 * Create DAO interface and its implementation. Methods print operation name and object which was used.
 * Room save(Room room)
 * boolean delete(Room room)
 * Room update(Room room)
 * Room findById(long id)
 *
 * @author Kontar Maryna
 */
public class DAOImplementation implements DAO {

    private static Room[] rooms  = new Room[10];

    //static DAO dao = new DAOImplementation();

    Room[] roomsAPIArray;
    int indexOfAPI;

    {
        switch (indexOfAPI) {
            case 0:
                roomsAPIArray = BookingComAPI.rooms;

            case 1:
                roomsAPIArray = GoogleAPI.rooms;

            case 2:
                roomsAPIArray = TripAdvisorAPI.rooms;

        }
    }

    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {

        //daos[0].findRooms(room.getPrice(), room.getPersons(), room.getCityName(), room.getHotelName());

        for (indexOfAPI = 0; indexOfAPI < apis.length; indexOfAPI++) {
            for (int j = 0; j < roomsAPIArray.length; j++) {
                Room roomInDb = roomsAPIArray[j];

                if (roomInDb.equals(room)) {
                    System.arraycopy(roomsAPIArray, j + 1, roomsAPIArray, j, roomsAPIArray.length - j - 1);
                    roomsAPIArray[roomsAPIArray.length - 1] = null;

//                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public Room[] createDB() {
        return rooms;
    }
}

