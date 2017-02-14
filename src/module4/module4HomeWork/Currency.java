package module4.module4HomeWork;

/**
 * Created by User on 13.02.2017.
 */
public enum Currency { USD(0), EUR(1);
    private int code;
    Currency(int c){
    code = c;
}

    public int getCode() {
        return code;
    }
}
