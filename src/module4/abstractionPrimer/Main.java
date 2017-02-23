package module4.abstractionPrimer;

/**
 * Created by User on 13.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        A obj1;// объявление переменной ob1 как ссылки, на объект класса A не запрещено
        //A obj1 = new A();//error - abstract class cannot be instantiated
        B obj2 = new B(); // будет вызван конструктов по умолчанию из A
        obj2.print();
        //obj1 = obj2;//автоматическое приведение; obj1 тоже становится класса В
        obj1 = (A)obj2;//явное приведение; obj1 при дебагге класса В, но функции можно візівать только из А
        ((A)obj2).print(); // (=obj1.print();)    т.к.  мы привели obj2 к типу А, то можем воспользоваться
        // только методами класса А (print)
        //((A)obj2).printB(); //т.к.  мы привели obj2 к типу А, то можем воспользоваться только методами класса А (print)
        //а обращение к методу класса В (printB) выдаст ошибку

    }
}
