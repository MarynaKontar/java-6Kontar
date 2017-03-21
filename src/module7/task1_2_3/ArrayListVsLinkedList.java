package module7.task1_2_3;

import java.util.*;

import static java.lang.System.currentTimeMillis;

/**
 * Java#6
 * Module 7 Task 4
 * Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution
 * of the following methods and print it to console:
 * - add
 * - set
 * - get
 * - remove
 *
 * @author Kontar Maryna
 */
public class ArrayListVsLinkedList {
    public static void main ( String[] args ) {
        List <Integer> integerArrayList = new ArrayList <> ( );
        List <Integer> integerLinkedList = new LinkedList <> ( );
        List <String> stringArrayList = new ArrayList <> ( );
        List <String> stringLinkedList = new LinkedList <> ( );
        final int NUMBER_OF_ELEMENTS1000 = 1000;
        final int NUMBER_OF_ELEMENTS10000 = 10000;


        System.out.println ("Time (in  milliseconds) of execution of the add, set, get and remove from the HEAD of the list:" );
        System.out.println ( "\tInteger" );
        long[] integerArrayList1000 = timeExecutionInteger ( integerArrayList, NUMBER_OF_ELEMENTS1000 );
        System.out.println ( "ArrayList1000: " + Arrays.toString ( integerArrayList1000 ) );
        long[] integerLinkedList1000 = timeExecutionInteger ( integerLinkedList, NUMBER_OF_ELEMENTS1000 );
        System.out.println ( "LinkedList1000: " + Arrays.toString ( integerLinkedList1000 ) );
        long[] integerArrayList10000 = timeExecutionInteger ( integerArrayList, NUMBER_OF_ELEMENTS10000 );
        System.out.println ( "ArrayList10000: " + Arrays.toString ( integerArrayList10000 ) );
        long[] integerLinkedList10000 = timeExecutionInteger ( integerLinkedList, NUMBER_OF_ELEMENTS10000 );
        System.out.println ( "LinkedList10000: " + Arrays.toString ( integerLinkedList10000 ) );

        System.out.println ( "\tString" );
        long[] stringArrayList1000 = timeExecutionString ( stringArrayList, NUMBER_OF_ELEMENTS1000 );
        System.out.println ( "ArrayList1000: " + Arrays.toString ( stringArrayList1000 ) );
        long[] stringLinkedList1000 = timeExecutionString ( stringLinkedList, NUMBER_OF_ELEMENTS1000 );
        System.out.println ( "LinkedList1000: " + Arrays.toString ( stringLinkedList1000 ) );
        long[] stringArrayList10000 = timeExecutionString ( stringArrayList, NUMBER_OF_ELEMENTS10000 );
        System.out.println ( "ArrayList10000: " + Arrays.toString ( stringArrayList10000 ) );
        long[] stringLinkedList10000 = timeExecutionString ( stringLinkedList, NUMBER_OF_ELEMENTS10000 );
        System.out.println ( "LinkedList10000: " + Arrays.toString ( stringLinkedList10000 ) );
    }

    private static long[] timeExecutionInteger ( List <Integer> list, int numberOfElements ) {
        long startTime;
        long endTime;
        long[] time = new long[ 4 ];
        startTime = currentTimeMillis ( );

        for ( int i = 0; i < numberOfElements; i++ ) {
            //add into the middle of the list
//            list.add ( list.size ( ) / 2, new Integer ( i ) );
            //list.add(list.size()/2, i);

            //add to the end of the list
//             list.add (new Integer(i));
            // list.add (i);

            //add to the front of the list
            list.add(0, new Integer(i));
            // list.add(0, i);

        }
        endTime = currentTimeMillis ( );
        time[ 0 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.set (0, i );
        }
        endTime = currentTimeMillis ( );
        time[ 1 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.get (0);
        }
        endTime = currentTimeMillis ( );
        time[ 2 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < list.size ( ); i++ ) {
            //remove from the middle of the list
            //list.remove (list.size() / 2 - 1);

            //remove from the end of the list
//            list.remove (list.size()-1);

            //remove from the head of the list
            list.remove (0);
        }
//        for ( Iterator <Integer> iterator = list.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
        endTime = currentTimeMillis ( );
        time[ 3 ] = endTime - startTime;
        return time;
    }


    private static long[] timeExecutionString ( List <String> list, int numberOfElements ) {
        long startTime;
        long endTime;
        long[] time = new long[ 4 ];
        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {

            //add into the middle of the list
//            list.add ( list.size ( ) / 2, new String ( "" + i ) );
            //list.add ( list.size ( ) / 2, "" + i );;

            //add to the end of the list
//             list.add (new String ( "" + i ));
            // list.add ("" + i);

            //add to the front of the list
            list.add(0, new String ( "" + i ));
            // list.add(0, "" + i);
        }
        endTime = currentTimeMillis ( );
        time[ 0 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.set (0, "" + i );
        }
        endTime = currentTimeMillis ( );
        time[ 1 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.get ( 0 );
        }
        endTime = currentTimeMillis ( );
        time[ 2 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < list.size ( ); i++ ) {
            //remove from the middle of the list
            //list.remove (list.size() / 2 - 1);

            //remove from the end of the list
//            list.remove (list.size()-1);

            //remove from the head of the list
            list.remove (0);
        }
//        for ( Iterator <String> iterator = list.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
        endTime = currentTimeMillis ( );
        time[ 3 ] = endTime - startTime;
        return time;
    }
}



/**
 *Time (in  milliseconds) of execution of the add, set, get and remove in the MIDDLE of the list:
    Integer
 ArrayList1000: [1, 0, 0, 1]
 LinkedList1000: [13, 2, 1, 1]
 ArrayList10000: [17, 14, 2, 12]
 LinkedList10000: [111, 305, 218, 149]
    String
 ArrayList1000: [1, 1, 0, 0]
 LinkedList1000: [3, 32, 11, 0]
 ArrayList10000: [53, 3, 1, 7]
 LinkedList10000: [658, 1163, 763, 259]


 Time (in  milliseconds) of execution of the add, set, get and remove in the END of the list:
 Integer
 ArrayList1000: [1, 0, 3, 1]
 LinkedList1000: [0, 1, 0, 0]
 ArrayList10000: [4, 5, 2, 2]
 LinkedList10000: [1, 3, 0, 0]
 String
 ArrayList1000: [2, 1, 0, 0]
 LinkedList1000: [1, 0, 0, 0]
 ArrayList10000: [10, 3, 1, 1]
 LinkedList10000: [3, 6, 0, 0]


 !!!!!!!!!!!!Make for NUMBER_OF_ELEMENTS1000 = 10000 and NUMBER_OF_ELEMENTS10000 = 100000 for clarity
 Time (in  milliseconds) of execution of the add, set, get and remove from the HEAD of the list:
 Integer
 ArrayList1000: [28, 2, 1, 34]
 LinkedList1000: [3, 2, 3, 1]
 ArrayList10000: [2271, 0, 10, 1236]
 LinkedList10000: [10, 10, 0, 0]
 String
 ArrayList1000: [20, 12, 0, 10]
 LinkedList1000: [14, 2, 3, 1]
 ArrayList10000: [1672, 29, 1, 1431]
 LinkedList10000: [40, 36, 1, 0]

CONCLUSIONS:
 - use LinkedList when you want to add or remove elements in the front  of the list
 - use only ArrayList when you want to add, set, get and remove in the middle of the list
 - for other cases (and for small lists) it's doesn't matter what you use  ArrayList or LinkedList

 */