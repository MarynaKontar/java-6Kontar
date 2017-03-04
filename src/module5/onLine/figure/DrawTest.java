package module5.onLine.figure;

/**
 * Polimorphizm
 */
public class DrawTest {

    public static double sq(Figure figure){     //НАРУШЕНИЕ ПРИНЦИПА БАРБАРЫ ЛИСКЕ, Т. Е. МЕТОД ДОЖН ВЕГДА ВДАВАТЬ ТО, ЧТО ОЖИДАЕТСЯ
        //а этот метод может выдать и 0
        if (figure instanceof Square)  {
        return figure.square();
        }
        return 0;
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[2];
        figures[0] = new Parallelogram(1, 1);
        figures[1] = new Square( 5);

        Object[] figures2 = new Object[2];
        figures2[0] = new Parallelogram(1, 1);
        figures2[1] = new Square( 5);

//        for (Figure figure : figures) {
//            figure.draw(figure.square());
//        }

        System.out.println(new Square(10));

        System.out.println(sq(new Parallelogram(10, 1)));//НАРУШЕНИЕ ПРИНЦИПА БАРБАРЫ ЛИСКЕ, Т. Е. МЕТОД ДОЛЖЕН ВЕГДА ВДАВАТЬ ТО, ЧТО ОЖИДАЕТСЯ
        //а sq выдает в этом случае 0
    }
}
