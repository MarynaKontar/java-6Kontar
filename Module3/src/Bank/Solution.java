package Bank;

/**
 * Create User class with the following fields: String name, int balance,
 * int monthsOfEmployment, String companyName, int salary, String currency.
 * Create getters and setters and constructor with all fields.
 * Write methods:
 * void paySalary() -  that add salary to the balance of the user
 * withdraw(int summ) - takes money from the balance with 5% commission
 *     if summ < 1000 and 10% commission in other cases
 * companyNameLenght - calculates name of the company name
 * monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 * @author Kontar Maryna
 */
public class Solution {
    public static void main(String[] args) {

        User user1 = new User("Burtsev", 2000.45,
                500, "linux", 18000, "$");
        user1.withdraw(1550);
        System.out.println(user1.toString());
    }
}
