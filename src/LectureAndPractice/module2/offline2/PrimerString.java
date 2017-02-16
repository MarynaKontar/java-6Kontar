package LectureAndPractice.module2.offline2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 02.02.2017.
 */
public class PrimerString {
    public static void main(String[] args) {
        String[] names = {"Vasya", "Kolya", "Petya","Vasya2", "Kolya2", "Petya2","Vasya3", "Kolya3", "Petya3", "Nastya"};

        
        //чаще всего ипользуется StringBuilder (StringBuffer при многопоточности; StringBuilder быстрее StringBuffer)
        // + только когда нмного строк складыается, иначе они будут слишком жрать память, п. ч. при "uy" + "fgtr"
        // создается аж три строки, а если это все в  for, то ужас сколько памяти
        // StringBuilder работает внутри с char
        StringBuilder sb = new StringBuilder("");
        for (String execName : names) {

            sb.append(execName).append(",");

        }

        System.out.println(sb.toString());


        //WHAT IS HASH CODE
        System.out.println(names.hashCode());
        System.out.println(sb.hashCode());

        List<String> list = Arrays.asList("pollinating sandboxes",
                "amusement & hemophilias",
                "schoolworks = perversive",
                "electrolysissweeteners.net",
                "constitutionalunstableness.net",
                "grinnerslaphappier.org",
                "BLEACHINGFEMININELY.NET",
                "WWW.BUMRACEGOERS.ORG",
                "WWW.RACCOONPRUDENTIALS.NET",
                "Microcomputers: the unredeemed lollipop...",
                "Incentively, my dear, I don't tessellate a derangement.",
                "A person who never yodelled an apology, never preened vocalizing transsexuals.");
        for (String s : list) {
            System.out.println(s.hashCode());
        }
        System.out.println(list.hashCode());
    }
}
