package module6;

import module6.task1.ArraysUtils;

import java.util.Random;

/**
 * Created by User on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {

//        User[] users = new User[11];
//        users[0] = new User(123581321, "Tanya", "Kysla", 500, 20000);
//        users[1] = new User(12358132, "Pavel", "Rosovskiy", 400, 15000);
//        users[2] = new User(123581323, "Vladimir", "Burtsev", 600, 2050);
//        users[3] = new User(123581324, "Andrey", "Ponomarenko", 500, 3200);
//        users[4] = new User(123581325, "Gingembre", "Guillaume", 900, 4500);
//        users[5] = new User(123581326, "Maryna", "Kontar", 800, 3200);
//        users[6] = new User(123581321, "Tanya", "Kysla", 500, 20000);
//        users[7] = new User(12358132, "Pavel", "Rosovskiy", 400, 15000);
//        users[8] = new User(123581323, "Vladimir", "Burtsev", 600, 2050);
//        users[9] = new User(123581324, "Andrey", "Ponomarenko", 500, 3200);
//        users[10] = new User(123581321, "Tanya", "Kysla", 500, 20000);
//
//        UserUtils utils = new UserUtils();
//
//        User[] uniqueUsers = utils.uniqueUsers(users);
//        for (User uniqueUser : uniqueUsers) {
//            System.out.println(uniqueUser);
//        }
//

        int[] intArray = {12, -45, 67, 3, 0};
        int[] rndIntArray = new int[100000];
        Random random = new Random();

        for (int i = 0; i < rndIntArray.length; i++) {
            rndIntArray[i] = random.nextInt();
        }

        System.out.println(ArraysUtils.sum(rndIntArray));
        //System.out.println(IntStream.of(rndIntArray).parallel().sum());
    }
}
