package Bank;

/**
 * Create User class with the following fields: String name, int balance,
 * int monthsOfEmployment, String companyName, int salary, String currency.
 * Create getters and setters and constructor with all fileds.
 * Write methods:
 * void paySalary() -  that add salary to the balance of the user
 * withdraw(int summ) - takes money from the balance with 5% commision
 *     if summ < 1000 and 10% commision in other cases
 * companyNameLenght - calculates name of the company name
 * monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 * @author Kontar Maryna
 */

public class User {
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
        setBalance(getBalance() + getSalary());//balance + salary???
    }

    /**
     * takes money from the balance with 5% commision if summ < 1000 and
     * 10% commision in other cases
     * @param summ
     *
     * TODO What is better (protected): balance -= 1.05 * summ;  or setBalance(getBalance() - 1.05 * summ)
     */
    public void withdraw(int summ){//withdraw from the account can only be an integer
        if (summ < 1000 && balance > 1.05 * summ) {
            balance -= 1.05 * summ;}
            else if (summ >= 1000 && balance > 1.1 * summ){
            balance -= 1.1 * summ;}
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

}
