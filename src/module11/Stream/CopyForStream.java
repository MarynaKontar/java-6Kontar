package module11.Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by User on 27.04.2017.
 */
public class CopyForStream {
    public static void main ( String[] args ) throws IOException {

//InputStream src = new URL ("http://google.com").openStream (); // берет поток с сайта
        InputStream src = new URL ( "http://dom2.ru" ).openStream ( );
        InputStream src1 = new URL ( "http://dom2.ru" ).openStream ( );

//OutputStream dst = new FileOutputStream ( "D:/JavaGoIT/JavaCore/Модуль11/COOGLE.txt" );// создает stream ввода в файл
        OutputStream dst = new FileOutputStream ( "D:/JavaGoIT/JavaCore/Модуль11/dom2.txt" );

        copy ( src, dst );// скопирует по одному байту с src (cайт) в dst(файл)
        copy ( src1, System.out );// -//-//- в консоль
        //Поток один раз использовали и все. src я не могу сначала в dom2.txt записать, а потом на консоль вывести.
        // Для этого надо еще один поток создать (src1)

    }

    public static void copy ( InputStream src, OutputStream dst ) throws IOException {
//        while (true) {
//            int data = src.read ( );//копирует один байт
//            if (data != -1) {
//                dst.write ( data );// пишет один байт
//            } else {
//                return;
//            }
//        }

        //чтобы не читать/писать по оодному байту(каждій раз обращаясь к винчестеру), используют буффер
        byte[] buff = new byte[64 * 1024]; //2 в 16 степени, 64k байта
        while (true) {
        int count = src.read (buff);//!!!!!вернет не данные, а количество прочитанных байт
        if (count  != -1) {
            dst.write ( buff, 0, count );//либо все записал (байты от 0 до count (все)) или кидает exception (и ничего не передалось)
        } else {
            return;
        }
    }
    }
}

