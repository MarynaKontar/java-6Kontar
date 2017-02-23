package module4.module4HomeWork;

/**
 * Created by User on 14.02.2017.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    //void withdrawOfUser(User user, int amount, Currency currency);

    void fundUser(User user, int amount, Currency currency);

    void transferMoney(User fromUser, User toUser, int amount, Currency currency);

    void paySalary(User user);
}
