package module11;

import java.util.Arrays;

/**
 * Created by User on 25.04.2017.
 */
public class CharUse {
    public static void main ( String[] args ) {
        for ( char c = 'а'; c <= 'я'; c++ ) {
            System.out.print (c );
        }
        System.out.println ("--------------------------" );
       char[] chars = Character.toChars ( 150_000 );// будет два char которіе кодируют один иероглиф п.ч. не влазит в один
       char[] chars1 = Character.toChars ( 800_000 );// еще нет символов для этого числа
       char[] chars2 = Character.toChars ( 1100_000 );// больше 1000000 уже Exception
        System.out.println (chars );




        testCodePoint(65);//один char     char[] = [A]
        testCodePoint(10_000);//один char     char[] = [символ карандаша]
        testCodePoint(50_000);//один char     char[] = [какой-то знак]
        testCodePoint(165_536);//тут уже номер иероглифа(больше размера char = 65535) не влазит в один char,
        // получается 2 char, хотя codePoint один. Поєтому ввели функцию codePointCount, п. ч. length () показывает 2(количество char)
    }

    private static void testCodePoint ( int codePoint ) {

        char[] charArray = Character.toChars ( codePoint );
        System.out.println ("char[]: " + Arrays.toString ( charArray) );
        String str = new String(charArray);
        System.out.println ("String: " + str);
        System.out.println ("String.length: " + str.length ());
        System.out.println ("String.codePointCount: " + str.codePointCount (0,str.length ()));
        System.out.println ( );
    }


}
