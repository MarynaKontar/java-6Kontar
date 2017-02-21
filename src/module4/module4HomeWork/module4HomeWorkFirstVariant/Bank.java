package module4.module4HomeWork.module4HomeWorkFirstVariant;

/**
 * Java#6
 * Module 4 Task 1
 * You need to following structure: abstarct class Bank and three classes that extends it:
 * USBank, EUBank, ChinaBank. Enum Currency.
 * Class User that represents User of our Bank System. Interface BankSystem and its implementation BankSystemImpl.
 *
 * Abstract class Bank should contain fields
 * long id
 * String bankCountry
 * Currency currency
 * int numberOfEmployees
 * double avrSalaryOfEmployee
 * long rating
 * long totalCapital
 * <p>
 * Generate getters and setters. And create constructor with all fields.
 * <p>
 * Methods are:
 * abstract int getLimitOfWithdrawal()
 * abstract int getLimitOfFunding()
 * abstract int getMonthlyRate()
 * abstract int getCommission(int summ)
 * double moneyPaidMonthlyForSalary()
 *
 * @author Kontar Maryna
 */
public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;


    //TODO first I made these limits and commissions by constant in extends banks,
    // but Bank must have to change these values if client wants
    /**
     * limit of withdrawal for {USD, EUR}
     */
    protected int[] limitOfWithdrawal = new int[]{1000, 1200};

    /**
     * limit of funding for {USD, EUR}
     */
    protected  int[] limitOfFunding = new int[]{Integer.MAX_VALUE, 10000};

    /**
     * monthly rate for {USD, EUR} in percent
     */
    protected  int[] monthlyRate = new int[]{1, 2};

    /**
     * checksum for {USD, EUR}
     */
    protected  int checksum = 1000;

    /**
     * commission if up to checksum for {USD, EUR} in percent
     */
    protected  int[] commissionUpToChecksum = new int[]{5, 6};

    /**
     * commission if more than checksum for {USD, EUR} in percent
     */
    protected  int[] commissionMoreThanChecksum = new int[]{7, 8};


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


    public void setLimitOfWithdrawal(int[] limitOfWithdrawal) {
        this.limitOfWithdrawal = limitOfWithdrawal;
    }

    protected void setLimitOfFunding(int[] limitOfFunding) {
        this.limitOfFunding = limitOfFunding;
    }

    protected void setMonthlyRate(int[] monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    protected int getChecksum() {
        return checksum;
    }

    protected void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    protected int[] getCommissionUpToChecksum() {
        return commissionUpToChecksum;
    }

    protected void setCommissionUpToChecksum(int[] commissionUpToChecksum) {
        this.commissionUpToChecksum = commissionUpToChecksum;
    }

    protected int[] getCommissionMoreThanChecksum() {
        return commissionMoreThanChecksum;
    }

    protected void setCommissionMoreThanChecksum(int[] commissionMoreThanChecksum) {
        this.commissionMoreThanChecksum = commissionMoreThanChecksum;
    }


    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary() {
        return avrSalaryOfEmployee * numberOfEmployees;
    }
}
