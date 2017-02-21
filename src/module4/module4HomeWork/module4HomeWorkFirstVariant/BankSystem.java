package module4.module4HomeWork.module4HomeWorkFirstVariant;

/**
 * Java#6
 * Module 4 Task 5
 * Create interface BankSystem with methods:
 * void withdrawOfUser(User user, int amount)
 * void fundUser(User user, int amount)
 * void transferMoney(User fromUser, User toUser, int amount)
 * void paySalary(User user)
 * And its implementation
 * @author Kontar Maryna
 */

public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
