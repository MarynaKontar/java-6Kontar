package module4.module4HomeWork.module4HomeWorkFirstVariant;

/**
 * Java#6
 * Module 4 Task 3
 * You need to following structure: abstarct class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 *
 * ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
 * limit of funding - 5000 if EUR and 10000 if USD
 * monthly rate - 1% with USD and 0% with EUR
 * commission - 3% if USD and up to 1000, 5% if USD and more than 1000
 * 10% if EUR and up to 1000 and 11% if EUR and more than 1000
 *
 * @author Kontar Maryna
 */

public class ChinaBank extends Bank {

    {
            /**
             * limit of withdrawal for {USD, EUR}
             */
            limitOfWithdrawal = new int[] {100, 150};
            /**
             * limit of funding for {USD, EUR}
             */
            limitOfFunding = new int[] {5000, 10000};
            /**
             * monthly rate for {USD, EUR} in percent
             */
            monthlyRate = new int[]{1, 0};
            /**
             * checksum for {USD, EUR}
             */
            checksum = 1000;
            /**
             * commission if up to checksum for {USD, EUR} in percent
             */
            commissionUpToChecksum = new int[]{3, 10};
            /**
             * commission if more than checksum for {USD, EUR} in percent
             */
            commissionMoreThanChecksum = new int[]{5, 11};
        }

        public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
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

