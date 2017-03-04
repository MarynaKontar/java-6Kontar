package module5.homeWork5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 24.02.2017.
 */
public class UseRoomDAO {
    public static void main(String[] args) {


        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date newD = new Date(116,0,13);// Date(116,0,13) 2016 13 января
        System.out.println(format.format(newD));


        RoomDAO roomDAO = new RoomDAO();

        for (int i = 1; i < 11; i++) {
            Room room = createRoom(i - 1, 100*i, i);
        roomDAO.save(room);
        }

        roomDAO.delete(createRoom(0, 200,2));
        roomDAO.delete(createRoom(0, 700,7));

        for (int i = 0; i < 10; i++) {
           Room room = roomDAO.findById(i);

           if (room == null){
               System.out.println("No room with id: " );// + room.getId()
           }

            else System.out.println("ROOM from DB: " + room.getId());
        }




    }



    private static Room createRoom(long id, int price,int persons ) {
        Room room1 = new Room();
        room1.setId(1);
        room1.setPersons(price);
        room1.setCityName("Kiev");
        room1.setDateAvailableFrom(new Date());
        room1.setPersons(persons);

        return room1;
    }
}
