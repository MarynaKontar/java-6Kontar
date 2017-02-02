package Module2HW2Class;

/**
 *  Java#6
 *  Module 2 Home work 1-4
 *  creating accounts, withdraw, funding balance
 *  @author Kontar Maryna
 */
public class UseAccount {
    public static void main(String[] args) {

        Account ac1 = new Account("Jane", 1200);
        Account ac2 = new Account("Ann", 250);
        Account ac3 = new Account("Jack", 2000);
        Account ac4 = new Account("Oww", 500);
        Account ac5 = new Account("Lane", 3200);

        print(ac2, 100, false);//withdraw
        print(ac4, 490, false);//withdraw
        print(ac4, 100, true);//fund

    }
    public static void print(Account ac, double amount, boolean b){
        ac.displayName();
        if (b) ac.fund(amount);
        else ac.withdrawal(amount);
        ac.displayBalance();
        System.out.println("");

    }
}
