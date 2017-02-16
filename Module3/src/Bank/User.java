package Bank;

import java.text.DecimalFormat;

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

public class User {

    private final int CHECK_SUM = 1000;
    private final double COMMISSION_IF_SUM_LESS1000 = 0.05; // 5 %
    private final double COMMISSION_IF_SUM_MORE1000 = 0.1; // 10 %
    private  String PATTERN = "#0.00"; //view for double


    private String name;
    private double balance;
    private double monthsOfEmployment;
    private String companyName;
    private double salary;
    private String currency;

    public User(String name, double balance, double monthsOfEmployment, String companyName, double salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
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

    public double getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(double monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * add salary to the balance of the user
     */
    public void paySalary(){
        balance += salary;
        //setBalance(getBalance() + getSalary());
    }

    /**
     * takes money from the balance with 5% commission if summ < CHECK_SUM and
     * 10% commission in other cases
     * @param summ
     *
     * TODO 2. changed the commission and the checksum on a constant
     */
    public void withdraw(int summ){//withdraw from the account can only be an integer
        if (summ < CHECK_SUM && balance > (1 + COMMISSION_IF_SUM_LESS1000) * summ) {
            balance -= (1 + COMMISSION_IF_SUM_LESS1000) * summ;}
            else if (summ >= CHECK_SUM && balance > (1 + COMMISSION_IF_SUM_MORE1000) * summ){
            balance -= (1 + COMMISSION_IF_SUM_MORE1000) * summ;}
            else System.out.println("Not enough money.");
    }

    //calculates length of the company name
    public int companyNameLenght(){
        return companyName.length();
    }

    /**
     * increase monthsOfEmployment by addMonth
     * @param addMonth
     */
    public void monthIncreaser(double addMonth){
        monthsOfEmployment += addMonth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(80);
        String formattedBalance = new DecimalFormat(PATTERN).format(balance);
        sb.append("User{name=").append(name);
        sb.append("\n balance=").append(formattedBalance);
        sb.append("\n company name='").append(companyName).append("\'");
        sb.append('}');
        return sb.toString();
    }
}
