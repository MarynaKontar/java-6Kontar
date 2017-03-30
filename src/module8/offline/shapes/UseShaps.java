package module8.offline.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by citsym on 09.03.17.
 */
public class UseShaps {

    public static void main(String[] args) {


        Group listShape = new Group ();

        Rectangle toRemove = new Rectangle(6, 4);

        listShape.add(new Rectangle(6, 4));
        listShape.add(new Rectangle(2, 8 ));
        listShape.add(new Rectangle(1, 6 ));
        listShape.add(new Square(10 ));
        listShape.add(new Square(20 ));
        listShape.add(new Circle(15 ));
        listShape.add(new Circle(15 ));
        listShape.add(new Circle(15 ));
        listShape.add(new Circle(15 ));
        listShape.add(new Circle(15 ));
        listShape.remove(new Circle(15));
        listShape.remove(toRemove);

        System.out.println (listShape );

        // If equals overriden
        while (listShape.remove(new Circle(15)) == true){

        }

//TODO прописать итератор для Group?
        // If not equals overriden
//        Iterator<Shape> iter =  listShape.iterator();
//
//        while (iter.hasNext()){
//           Shape shape =  iter.next();
//            if (shape instanceof Circle){
//                if (((Circle) shape).getRadius() == 15 ){
//                    iter.remove();
//                }
//            }
//        }


        listShape.remove(0);

//        areaOutput(listShape);

        System.out.println (listShape );


        Group listToRemove = new Group ( );
        listToRemove.add (new Square(10 )  );
        listToRemove.add (new Square(30 )  );
//        listShape.removeAll ( listToRemove );
        System.out.println (listShape );

//        listShape.addAll ( listToRemove );
//        System.out.println (listShape );

        System.out.println (listShape.getMaxArea ());
        System.out.println (listShape.getMinArea ());
        System.out.println (listShape.getSumAreas ());
    }


    private static void areaOutput(List<Shape> listShape) {
        for (Shape shape : listShape) {
            System.out.println(shape.getArea());
        }
    }
}
