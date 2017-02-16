package module4.module4HomeWork;

/**
 * Created by User on 13.02.2017.
 */
public enum Currency {
//    USD_USBank(1000, Integer.MAX_VALUE, 0.01, 1000, 0.05, 0.07),
//    EUR_USBank(1200, 10000, 0.02, 1000, 0.06, 0.08),
//    USD_EUBank(2000, 10000, 0.00, 1000, 0.05, 0.07),
//    EUR_EUBank(2200, 20000, 0.01, 1000, 0.02, 0.04),
//    USD_ChinaBank(100, 10000, 0.01, 1000, 0.03, 0.05),
//    EUR_ChinaBank(150, 5000, 0.00, 1000, 0.10, 0.11);



    USD(new int[]{1000,2000,100}, new int[]{Integer.MAX_VALUE,10000,10000}, new double[]{0.01,0.00,0.01},
            new double[]{0.05,0.07,0.05}, new double[]{0.07,0.07,0.05}),
    EUR(new int[]{1200,2200,150}, new int[]{10000,20000,5000}, new double[]{0.02,0.01,0.00},
            new double[]{0.06,0.02,0.10}, new double[]{0.08,0.04,0.11});



    /**
     * limit of withdrawal
     */
    private final int[] LIMIT_OF_WITHDRAWAL;

    /**
     *limit of funding
     */
    private final int[] LIMIT_OF_FUNDING;

    /**
     *monthly rate
     */
    private final double[] MONTHLY_RATE;

//    /**
//     * checksum
//     */
//    private final int[] CHECKSUM;

    /**
     * commission (in % divided by 100) if up to checksum, if USD and more than 1000
     */
    private final double[] COMMISSION_UP_TO_CHECKSUM;

    /**
     *commission (in % divided by 100) if more than checksum
     */
    private final double[] COMMISSION_MORE_THAN_CHECKSUM;

    Currency(int[] LIMIT_OF_WITHDRAWAL, int[] LIMIT_OF_FUNDING, double[] MONTHLY_RATE,
             double[] COMMISSION_UP_TO_CHECKSUM, double[] COMMISSION_MORE_THAN_CHECKSUM) {
        this.LIMIT_OF_WITHDRAWAL = LIMIT_OF_WITHDRAWAL;
        this.LIMIT_OF_FUNDING = LIMIT_OF_FUNDING;
        this.MONTHLY_RATE = MONTHLY_RATE;
        this.COMMISSION_UP_TO_CHECKSUM = COMMISSION_UP_TO_CHECKSUM;
        this.COMMISSION_MORE_THAN_CHECKSUM = COMMISSION_MORE_THAN_CHECKSUM;
    }


    public static final  int CHECKSUM1 = 1000;
//
    public int[] LIMIT_OF_WITHDRAWAL(){return LIMIT_OF_WITHDRAWAL;}

}
