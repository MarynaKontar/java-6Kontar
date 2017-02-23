package module4.module4HomeWork;

/**
 * USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 * limit of funding - 10000 if EUR and no limit if USD
 * monthly rate - 1% with USD and 2% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 * <p>
 * monthly rate - месячная ставка
 * withdrawal - снять со счета
 */
public class USBank extends Bank {

    {
        /**
         * limit of withdrawal for {USD, EUR}
         */
        LIMIT_OF_WITHDRAWAL = new int[]{100, 1200};
        //private int[] limitOfWithdrawal = new int[]{1000, 1200};

        /**
         * limit of funding for {USD, EUR}
         */
        LIMIT_OF_FUNDING = new int[]{Integer.MAX_VALUE, 10000};
        /**
         * monthly rate for {USD, EUR} in percent
         */
        MONTHLY_RATE = new int[]{1, 2};
        /**
         * checksum for {USD, EUR}
         */
        CHECKSUM = 1000;
        /**
         * commission if up to checksum for {USD, EUR} in percent
         */
        COMMISSION_UP_TO_CHECKSUM = new int[]{5, 6};
        /**
         * commission if more than checksum for {USD, EUR} in percent
         */
        COMMISSION_MORE_THAN_CHECKSUM = new int[]{7, 8};
    }


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
//
//    @Override
//    int getLimitOfWithdrawal(Currency currency) {
//        return limitOfWithdrawal[currency.ordinal()];
//    }

    @Override
    int getLimitOfFunding() {
        return LIMIT_OF_FUNDING[getCurrency().ordinal()];
    }

    @Override
    int getMonthlyRate(Currency currency) {
        return MONTHLY_RATE[currency.ordinal()];
    }

    @Override
    int getCommission(Currency currency, int summ) {
        return (summ < CHECKSUM) ? COMMISSION_UP_TO_CHECKSUM[currency.ordinal()] :
                COMMISSION_MORE_THAN_CHECKSUM[currency.ordinal()];
    }


}
