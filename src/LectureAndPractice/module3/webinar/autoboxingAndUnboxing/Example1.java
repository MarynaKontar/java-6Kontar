package LectureAndPractice.module3.webinar.autoboxingAndUnboxing;


public class Example1 {
    static class Pen {
        void write() {
            System.out.println("Write something");
        }
    }

    static class GelPen extends Pen{
        @Override
        void write() {
            System.out.println("GelPen");;
        }
    }
    static class InkPen extends Pen{
        @Override
        void write() {
            System.out.println("InkPen");;
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        //AUTOBOXING
        //приведение типа к классу обертки
        for (int i = 0; i < 10; i += 2)
            array[i] = i;

        // array[i] = Integer.valueOf(i);
        //int i -> Integer i

        int i = 150;
        Integer v1 = Integer.valueOf(i);
        Integer v2 = Integer.valueOf(i);
        System.out.println(v1 == v2);// true (-127   128); false все остальное

        i = v1.intValue();
        //64bits
        long a = 10;
//        Long b =10;//Нельзя
        Long b = 10L;
        if (a == b) {
            System.out.println("Hello");//выведет п.ч.  это a=b.longValue()
            // т.е. если есть хоть один примитив, то объект преобразуется в приметив
        }


//        long aa = 10;
//        Long bb = null;
//        if (aa == bb) {
//            System.out.println("Hello");//!!!!!!! будет nullPointerExeption  надо посмотреть что будет
//            //когда нул попадает через конструктор 26 минута модуля 4
//            //если используем обертки, то не надо использовать примитивы
//            //        }
//        }
        Pen pen = new Pen();
        pen.write();
        Pen gelPen = new GelPen();
        gelPen.write();
        Pen inkPen = new InkPen();
        inkPen.write();


    }
}

