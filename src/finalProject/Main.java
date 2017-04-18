package finalProject;

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
