package module5.homeWork5.homeWork5;

import java.util.Arrays;

/**
 * Created by User on 02.03.2017.
 */
public class BookingComAPI implements API {

    private DAO dao = new BookingComDAO();
    public Room[] rooms = dao.getAll();

    // TODO 5. как лучше? Здесь объявить Room[] lookingForRoomsArray; а в findRooms присваивать = new Room[0]?
    //или каждый раз создавать объект в findRooms. Не засорю ли я сильно объектами?
    // Я не совсем пока понимаю, что в этих двух случаях происходит, но начиталась Блоха :))))

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
