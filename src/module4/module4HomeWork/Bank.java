package module4.module4HomeWork;

/**
 * Created by User on 13.02.2017.
 */
public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }


//

    /**
     * limit of withdrawal for {USD, EUR}
     */
    protected int[] LIMIT_OF_WITHDRAWAL = new int[]{1000, 1200};
    /**
     * limit of funding for {USD, EUR}
     */
    protected int[] LIMIT_OF_FUNDING = new int[]{Integer.MAX_VALUE, 10000};
    /**
     * monthly rate for {USD, EUR} in percent
     */
    protected int[] MONTHLY_RATE = new int[]{1, 2};
    /**
     * checksum for {USD, EUR}
     */
    protected int CHECKSUM = 1000;
    /**
     * commission if up to checksum for {USD, EUR} in percent
     */
    protected int[] COMMISSION_UP_TO_CHECKSUM = new int[]{5, 6};
    /**
     * commission if more than checksum for {USD, EUR} in percent
     */
    protected int[] COMMISSION_MORE_THAN_CHECKSUM = new int[]{7, 8};




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    //abstract int getLimitOfWithdrawal(Currency currency);
    int getLimitOfWithdrawal() {
        return LIMIT_OF_WITHDRAWAL[currency.ordinal()];
    }

    int getLimitOfFunding(){
        return LIMIT_OF_FUNDING[currency.ordinal()];}

    abstract int getMonthlyRate(Currency currency);

    abstract int getCommission(Currency currency,int summ);

    //TODO в условии не абстрактный
    double moneyPaidMonthlyForSalary(){
       return avrSalaryOfEmployee * numberOfEmployees;
    }
}
