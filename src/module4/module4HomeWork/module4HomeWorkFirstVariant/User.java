package module4.module4HomeWork.module4HomeWorkFirstVariant;

import java.text.DecimalFormat;

/**
 * Java#6
 * Module 4 Task 4
 * You need to following structure: abstarct class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 *
 * User should have following fields:
 * long id
 * String name
 * double balance
 * int monthsOfEmployment
 * String companyName
 * int salary
 * Bank bank
 * User does not have its own methods. But overrides toString method.
 * @author Kontar Maryna
 */

public class User {

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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        String formattedBalance = new DecimalFormat("#0.00").format(balance);
        sb.append("id=").append(id);
        sb.append(", \nname: '").append(name).append('\'');
        sb.append(", \nbalance = ").append(formattedBalance);
        sb.append(", \nmonthsOfEmployment = ").append(monthsOfEmployment);
        sb.append(", \ncompanyName: '").append(companyName).append('\'');
        sb.append(", \nsalary = ").append(salary);
        sb.append(", \nbank: ").append(bank.getClass().getSimpleName());
        sb.append('}');
        return sb.toString();
    }
}
