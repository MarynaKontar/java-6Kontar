package module5.offLine.initializationOrder;
//import static net.mindview.util.Print.*;

/**
 * Created by User on 28.02.2017.
 */
public class InitializationOrder {

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}

//у меня другой вывод, п.ч. сделала отдельны классы и без статиков
//Beetle constructor
//    static Insect.x1 initialized
//i = 9, j = 0
//        Beetle.k initialized
//static Beetle.x2 initialized
//        k = 47
//        j = 39


//
//    Порядок инициализации таков:
//
//        Статические элементы родителя
//        Статические элементы наследника
//        Глобальные переменные родителя
//        Конструктор родителя
//        Глобальные переменные наследника
//        Конструктор наследника
//        Пример
//
//class Insect {
//    private int i = 9;                                                 [9]
//    protected int j;                                                   [10]
//    Insect() {                                                         [8]
//        print("i = " + i + ", j = " + j);                              [11]
//        j = 39;                                                        [12]
//    }
//    private static int x1 = printInit("static Insect.x1 initialized"); [2]
//    static int printInit(String s) {                                   [3]
//        print(s);
//        return 47;
//    }
//}
//
//public class Beetle extends Insect {
//    private int k = printInit("Beetle.k initialized");                 [13]
//    public Beetle() {                                                  [7]
//        print("k = " + k);                                             [14]
//        print("j = " + j);                                             [15]
//    }
//    private static int x2 = printInit("static Beetle.x2 initialized"); [4]
//    public static void main(String[] args) {                           [1]
//        print("Beetle constructor");                                   [5]
//        Beetle b = new Beetle();                                       [6]
//    }
//}
