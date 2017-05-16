package module11;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;

/**
 * Created by User on 25.04.2017.
 */
public class CharsetUse {
    public static void main ( String[] args ) {
        Map<String, Charset> allCharsets = Charset.availableCharsets ();
        Set<String> charsetNames = allCharsets.keySet();
        charsetNames.forEach ( System.out::println );
        System.out.println (charsetNames.size () );//170 charsets (кодировок)

        //Любая JVM должна иметь 6 charset, которые представлены константами в StandardCharsets:
        Charset iso88591 = StandardCharsets.ISO_8859_1;
        Charset us_ascii = StandardCharsets.US_ASCII;
        Charset utf_8 = StandardCharsets.UTF_8;
        Charset utf_16be = StandardCharsets.UTF_16BE;
        Charset  utf_16le = StandardCharsets. UTF_16LE;
        Charset  utf_16 = StandardCharsets. UTF_16;
    }
}
