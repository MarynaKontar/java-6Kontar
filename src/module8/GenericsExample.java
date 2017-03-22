package module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 22.03.2017.
 * http://www.quizful.net/post/java-generics-tutorial
 */
public class GenericsExample {
    public static void main ( String[] args ) {

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