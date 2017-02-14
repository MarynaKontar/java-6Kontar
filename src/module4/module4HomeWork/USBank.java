package module4.module4HomeWork;

/**
 * USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 * limit of funding - 10000 if EUR and no limit if USD
 * monthly rate - 1% with USD and 2% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 *
 * monthly rate - месячная ставка
 * withdrawal - снять со счета
 *
 */
public class USBank  extends Bank{

    private final int LIMIT_OF_WITHDRAWAL_USD = 1000;
    private final int LIMIT_OF_WITHDRAWAL_EUR = 1200;
    private final int LIMIT_OF_FUNDING_EUR = 10000;
    private final double MONTHLY_RATE_USD = 0.01;//1%
    private final double MONTHLY_RATE_EUR = 0.02;//2%
    private final int CHECKSUM = 1000;
    private final double COMMISSION_UP_TO_CHECKSUM_USD = 0.05;//5%
    private final double COMMISSION_MORE_THAN_CHECKSUM_USD = 0.07;//7%
    private final double COMMISSION_UP_TO_CHECKSUM_EUR = 0.06;//6%
    private final double COMMISSION_MORE_THAN_CHECKSUM_EUR = 0.08;//8%

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int summ) {
        return 0;
    }

//    @Override
//    double moneyPaidMonthlyForSalary() {
//        return 0;
//    }
}
