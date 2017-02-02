/**
 *  Java#6
 *  Module 2 Home work 4
 *  Write method which will fund (пополнение) balance of particular user.
 *  Print name + balance after funding
 */
public class Module2HomeWork4 {
    public static void main(String[] args) {

        // index of account owner in the array of owners
        int n;
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww"; //"Ann";
        double fund = 100; //490;

        n = Module2HomeWork3.findNameIndex(ownerNames, ownerName);
        print(n, balances, ownerName, fund);

    }

    /**
     * Fund balance of account of n owner (see ownerNames)
     * @param balance
     * @param fund
     * @return
     */
    static double fund(int balance, double fund){
        return balance + fund;
    }

    /**
     * It prints the state of the account after funding
     * @param n
     * @param balances
     * @param ownerName
     * @param fund
     */
    private static void print(int n, int[] balances, String ownerName, double fund) {
        if (n != -1) {
            double newBalance = fund(balances[n], fund);
            System.out.println(ownerName + " " + newBalance);
        }
            else System.out.println("NO");
    }

}
