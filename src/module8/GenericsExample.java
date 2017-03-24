package module8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 22.03.2017.
 * http://www.quizful.net/post/java-generics-tutorial
 */
public class GenericsExample {
    public static void main ( String[] args ) {

        List rawList;// сырой тип НЕ ИСПОЛЬЗОВАТЬ. ОСТАЛСЯ ТОЛЬКО ДЛЯ СОВМЕСТИМОСТИ С РАННИМИ ВЕРСИЯМИ JAVA(ДО 1.5)

        List<String> list1 = new ArrayList<> (  );
        rawList = list1;
        rawList.add(8);//добаваляю в rawList что хочу(а не только String), ошибки нет (потому что он "сырой", без дженериков (<>))
        rawList.add("aesdf");
        rawList.add("aedffgsdf");
        rawList.add("aedffggfgsdf");
        rawList.add(0.45);
        //String s = list1.get ( 0 );//ОШИБКА В РАНТАЙМ, НЕ ВО ВРЕМЯ КОМПИЛЯЦИИ
        //В рантайм вся информация о дженериках СТИРАЕТСЯ


        printList ( rawList );//выведет все, и int и String


        //list1.add(56);//ошибка компиляции - int в String не разрешает добавлять, так как list1 записан через дженерики



        //Wildcards (Маски)   <?>
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);// так можно использовать маску (см. метод printList)
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);


        List <?> intList = new ArrayList <Integer> ( );
//        intList.add ( 10 );  // а так нельзя
    }

    static void printList ( List <?> list ) {
        for ( Object l : list )
            System.out.println ( "{" + l + "}" );
    }
}