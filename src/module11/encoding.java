package module11;

import com.sun.xml.internal.ws.api.server.Adapter;

import java.util.Arrays;

/**
 * Created by User on 20.04.2017.
 */
public class encoding {
    public static void main ( String[] args ) throws Exception {
        String str = new String ( new byte[]{65, 99, 45} );
        System.out.println ( str );
        byte[] raw1 = str.getBytes ( "UTF-8" );
        byte[] raw2 = str.getBytes ( "ASCII" );

        System.out.println ( Arrays.toString ( raw1 ) );
        System.out.println ( Arrays.toString ( raw2 ) );


        System.out.println ( "A".getBytes ( "UTF-16" ).length );//4
        System.out.println ( "AA".getBytes ( "UTF-16" ).length );//6
        System.out.println ( "AAA".getBytes ( "UTF-16" ).length );//8
        //Что за лишние 2 байта в "A"?

        System.out.println ( "ЭЮЯ".getBytes ( "UTF-8" ).length );//6 байт занимает 3 буквы русского алфавита
        System.out.println ( "ЭЮЯ".getBytes ( "cp1251" ).length );//3 байта
        System.out.println ( "D".getBytes ( "UTF-8" ).length );//1 байт занимает 1 буква английского алфавита
        //Английские буквы в кодировке UTF-8 занимают меньше места (1 байт одна буква, а русские - 2 байта)

        System.out.println ( Arrays.toString ( "ЭЮЯ".getBytes ( "UTF-8" ) ) );


        char ch;
        ch = 0x0001;//1
        System.out.println ( Arrays.toString ( ("" + ch).getBytes ( "UTF-8" ) ) );//1
        ch = 128;//273
        System.out.println ( Arrays.toString ( ("" + ch).getBytes ( "UTF-8" ) ) );//2 байта
        ch = 0x1111;//4369
        System.out.println ( Arrays.toString ( ("" + ch).getBytes ( "UTF-8" ) ) );//3 байта



//        byte[] bytes = {70, 71, 72};
        byte[] bytes = {-127, -101, -102};
//        String str1 = new String (bytes,"UTF-8");

        System.out.println (Arrays.toString ( new String (bytes,"UTF-8" ).toCharArray ()));
//        System.out.println ( new String (bytes,"UTF-8" ));

        System.out.println (Arrays.toString ( new String (bytes,"cp1251" ).toCharArray ()));
//        System.out.println ( new String (bytes,"cp1251" ));

//        char[] chars = str1.toCharArray ();
//        System.out.println (chars[0] );
//        System.out.println (chars[1] );
//        System.out.println (chars[2] );
    }
}
