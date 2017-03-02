package module4.module4HomeWork.module4HomeWorkFirstVariant;

//mport java.util.Currency;



/**
 * Java#6
 * Module 4 Task 6
 * You need to following structure: abstarct class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 * <p>
 * Сreate Main class with main method, where you should create 6 Users: 2 of USBank,
 * 2 of EUBank and 2 of ChinaBank.
 * Run four different operations with every User’s balance and print its objects to console.
 *
 * @author Kontar Maryna
 */
public class Main {

    public static void main(String[] args) {


//        /* creates banks */
//        EUBank euBank = new EUBank(443456, "BELGIUM", Currency.EUR,
//                534, 2000.45, 14, 2147483647);
//
//        USBank usBank = new USBank(555555, "USA", Currency.USD,
//                1283, 1580, 22, 234450967);
//
//        ChinaBank chinaBank = new ChinaBank(90870, "China", Currency.EUR,
//                1000, 1025.06, 11, 6454892433L);
//
//
//        /* creates users */
//        User kysla = new User(123581321, "Kysla Tanya", 20000,
//                500, "Playtech", 2000, euBank);
//
//        User rosovskiy = new User(12358132, "Rosovskiy Pavel", 15000,
//                400, "Luxoft", 500, euBank);
//
//        User burtsev = new User(123581323, "Burtsev Vladimir", 2050,
//                600, "BMS Soft LLC", 400, usBank);
//
//        User ponomarenko = new User(123581324, "Andrey Ponomarenko", 3200,
//                500, "Levi9 Ukraine", 600, usBank);
//
//        User gingembre = new User(123581325, "Gingembre Guillaume", 4500,
//                900, "Infopulse", 650, chinaBank);
//
//        User kontar = new User(123581326, "Kontar Maryna", 3200,
//                800, "SPS Commerce", 700, chinaBank);
//
//
//        /* creates users */
//        BankSystemImpl bankSystem = new BankSystemImpl();
//
//
//        /* declaration and initialization array of User */
//        User[] users = new User[]{kysla, rosovskiy, burtsev, ponomarenko, gingembre, kontar};
//
//
//
//        //ДАЛЕЕ ВСЕ ВЫВОДИТСЯ  В КОНСОЛЬ ТОЛЬКО ДЛЯ ТОГО, ЧТОБЫ ПОКАЗАТЬ, КАК РАБОТАЕТ СНЯТИЕ-ПОПОЛНЕНИЕ СЧЕТОВ И Т. Д.
//        /* pay salary, withdraw and fund money from/to user account */
//        for (User user : users) {
//            System.out.print(user.getName() + ": " + user.getBalance() + "; ");
//
//            /* pay salary */
//            paySalaryAndPrint(bankSystem, user);
//
//            /* withdraw money */
//            withdrawMoneyAndPrint(bankSystem, user, 500);
//
//            /* fund money */
//            fundUserAndPrint(bankSystem, user, 500);
//
//            System.out.println("");
//        }
//        System.out.println("");
//
//        /* transfer money */
//        System.out.println("Transfer money: ");
//        transferMoneyAndPrint(kysla, rosovskiy, bankSystem, 500);
//        transferMoneyAndPrint(rosovskiy, burtsev, bankSystem, 1500);
//        transferMoneyAndPrint(burtsev, ponomarenko, bankSystem, 1200);
//        transferMoneyAndPrint(ponomarenko, gingembre, bankSystem, 800);
//        transferMoneyAndPrint(gingembre, kontar, bankSystem, 300);
//        transferMoneyAndPrint(kontar, kysla, bankSystem, 100);
//
//
//
//        /* print its users to console*/
//        for (User user : users) {
//            System.out.println(user.toString());
//            System.out.println("");
//        }
//
//
//    }
//
//    /**
//     * pay salary to user user with bank system bankSystem
//     * and print salary and balance after paying salary
//     *
//     * @param bankSystem
//     * @param user
//     */
//    private static void paySalaryAndPrint(BankSystemImpl bankSystem, User user) {
//        bankSystem.paySalary(user);
//        System.out.print("salary: " + user.getSalary() + ", new balance: " + user.getBalance() + "; ");
//    }
//
//    /**
//     * withdraw amount withdrawAmount from user account with bank system bankSystem
//     * and print withdraw amount and balance after withdraw
//     *
//     * @param bankSystem
//     * @param user
//     * @param withdrawAmount
//     */
//    private static void withdrawMoneyAndPrint(BankSystemImpl bankSystem, User user, int withdrawAmount) {
//        bankSystem.withdrawOfUser(user, withdrawAmount);
//        System.out.print("withdraw amount: " + withdrawAmount + ", new balance: " + user.getBalance() + "; ");
//    }
//
//    /**
//     * fund amount fundAmount from user user with bank system bankSystem
//     * and print fund amount and balance after funding
//     *
//     * @param bankSystem
//     * @param user
//     * @param fundAmount
//     */
//    private static void fundUserAndPrint(BankSystemImpl bankSystem, User user, int fundAmount) {
//        bankSystem.fundUser(user, fundAmount);
//        System.out.print("fund amount: " + fundAmount + ", new balance: " + user.getBalance() + ";\n");
//    }
//
//    /**
//     * transfer transferAmount from fromUser account to toUser account with  bank system bankSystem
//     * and print names of users and balances before and after transfer
//     *
//     * @param fromUser
//     * @param toUser
//     * @param bankSystem
//     * @param transferAmount
//     */
//    private static void transferMoneyAndPrint(User fromUser, User toUser, BankSystem bankSystem, int transferAmount) {
//
//        System.out.println(fromUser.getName() + ": " + fromUser.getBalance() + ";"
//                + toUser.getName() + ": " + toUser.getBalance() + ";");
//
//        bankSystem.transferMoney(fromUser, toUser, transferAmount);
//
//        System.out.print("after transfer balance is: " + fromUser.getName() + " - " + fromUser.getBalance() + "; "
//                + toUser.getName() + " - " + toUser.getBalance() + ";\n");
//        System.out.println("");
    }
}
