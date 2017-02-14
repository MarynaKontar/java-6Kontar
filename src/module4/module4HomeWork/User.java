package module4.module4HomeWork;

import java.text.DecimalFormat;

/**
 * Created by User on 14.02.2017.
 */
public class User implements BankSystem{

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment,
                String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {

    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount < bank.getLimitOfFunding())
            balance += amount;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        String formattedBalance = new DecimalFormat("#0.00").format(balance);
        sb.append("id=").append(id);
        sb.append(", \nname='").append(name).append('\'');
        sb.append(", \nbalance=").append(formattedBalance);
        sb.append(", \nmonthsOfEmployment=").append(monthsOfEmployment);
        sb.append(", \ncompanyName='").append(companyName).append('\'');
        sb.append(", \nsalary=").append(salary);
        sb.append(", \nbank=").append(bank);
        sb.append('}');
        return sb.toString();
    }
}
