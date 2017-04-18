package module10.TestExceptionsAndErrors;

/**
 * Created by User on 11.04.2017.
 */
public class TestDifferent {
    public static void main ( String[] args ) {
        float f = Float.NaN;
        String s = "" + f;
        float f2 = Float.valueOf ( s );
        System.out.println ("f: " + f + ",  s: " + s + ",  f2: " + f2); //f: NaN,  s: NaN,  f2: NaN
        //NaN + 1 = NaN. т.е. есди кто-то в форму ввел не число, а NaN, (а  NaN больше всех чисел),
        // то каждій месяц ему будет приз за самую крупную покупку
    }
}
