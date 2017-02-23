package module4.module4HomeWork;

/**
 * Created by User on 17.02.2017.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        int limitOfWithdraw = user.getBank().getLimitOfWithdrawal();
        if (amount < limitOfWithdraw)
            user.setBalance(user.getBalance() - amount);
        else System.out.println("You have exceeded the limit of withdrawals. " +
                "You can withdraw only " + limitOfWithdraw + " " + user.getBank().getCurrency().toString()
                + ". If you want to change limit of withdraw contact the bank by phone on your bank card");
    }

    @Override
    public void fundUser(User user, int amount, Currency currency) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount, Currency currency) {

    }

    @Override
    public void paySalary(User user) {

    }
}
