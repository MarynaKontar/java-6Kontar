package module4.module4HomeWork.module4HomeWorkFirstVariant;

/**
 * Java#6
 * Module 4 Task 3
 * You need to following structure: abstarct class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 *
 * EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
 * limit of funding - 20000 if EUR and 10000 if USD
 * monthly rate - 0% with USD and 1% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 2% if EUR and up to 1000 and 4% if EUR and more than 1000
 *
 * @author Kontar Maryna
 */
public class EUBank extends Bank{

    {
        /**
         * limit of withdrawal for {USD, EUR}
         */
        limitOfWithdrawal = new int[] {2000, 2200};
        /**
         * limit of funding for {USD, EUR}
         */
        limitOfFunding = new int[] {20000, 10000};
        /**
         * monthly rate for {USD, EUR} in percent
         */
        monthlyRate = new int[]{0, 1};
        /**
         * checksum for {USD, EUR}
         */
        checksum = 1000;
        /**
         * commission if up to checksum for {USD, EUR} in percent
         */
        commissionUpToChecksum = new int[]{5, 2};
        /**
         * commission if more than checksum for {USD, EUR} in percent
         */
        commissionMoreThanChecksum = new int[]{7, 4};
    }

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
    double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    /**
     * return limit of withdraw for {USD, EUR}
     * @return
     */
    @Override
    int getLimitOfWithdrawal() {
        return limitOfWithdrawal[getCurrency().ordinal()];
    }

    /**
     * reeturn limit of funding for {USD, EUR}
     * @return
     */
    @Override
    int getLimitOfFunding() {
        return limitOfFunding[getCurrency().ordinal()];
    }

    /**
     * return monthly rate in percent for {USD, EUR}
     * TODO  (if we want return sum of commission (not percent) we have make  double getMonthlyRate())
     * @return
     */
    @Override
    int getMonthlyRate() {
        return monthlyRate[getCurrency().ordinal()];
    }


    /**
     * return commission in percent for summ
     * TODO  (if we want return sum of commission (not percent) we have make  double getCommission(int summ))
     * @param summ
     * @return
     */
    @Override
    int getCommission(int summ) {
        return (summ < checksum) ? commissionUpToChecksum[getCurrency().ordinal()] :
                commissionMoreThanChecksum[getCurrency().ordinal()];
    }

}

