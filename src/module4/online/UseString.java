package module4.online;

/**
 * Created by User on 14.02.2017.
 */
public class UseString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2); //true потому что стринговый  кеш
        String s3 = new String("hello");// false s1==s3 потому что разные объекты
    }
}
