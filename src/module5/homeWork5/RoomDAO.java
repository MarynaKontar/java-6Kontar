package module5.homeWork5;


import java.sql.Array;

/**
 * Created by User on 24.02.2017.
 */
public class RoomDAO {
    Room[] roomDB = new Room[10];
    Room save(Room room){
        int count = getRoomsCount(roomDB);
        roomDB[count] = room;
        return room;
    }

    private int getRoomsCount(Room[] roomDB) {
        int count = 0;
        for (Room room : roomDB) {
            if (room!=null){
                count++;
            }
        }
        return count;
    }
boolean delete(Room room){
    for (int i = 0; i < roomDB.length; i++) {
        Room roomInDb = roomDB[i];

        if (roomInDb.equals(room)){

            System.arraycopy(roomDB, i+1, roomDB, i, roomDB.length - i - 1);//копирует один єррей в другой
            roomDB[roomDB.length - 1] = null;
           // Array.copyOf візівает тоже System.arraycopy
            // т.е. копировать только System.arraycopy() можно
            //roomDB[i] = null;// просто так нельзя п.ч. затирание индекса будет
        }

    }
    return false;
}

//    Room update(Room room){
//
//    }
//
    Room findById(long id){

        for (Room room : roomDB) {
            if (room.getId() == id){
                return room;
            }
        }
 return null;
    }


}
