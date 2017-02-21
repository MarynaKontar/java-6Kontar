package module4.module4HomeWork.module4HomeWorkFirstVariant;

/**
 * Java#6
 * Module 4 Task 3
 * You need to following structure: abstract class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 *
 * USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 * limit of funding - 10000 if EUR and no limit if USD
 * monthly rate - 1% with USD and 2% with EUR
 * commission - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 *
 * @author Kontar Maryna
 */
public class USBank extends Bank{

    {
        /**
         * limit of withdrawal for {USD, EUR}
         */
        limitOfWithdrawal = new int[] {1000, 1200};
        /**
         * limit of funding for {USD, EUR}
         */
        limitOfFunding = new int[] {Integer.MAX_VALUE, 10000};
        /**
         * monthly rate for {USD, EUR} in percent
         */
        monthlyRate = new int[]{1, 2};
        /**
         * checksum for {USD, EUR}
         */
        checksum = 1000;
        /**
         * commission if up to checksum for {USD, EUR} in percent
         */
        commissionUpToChecksum = new int[]{5, 6};
        /**
         * commission if more than checksum for {USD, EUR} in percent
         */
        commissionMoreThanChecksum = new int[]{7, 8};
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
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
