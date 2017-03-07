package module6;

import java.util.Arrays;

/**
 * Java#6
 * Module 6 Task 3
 * Create UsersMain class with main method where create some test users and
 * demonstrate how each method from UserUtils works.
 *
 * @author Kontar Maryna
 */
public class UserMain {
    public static void main(String[] args) {

        User[] users = new User[8];
        users[0] = new User(123581321, "Tanya", "Kysla", 500, 20000);
        users[1] = new User(123581320, "Pavel", "Rosovskiy", 400, 15000);
        users[2] = new User(123581323, "Vladimir", "Burtsev", 600, 2050);
        users[3] = null;
        users[4] = new User(123581324, "Andrey", "Ponomarenko", 500, 3200);
        users[5] = new User(123581325, "Gingembre", "Guillaume", 900, 4500);
        users[6] = new User(123581326, "Maryna", "Kontar", 800, 3200);
        users[7] = new User(123581327, "Tanya", "Kysla", 500, 20000);
//        users[8] = new User(123581322, "Pavel", "Rosovskiy", 400, 15000);
//        users[9] = new User(123581328, "Vladimir", "Burtsev", 600, 2050);
//        users[10] = new User(123581329, "Andrey", "Ponomarenko", 500, 3200);
//        users[11] = null;
//        users[12] = null;
//        users[13] = new User(123581330, "Tanya", "Kysla", 500, 20000);
//        users[14] = null;

        System.out.println("Delete empty users");
        print(UserUtils.deleteEmptyUsers(users));

        System.out.println("Unique users");
        print(UserUtils.uniqueUsers(users));

        System.out.println("Users with contitional balance");
        print(UserUtils.usersWithContitionalBalance(users, 20000));

        System.out.println("Pay salary to all users");
        users = UserUtils.paySalaryToUsers(users);
        print(users);

        System.out.println("Users id");
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
    }

    private static void print(User[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }
}
