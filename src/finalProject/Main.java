package finalProject;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Project: Hotel online booking system
 *
 * You need you create system which serves following user requests
 *
 * //Hotel - Collection<Room>
 * //Room - User userReserved
 * Collection<Hotel> findHotelByName(String name)
 * Collection<Hotel> findHotelDyCity(String city)
 * void bookRoom(long roomId, long userId, long hotelId)
 * void cancelReservation(long roomId, long userId, long hotelId)
 * Collection<Room> findRoom(Map<String, String> params)
 *
 * //city - Kiev, hotelName - Radisson, price - 200, persons - 2
 * registerUser(User user)
 *
 *
 * There are three main entities in the system, User, Hotel and Room
 * They should be stored in separate table (collection)
 * Abstract DAO should be implemented and used for duplicate operations
 * All request should be placed in Controller
 * Use Java 8 where possible
 * Demonstrate all results in Main class (create and least 2 hotels in 3 unique cities with at least 10 rooms each
 *
 *
 */
public class Main {

    /**

     try {
     //1. Choose what DB we use and maybe some other settings
     dataBaseManager = configDB();
     } catch (Exception e) {
     System.out.println("Catch configDB exception");
     }


     private BufferedReader br = null;
     System.out.println("Hello! Welcome to our project! ");
     *
     *         while (true) {

     System.out.println(
     "Choose what you want to do and write the appropriate number: \n" +
     "1. Login \n" +
     "2. Find hotel by hotel name. \n" +
     "3. Find hotel by city name. \n" +
     "4. Find room in hotel. \n" +
     "5. Create account \n" +
     "6. \n" +
     "7. Exit\n");

     Integer input;
     String str = null;
     try {
     br = new BufferedReader(new InputStreamReader(System.in));
     str = br.readLine(); //throw IOException
     input = Integer.parseInt(str);//throw NumberFormatException
     //                Scanner br = new Scanner(System.in);
     //                input = br.nextInt();
     //                str = input.toString();

     } catch (Exception e) {
     System.out.println("You typed something strange: " + str + ". " +
     "And we want a number from 1 to 7. Please, type again.");
     continue;

     }

     switch (input) {
     case 1:
     ;
     break;
     case 2:
     ;
     break;
     case 3:
     ;
     break;
     case 4:
     ;
     break;
     case 5:
     ;
     break;
     case 6:
     ;
     break;
     case 7:
     System.out.println(" You are leaving our program :(  Come again!");
     System.exit(0);
     default: {
     System.out.println("You typed wrong number: " + input + ". " +
     "And we want a number from 1 to 7. Please, type again.");
     continue;
     }

     }
     }
     */




}


//
//
//    private static DataBaseManager dbManager;
//    private final static DaoHotel DAOHotel = dbManager.getDaoHotel();
//    private final static DaoUser DAOUser = dbManager.getDaoUser();
//    private final static DaoRoom DAORoom = dbManager.getDaoRoom();
//    private final static DaoReservation DAOReservation = dbManager.getDaoReservation();
//
//    private final static List<Hotel> allHotels = DAOHotel.getAll();
//    private final static List<User> allUsers = DAOUser.getAll();
//    private final static List<Room> allRooms = DAORoom.getAll();
//    private final static List<Reservation> allReservation = DAOReservation.getAll();
//
// public ProjectController(DataBaseManager dbManager) {
// this.dbManager = dbManager;
// }
//
//
// /**
// * TODO Игорю на проверку
// * Kontar Maryna:
// * Method create account for user with name, login and password
// * if there isn't account with this name and login.
// * Returns the user if an account is created
// *
// * @param name
// * @param login
// * @param password
// * @return
// */
//public User createAccount(String name, String login, String password) throws AccountAlreadyExistException {
//
//    User user = new User(name, login, password);
//    if (allUsers.stream()
//            .anyMatch((User o) -> o.getName() == name || o.getLogin() == login)) {
//        throw new AccountAlreadyExistException("Account with this name or login already exists");
//    }
//    DAOUser.create(user);
//    return user;
//}
//
//    /**
//     * Kontar Maryna:
//     *
//     * @param user
//     * @param room
//     * @param hotel
//     * @param dataOfArrival
//     * @param dateOfDeparture
//     * @return
//     */
//    public Reservation reserveRoom( User user, Room room, Hotel hotel, Date dataOfArrival, Date dateOfDeparture) {
//        if ( hotel.getHotelRooms().stream().noneMatch(roomAtHotel -> roomAtHotel.equals(room)) ||  )
//
//            return DAOReservation
//                    .create(new Reservation(user, room, hotel, dataOfArrival, dateOfDeparture));
//
//        //TODO как сохранить теперь это в БД, и как добавить в список заказа user? Функция должна быть с входными параметрами
//
//    }
//
//    public boolean cancelRoomReservation() {
//        throw new UnsupportedOperationException();
//    }
//
//    /**
//     * TODO Игорю на проверку
//     * method can throw NoSuchElementException("No value present")
//     * Может надо словить это исключение и кинуть вместо него исключение, к-ое extend от FrontendException?
//     * <p>
//     * Kontar Maryna:
//     * return hotel if it's exist and throw NoSuchElementException if isn't
//     *
//     * @param hotelName
//     * @return
//     */
//    public Hotel findHotelByHotelName(String hotelName) throws NoSuchElementException {
//        return allHotels.stream()
//                .filter((Hotel hotel) -> hotel.getHotelName().equals(hotelName))
//                .findFirst().get();
//    }
//
//    public List<Hotel> findHotelByCityName( String cityName) throws NoSuchElementException {
//        // access database
//        //DaoHotel hotelDAO = new DaoHotel();
//        //List <Hotel> cityHotels = hotelDAO.getAll();
//        return allHotels.stream()
//                .filter((Hotel hotel) -> hotel.getHotelCity().equals(cityName))
//                .collect( Collectors.toList());
//    }
//
//    public List<Room> findRoomInHotel(Hotel hotel) {
//
//        return hotel.getHotelRooms();
//
//    }






//
//public class AccountAlreadyExistException extends FrontendException {
//
//    public AccountAlreadyExistException(String message) {
//        super(message);
//    }
//}
