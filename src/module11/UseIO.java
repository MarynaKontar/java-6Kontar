package module11;

import LectureAndPractice.module3.webinar.Car;

import java.io.*;

/**
 * Created by User on 26.04.2017.
 */
public class UseIO {
    public static void main ( String[] args ) throws IOException {

//        OutputStream out = new FileOutputStream ( "test1.txt" );
//        InputStream in = System.in;
//        int byteValue1;
////       int byteValue;
//        while ((byteValue1 = in.read ( )) != -1) {
////            System.out.println (byteValue );
////            System.out.println ((char)byteValue );
//            out.write ( byteValue1 );
//            if ((char) byteValue1 == 'q') {
//                break;
//            }
//        }
//        out.close ();
//        in.close ();
//

//        InputStream inputFromFile = new FileInputStream ( "test1.txt" );
//        int byteValue2;
//        while ((byteValue2 = inputFromFile.read ( )) != -1) {
//            System.out.print ( (char) byteValue2 );
//        }


//        FileReader fileReader = new FileReader ( "test1.txt" );
//        int byteValue2;
//        while ((byteValue2 = fileReader.read ( )) != -1) {
//            System.out.print ( (char) byteValue2 );
//        }

//console read/write symbols not byte
//        InputStreamReader  inputStreamReader  = new InputStreamReader ( System.in );
//        int byteValue2;
//        while ((byteValue2 = inputStreamReader.read ( )) != -1) {
//            System.out.print ( (char) byteValue2 );
//        }




//
//        try(BufferedWriter bufferedWriter = new BufferedWriter ( new OutputStreamWriter ( new FileOutputStream ( "test1.txt" ) ) );
//        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );){
//
//        String line = br.readLine ( );
//        while (!line.equals ( "exit" )) {
//            System.out.println ( line );
//
//            bufferedWriter.write ( line );
//            bufferedWriter.newLine ( );
////            bufferedWriter.flush ();// не надо писать, если try with resources используется
//
//            line = br.readLine ( );
//        }
////        bufferedWriter.close ();//закрывает поток    // не надо писать, если try with resources используется
//        // вызовет обязательно  bufferedWriter.flush ().
//    }


   try( RandomAccessFile fileProcessor = new RandomAccessFile ( "test1.txt", "rw");){
//        fileProcessor.writeUTF ( "вот моя первая строка в файле" );
       fileProcessor.write ( "вот моя первая строка в файле" .getBytes ());
        fileProcessor.write ( 10 );//перевод строки
        fileProcessor.write ( "вот моя вторая строка в файле" .getBytes ());
        fileProcessor.seek ( 0 );//перемещаем курсор куда будем читать/писать и перезатерли
       fileProcessor.write ( "вот моя третья строка в файле" .getBytes ());
//фраза на русском сильно затирает текст на английском, п. ч. русские занимают 2 байта
       fileProcessor.seek ( 0 );
       System.out.println ( fileProcessor.readUTF ());
   }




    }
}
