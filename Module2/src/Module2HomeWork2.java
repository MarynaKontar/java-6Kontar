/**
 * Java#6
 * Module 2 Home work 2
 * Write method which withdraw money from account and takes commision 5% of the transaction.
 * Print OK + commission + balance after withdrawal.
 * Print NO is withdrawal is not possible.
 *
 * There are two variant for method withdraw (with additional method commission and without)
 * see under comments below
 * @author Kontar Maryna
 */

public class Module2HomeWork2 {
    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10; //99;
        print(balance, withdrawal);

    }

    /**
     * It prints the state of the account after withdrawal
     * @param balance
     * @param withdrawal
     */
    private static void print(double balance, double withdrawal) {
        double[] newBalance = withdraw(balance,withdrawal);
        System.out.println((newBalance[0] == -1) ? "NO" :
                "OK " + newBalance[0] + " " + newBalance[1]);
    }

    /**
     * withdraw money from account and takes commission 5% of the transaction.
     * @param balance
     * @param withdrawal
     * @return
     */
    static double[] withdraw(double balance, double withdrawal){
        double[] newBalance = {-1, balance};
        double commission = 0.05 * withdrawal;
        if (withdrawal + commission <= balance){
            newBalance[0] = commission;
            newBalance[1] = balance - withdrawal - commission;}

        return newBalance;
    }
}


//public class Module2HomeWork2 {
//    public static void main(String[] args) {
//        double balance = 100;
//        double withdrawal = 10; //99;
//        print(balance, withdrawal);
//    }
//
//    /**
//     * It prints the state of the account after withdrawal
//     * @param balance
//     * @param withdrawal
//     */
//    private static void print(double balance, double withdrawal) {
//        double newBalance = withdraw(balance,withdrawal);
//        System.out.println((newBalance == -1) ? "NO" :
//                "OK " + commission(withdrawal) + " " + newBalance);
//    }
//
//    /**
//     * withdraw money from account and takes commission 5% of the transaction.
//     * @param balance
//     * @param withdrawal
//     * @return
//     */
//    static double withdraw(double balance, double withdrawal){
//        double newBalance = -1;
//        double commission = commission(withdrawal);
//        if (withdrawal + commission <= balance){
//            newBalance = balance - withdrawal - commission;}
//
//        return newBalance;
//    }
//
//    /**
//     * return commission 5% of the transaction
//     * @param withdrawal
//     * @return
//     */
//    static double commission(double withdrawal){
//        return 0.05 * withdrawal;
//    }
//}
