package module6;

/**
 * Created by User on 03.03.2017.
 */
public class UserUtils {

    //users are equal when all their field are equal
    User[] uniqueUsers(User[] users){
        User[] unique = new User[users.length];
        int k = 0;
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])){
                    unique[k] = users[i];
                    k++;
                }
            }
        }
        //TODO 1.Если бы массив был массивом чисел, то его можно было бы отсортировать квиксортом и одним for
        //проверять на одинаковость соседнии элементы. А как в этом случае сделать поиск одинаковых элементов быстрее?
        //Comparable?
        return unique;
    }

    //user’s balance == balance
    User[] usersWithContitionalBalance(User[] users, int balance){
        return new User[0];
    }

    //Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other class
    User[] paySalaryToUsers(User[] users){
        return new User[0];
    }

    long[] getUsersId(User[] users){
        return new long[0];
    }

    User[] deleteEmptyUsers(User[] users){
        return new User[0];
    }
}
