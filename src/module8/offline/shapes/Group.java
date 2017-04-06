package module8.offline.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by citsym on 09.03.17.
 */
public class Group extends ArrayList<Shape> {

    private List <Shape> list = new ArrayList <> ( );


//    public int size () {
//        return list.size ( );
//    }
//
//    public boolean isEmpty () {
//        return list.isEmpty ( );
//    }
//
//    public void add ( Shape shape ) {
//        list.add ( shape );
//    }
//
//    public boolean remove ( Shape shape ) {
//        return list.remove ( shape );
//    }
//
//    public Shape remove ( int indx ) {
//        return list.remove ( indx );
//    }
//
//    public boolean addAll ( Group group ) {
//       return list.addAll ( (Collection)group);
//       //TODO как реализовать? сейчас ошибка
//    }
//
//    public void clear () {
//        list.removeAll ( list );
//    }
//
//    public Shape get ( int index ) {
//        Shape shape = list.get(index);
//        return shape;
//    }
//
//    public boolean removeAll ( Collection c ) {
//        return list.removeAll ( c );
//    }
//


    public double getSumAreas () {
        double sum = 0;
        for ( Shape shape : list ) {
            sum += shape.getArea ( );
        }
        return sum;
        //return list.stream().mapToDouble (  )reduce(0, (x, y) -> x.getArea () + y.getArea ());
    }

    public double getMaxArea(){
        double maxArea = 0;
        for ( Shape shape : list ) {
            if (shape.getArea () > maxArea)
                maxArea = shape.getArea ();
        }
        return maxArea;
    }


    public double getMinArea(){
        if (list.isEmpty ()) return 0.0;
        Iterator<Shape> iterator = list.iterator ();
        double minArea = iterator.next ().getArea ();
        for ( Shape shape : list ) {
            if (shape.getArea () < minArea)
                minArea = shape.getArea ();
        }
        return minArea;
    }


    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ( "{" );
        sb.append ( "dsfg" ).append ( list.toString () );
        sb.append ( '}' );
        return sb.toString ( );
    }


}
