package module7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by User on 15.03.2017.
 */
public class ArrayListVsLinkedListTime {
    public static void main ( String[] args ) {
        final int count = 100000;

        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        for ( int i = 0 ; i < count ; i++ ) {
            arrayList.add(new Object());
            linkedList.add(new Object());
        }

        ListIterator iterator;
        long start;

        iterator = arrayList.listIterator();
        start = System.currentTimeMillis();
        for ( int i = 0 ; i < count ; i++ ) {
            iterator.add(new Object());
            iterator.next();
        }
        System.out.println("ArrayList add : " + ( System.currentTimeMillis() - start ) + " ms" + arrayList.size ());

        iterator = linkedList.listIterator();
        start = System.currentTimeMillis();
        for ( int i = 0 ; i < count ; i++ ) {
            iterator.next();
            iterator.add(new Object());
        }
        System.out.println("LinkedList add: " + ( System.currentTimeMillis() - start ) + " ms");

        iterator = arrayList.listIterator();
        start = System.currentTimeMillis();
        for ( int i = 0 ; i < count ; i++ ) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("ArrayList remove : " + ( System.currentTimeMillis() - start ) + " ms");

        iterator = linkedList.listIterator();
        start = System.currentTimeMillis();
        for ( int i = 0 ; i < count ; i++ ) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("LinkedList remove: " + ( System.currentTimeMillis() - start ) + " ms");
    }
}
