package module5.homeWork5.homeWork5;

import java.util.Arrays;

/**
 * Created by User on 02.03.2017.
 */
public class GoogleAPI implements API {

    private DAO dao = new GoogleDAO();
    public Room[] rooms = dao.getAll();

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] lookingForRoomsArray = new Room[0];
        Room lookingForRoom = new Room(0, price, persons, null, hotel, city);

        for (int i = 0; i < rooms.length; i++) {
            if (lookingForRoom.equals(rooms[i]) && rooms[i].getHotelName() == hotel)
                lookingForRoomsArray = addElementToArray(lookingForRoomsArray, rooms[i]);
        }

        return lookingForRoomsArray;
    }

    private Room[] addElementToArray(Room[] roomsArray, Room newRoomsMember) {

        Room[] newRoomsArray = Arrays.copyOf(roomsArray, roomsArray.length + 1);
        newRoomsArray[newRoomsArray.length - 1] = newRoomsMember;
        return newRoomsArray;
    }
}
