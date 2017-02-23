package module4.module4HomeWork;

/**
 * EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
 * limit of funding - 20000 if EUR and 10000 if USD
 * monthly rate - 0% with USD and 1% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 2% if EUR and up to 1000 and 4% if EUR and more than 1000
 */
public class EUBank extends Bank {

    private final double MONTHLY_RATE_USD = 0.00;//0%
    private final double MONTHLY_RATE_EUR = 0.01;//1%
    private final int CHECKSUM = 1000;
    private final double COMMISSION_UP_TO_CHECKSUM_USD = 0.05;//5%
    private final double COMMISSION_MORE_THAN_CHECKSUM_USD = 0.07;//7%
    private final double COMMISSION_UP_TO_CHECKSUM_EUR = 0.02;//2%
    private final double COMMISSION_MORE_THAN_CHECKSUM_EUR = 0.04;//4%
    private int LIMIT_OF_WITHDRAWAL_USD = 2000;
    private int LIMIT_OF_WITHDRAWAL_EUR = 2200;
    private int LIMIT_OF_FUNDING_EUR = 20000;
    private int LIMIT_OF_FUNDING_USD = 10000;


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

//    @Override
//    int getLimitOfWithdrawal(Currency currency) {
//        return 0;
//    }
//
//    @Override
//    int getLimitOfFunding(Currency currency) {
//        return 0;
//    }

    @Override
    int getMonthlyRate(Currency currency) {
        return 0;
    }

    @Override
    int getCommission(Currency currency, int summ) {
        return 0;
    }


}
