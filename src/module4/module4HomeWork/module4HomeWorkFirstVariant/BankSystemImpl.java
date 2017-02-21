package module4.module4HomeWork.module4HomeWorkFirstVariant;

/**
 * Java#6
 * Module 4 Task 5
 * You need to following structure: abstract class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 * <p>
 * Create interface BankSystem with methods:
 * void withdrawOfUser(User user, int amount)
 * void fundUser(User user, int amount)
 * void transferMoney(User fromUser, User toUser, int amount)
 * void paySalary(User user)
 * And its implementation
 *
 * @author Kontar Maryna
 */

public class BankSystemImpl implements BankSystem {

    String limitOfFundsIsExceeded = "Limit of funds is exceeded.";
    int ifWithdraw = 0;

    public int getIfWithdraw() {
        return ifWithdraw;
    }

    public void setIfWithdraw(int ifWithdraw) {
        this.ifWithdraw = ifWithdraw;
    }

    /**
     * withdraw amount with commission from user's account if amount less than limit of withdraw, else print a  warning;
     * if (amount + commission) more than user's balance print a warning
     *
     * @param user
     * @param amount
     */
    @Override
    public void withdrawOfUser(User user, int amount) {
        setIfWithdraw(0);               /* default withdrawal is not satisfied */
        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        double commission = (double) amount * user.getBank().getCommission(amount) / 100;
        double balance = user.getBalance();

        if (amount + commission > balance)
            System.out.println("Insufficient funds.");
        else if (amount > limitOfWithdrawal)
            System.out.println("Withdrawal limit is exceeded. " +
                    "You can withdraw only " + limitOfWithdrawal + " " + user.getBank().getCurrency().toString()
                    + ". \nIf you want to change the limit of withdraw contact the bank by phone on your bank card");
        else {
            user.setBalance(balance - amount - commission);
            setIfWithdraw(1);           /* withdrawal is done */
        }
    }

    /**
     * @param user
     * @param amount
     */
    @Override
    public void fundUser(User user, int amount) {

        int limitOfFunding = user.getBank().getLimitOfFunding();
        double commission = (double) amount * user.getBank().getCommission(amount) / 100;
        double balance = user.getBalance();

        if (amount > limitOfFunding)
            System.out.println(limitOfFundsIsExceeded);
        else user.setBalance(balance + amount - commission);
    }

    /**
     * transfer money from fromUser to toUser if amount less than toUser limit of funding
     * and if can withdraw, funds to toUser's account
     *
     * @param fromUser
     * @param toUser
     * @param amount
     */
    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        int limitOfFunding = toUser.getBank().getLimitOfFunding();
        double toUserBalance = toUser.getBalance();

        if (fromUser == toUser)
            System.out.println("Change the recipient of funds.");
        else if (amount > limitOfFunding)
            System.out.println(limitOfFundsIsExceeded);
        else {
            withdrawOfUser(fromUser, amount);
            if (getIfWithdraw() == 1) { /* if withdrawal is done */
                toUser.setBalance(toUserBalance + amount); /* no commission */
            }
        }
    }

    /**
     * funds salary to user (no commission)
     *
     * @param user
     */
    @Override
    public void paySalary(User user) {

        user.setBalance(user.getBalance() + user.getSalary());
    }
}
