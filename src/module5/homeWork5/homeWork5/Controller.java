package module5.homeWork5.homeWork5;

import java.util.Arrays;

/**
 * Java#6
 * Module 5 Task 6
 * Create Controller class. It contains global variable
 * API apis[] = new API[3];
 * which contains all implementations of API interface.
 * Also, controller contains two methods
 * Room[] requestRooms(int price, int persons, String city, String hotel)
 * which finds all the rooms with requested params. Method use all apis available to make search.
 * Found rooms create to DB
 * Room[] check(API api1, API api2)
 * Check how many the same rooms two different apis return
 *
 * @author Kontar Maryna
 */
public class Controller {

    private static final int NUMBER_OF_APIS = 3;
    public static API[] apis = new API[NUMBER_OF_APIS];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] roomArray = new Room[15];
        int count = 0;
        Room[] rooms;

        for (int i = 0; i < apis.length; i++) {
            rooms = apis[i].findRooms(price, persons, city, hotel);
            System.arraycopy(rooms, 0, roomArray, count, rooms.length);
            //TODO 6. нормально ли я  добавляла найденные массивы или можно как-то поэкономней (не перегружая память, если вдруг много API будет)
            count += rooms.length;
        }
        return roomArray;
    }


    public Room[] check(DAO dao1, DAO dao2) {
        Room[] rooms = new Room[0];
        Room[] rooms1 = dao1.getAll();
        Room[] rooms2 = dao2.getAll();
        //TODO 8. Лучше здесь один раз вызвать метод getAll(), чем в цикле много раз? Я права или есть другие подводные камни (не очень читабельно)?

        int length1 = rooms1.length;
        int length2 = rooms2.length;
        int k = -1;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (rooms1[i] != null && rooms1[i].equals(rooms2[j]) && j!=k) {
                    k = j;
                    rooms = addElementToArray(rooms, rooms1[i]);
                    rooms = addElementToArray(rooms, rooms2[j]);
                    //TODO 7. пока нет уточнения, по каким параметрам проверять равность комнат, сделала по equals(price, persons and cityName are equal)
                    // и вношу в массив комнаты из обоих баз данных так как у них есть различия (в первую очередь - отель)
                    //решится ли эта задача быстрее как-то по-другому без ArrayList? Может сортировкой?
                }
            }
        }
        return rooms;
    }


    public static void saveToAllDAO(Room room, DAO[] dao) {
        for (int i = 0; i < dao.length; i++) {
            dao[i].save(room);
        }
    }

    public static void deleteFromAllDAO(Room room, DAO[] dao) {
        for (int i = 0; i < dao.length; i++) {
            dao[i].delete(room);
        }
    }

    public static void updateToAllDAO(Room room, DAO[] dao) {
        for (int i = 0; i < dao.length; i++) {
            dao[i].update(room);
        }
    }

    public static Room[] findByIdInAllDAO(long id, DAO[] dao) {
        int daoLength = dao.length;
        Room[] rooms = new Room[daoLength]; // TODO 4.так можно сделать только, если id в каждой базе уникальны
        for (int i = 0; i < daoLength; i++) {
            rooms[i] = dao[i].findById(id);
        }
        return rooms;
    }


    private Room[] addElementToArray(Room[] roomsArray, Room newRoomsMember) {

        Room[] newRoomsArray = Arrays.copyOf(roomsArray, roomsArray.length + 1);
        newRoomsArray[newRoomsArray.length - 1] = newRoomsMember;
        return newRoomsArray;
    }
}


