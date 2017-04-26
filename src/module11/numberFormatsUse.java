package module11;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by User on 26.04.2017.
 */
public class numberFormatsUse {
    public static void main ( String[] args ) throws UnsupportedEncodingException {
        String str0 = "Adam\u00FFNorvere";//когда символа нет на клавиатуре, то можно просто ввести его номер char d 16-ой системе
        System.out.println (str0 );
        String str1 = new String (new char[] {0x00FF, 0x00AF});
        System.out.println (str1 );


        String str = "ｮ";//0xFF6E
        System.out.println (str.charAt ( 0 ) );
        System.out.println ( Arrays.toString ( str.getBytes ("UTF-8")) );
        System.out.println ( Arrays.toString ( str.getBytes ("UTF-16BE")) );
        System.out.println ( Arrays.toString ( str.getBytes ("UTF-32")) );
        System.out.println ( Arrays.toString ( str.getBytes ("KOI8")) );
        System.out.println (new String( str.getBytes ("KOI8"), "KOI8") );

    }
}
