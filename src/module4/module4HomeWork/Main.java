package module4.module4HomeWork;

/**
 * Created by User on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        //Currency currency = Currency.;

        /**
         * creates banks
         */
        EUBank euBank = new EUBank(443456, "BELGIUM", Currency.EUR_EUBank,
                534, 2000.45, 14, 2147483647);

        USBank usBank = new USBank(555555, "USA", Currency.USD_USBank,
                1283, 1580, 22, 234450967);

        ChinaBank chinaBank = new ChinaBank(90870, "China", Currency.EUR_EUBank,
                1000, 1025.06, 11, 6454892433L);

        /**
         * creates users
         */
        User kysla = new User(123581321, "Kysla Tanya", 20000,
                500, "Playtech", 2000, euBank);

        User rosovskiy = new User(12358132, "Rosovskiy Pavel", 15000,
                400, "Luxoft", 500, euBank);

        User burtsev = new User(123581323, "Burtsev Vladimir", 2050,
                600, "BMS Soft LLC", 400, usBank);

        User Ponomarenko = new User(123581324, "Andrey Ponomarenko", 3200,
                500, "Levi9 Ukraine", 600, usBank);

        User gingembre = new User(123581325, "Gingembre Guillaume", 4500,
                900, "Infopulse", 650, chinaBank);

        User kontar = new User(123581326, "Kontar Maryna", 3200,
                800, "SPS Commerce", 700, chinaBank);
    }
}
