package Module2HW2Class;

/**
 *  Java#6
 *  Module 2 Home work 1-4
 *  This class use for creating accounts, withdraw, funding balance in UseAccount.java
 *
 *  @author Kontar Maryna
 */
public class Account {

    /**
     * Name of the account holder.
     */
    String name;
    /**
     * Current balance in th account.
     */
    double balance;

    /**
     * Constructor initializes the fields
     * @param name
     * @param balance
     */
    public Account (String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public Account (String name){
        this.name = name;
        this.balance = 0.0;
    }

    /**
     * get the account holder name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set the account holder name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the account balance
     * @return
     */
    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount){
        double commission = 0.05 * amount;
        if (balance > amount + commission) {
            balance -= amount + commission;
            System.out.println("Given money: " + amount +
                    "\nCommission: " + commission);
        }
        else System.out.println("Not enough money.");
    }
    public void fund(double amount){
        balance += amount;
        System.out.println("Fund: " + amount);
    }

    public void displayBalance(){
        System.out.println("Balance " + this.balance);
    }

    public void displayName(){
        System.out.println(this.name);
    }

    @Override
    public String toString(){
        return name + ", " + balance;
    }

}
