package module6.task2_3;

import java.util.Arrays;

/**
 * Java#6
 * Module 6 Task 3
 * Create сlass UserUtils with following methods
 * User[] uniqueUsers(User[] users) – finds and returns unique users (users are equal when all their field are equal)
 * User[] usersWithContitionalBalance(User[] users, int balance) - finds and returns the user whose balance is equal to given balance
 * User[] paySalaryToUsers(User[] users) – pay salary to each user balance
 * long[] getUsersId(User[] users) - returns an array of user IDs
 * User[] deleteEmptyUsers(User[] users) – finds and removes empty elements of the array (as a result returns a new array with smaller size)
 * <p>
 * Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.
 *
 * @author Kontar Maryna
 */
public final class UserUtils {              //nobody can inherit UserUtils

    private UserUtils() {                   //cannot create an instance of this class
    }

    /**
     * finds and returns unique users (users are equal when all their field are equal)
     *
     * @param users
     * @return
     */
    public static User[] uniqueUsers(User[] users) {  //НЕ ДОДЕЛАЛА
        User[] unique = new User[users.length];
//        int k = 0;
//        boolean ifUnique = false;
//        for (int i = 0; i < users.length; i++) {
//            for (int j = i + 1; j < users.length; j++) {
//                if (users[i] == null || !(users[i].equals(users[j]))) { //если нулл или одинаковые
//                    ifUnique = true;
//                }
//            }
//            if (ifUnique){k++;}
//            unique[k] = users[i];
//        }


        //TODO 5.Если бы массив был массивом чисел, то его можно было бы отсортировать квиксортом и одним for
        //проверять на одинаковость соседнии элементы. А как в этом случае сделать поиск одинаковых (уникальных) элементов быстрее?
        //Comparable?
        //unique = Arrays.copyOf(unique, k);
        return unique;
    }

    /**
     * finds and returns users whose balance is equal to given balance
     *
     * @param users
     * @param balance
     * @return
     */
    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersWithContitionalBalance = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) continue;
            else if (users[i].getBalance() == balance)
                usersWithContitionalBalance = addElementToArray(usersWithContitionalBalance, users[i]);
        }
        return usersWithContitionalBalance;
    }

    /**
     * pay salary to each user balance
     * Make sure paySalaryToUsers method can’t be overriden in other class
     *
     * @param users
     * @return
     */
    public final static User[] paySalaryToUsers(User[] users) {
        User[] usersWithSalary = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) continue;
            else usersWithSalary[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(),
                    users[i].getSalary(), users[i].getBalance() + users[i].getSalary());
            //TODO 6. т.к. класс User неизменяемый (immutable), то я не могу изменить баланс конкретному пользователю,
            //а должна создать нового пользователя с теми же значениями полей, но измененным балансом. Все верно?
        }
        return usersWithSalary;
    }


    //Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other class

    /**
     * returns an array of user IDs
     * Make sure getUsersId method can’t be overriden in other class
     *
     * @param users
     * @return
     */
    public final static long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) continue;
            else usersId[i] = users[i].getId();
        }
        return usersId;
    }

    /**
     * finds and removes empty elements of the array
     * (as a result returns a new array with smaller size)
     *
     * @param users
     * @return
     */
    public static User[] deleteEmptyUsers(User[] users) {
        User[] deletedEmptyUsers = new User[users.length];
        int n = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                deletedEmptyUsers[n] = users[i];
                n++;
            }
        }
        deletedEmptyUsers = Arrays.copyOf(deletedEmptyUsers, n);
        return deletedEmptyUsers;
    }


    private static User[] addElementToArray(User[] userArray, User newUser) {
        userArray = Arrays.copyOf(userArray, userArray.length + 1);
        userArray[userArray.length - 1] = newUser;
        return userArray;
    }

    //TODO 7. Получается, что новые массивы я создавала двумя методами:
    // 1. создавала массив такой же длины,что и исходный (т.к. знала, что он точно не будет большего размера).
    // Добавляла в него нужные элементы в цикле, а потом обрезала лишнюю "концовку"  (uniqueUsers, deleteEmptyUsers)
    // 2. создавала массив нулевой длины, а в цикле добавляла в него нужные элементы с помощью, т. е.
    // каждый раз создавая новый массив (usersWithContitionalBalance)
    // ВОПРОС: 1 метод лучше использовать, когда длина исходного массива не очень велика,
    // а второй метод - когда количество добавляемых элементов не очень много?????
}
