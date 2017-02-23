package module4.module4HomeWork;

/**
 * ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
 * limit of funding - 5000 if EUR and 10000 if USD
 * monthly rate - 1% with USD and 0% with EUR
 * commission - 3% if USD and up to 1000, 5% if USD and more than 1000
 * 10% if EUR and up to 1000 and 11% if EUR and more than 1000
 */
public class ChinaBank extends Bank {

    private final int LIMIT_OF_WITHDRAWAL_USD = 100;
    private final int LIMIT_OF_WITHDRAWAL_EUR = 150;
    private final int LIMIT_OF_FUNDING_EUR = 5000;
    private final int LIMIT_OF_FUNDING_USD = 10000;
    private final double MONTHLY_RATE_USD = 0.01;//1%
    private final double MONTHLY_RATE_EUR = 0.00;//0%
    private final int CHECKSUM = 1000;
    private final double COMMISSION_UP_TO_CHECKSUM_USD = 0.03;//3%
    private final double COMMISSION_MORE_THAN_CHECKSUM_USD = 0.05;//5%
    private final double COMMISSION_UP_TO_CHECKSUM_EUR = 0.10;//10%
    private final double COMMISSION_MORE_THAN_CHECKSUM_EUR = 0.11;//11%

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
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
