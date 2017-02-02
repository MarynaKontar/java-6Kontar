/**
 * Java#6
 * Module 2 Home work 3
 *  Write method which withdraw money of particular account owner if he/she can.
 *  Print name + NO of withdrawal fs not possible
 *  and name + sum of withdrawal + balance after withdrawal in other case.
 *  Commission is 5% for all cases.
 * @author Kontar Maryna
 */
public class Module2HomeWork3 {
    public static void main(String[] args) {

        // index of account owner in the array of owners
        int n;
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww"; //"Ann";
        double withdrawal = 490; //100;

        n = findNameIndex(ownerNames, ownerName);
        print(n, balances, ownerName, withdrawal);

    }

    /**
     * It prints the state of the account after withdrawal
     * СИЛЬНО НАМУДРИЛА ЗДЕСЬ С if. НО КАК ТО НИКАК ПО-ДРУГОМУ....
     * @param n
     * @param balances
     * @param ownerName
     * @param withdrawal
     */
    private static void print(int n, int[] balances, String ownerName, double withdrawal) {
        if (n != -1) {
            double[] newBalance = Module2HomeWork2.withdraw(balances[n], withdrawal);
            if (newBalance[0] != -1)
                System.out.println(ownerName + " " + withdrawal + " " + newBalance[1]);
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }

    /**
     * Find index of name in ownerNames that is equal to ownerName (case sensitive)
     * @param ownerNames
     * @param ownerName
     * @return
     */
    static int findNameIndex(String[] ownerNames, String ownerName) {
        int n = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                n = i;
                break;
            }
        }
        return n;
    }


}
