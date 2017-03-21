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
        long startTime;
        long endTime;

        long[] integerArrayList1000 = new long[4];
        integerArrayList1000 = timeExecutionInteger ( integerArrayList, NUMBER_OF_ELEMENTS1000 );
        System.out.println (Arrays.deepToString ( integerArrayList1000 ));
        long[] integerLinkedList1000 = timeExecutionInteger ( integerLinkedList, NUMBER_OF_ELEMENTS1000 );
        System.out.println (integerLinkedList1000);
        long[] integerArrayList10000 = timeExecutionInteger ( integerArrayList, NUMBER_OF_ELEMENTS10000 );
        System.out.println (integerArrayList10000);
        long[] integerLinkedList10000 = timeExecutionInteger ( integerLinkedList, NUMBER_OF_ELEMENTS10000 );
        System.out.println (integerLinkedList10000);

        long[] stringArrayList1000 = timeExecutionInteger ( integerArrayList, NUMBER_OF_ELEMENTS1000 );
        long[] stringLinkedList1000 = timeExecutionInteger ( integerLinkedList, NUMBER_OF_ELEMENTS1000 );
        long[] stringArrayList10000 = timeExecutionInteger ( integerArrayList, NUMBER_OF_ELEMENTS10000 );
        long[] stringLinkedList10000 = timeExecutionInteger ( integerLinkedList, NUMBER_OF_ELEMENTS10000 );

    }

    private static long[] timeExecutionInteger ( List <Integer> list, int numberOfElements ) {
        long startTime;
        long endTime;
        long[] time = new long[ 4 ];
        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.add ( list.size ( ) / 2, i ); //new Integer(i)
        }
        endTime = currentTimeMillis ( );
        time[ 0 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.set ( list.size ( ) / 2, i ); //new Integer(i)
        }
        endTime = currentTimeMillis ( );
        time[ 1 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.get ( list.size ( ) / 2 ); //new Integer(i)
        }
        endTime = currentTimeMillis ( );
        time[ 2 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( Iterator<Integer> iterator = list.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        endTime = currentTimeMillis ( );
        time[ 3 ] = endTime - startTime;
        System.out.println (Arrays.deepToString ( time ) );
        return time;
    }


    private static long[] timeExecutionString ( List <String> list, int numberOfElements ) {
        long startTime;
        long endTime;
        long[] time = new long[ 4 ];
        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.add ( list.size ( ) / 2, "" + i ); //new Integer(i)
        }
        endTime = currentTimeMillis ( );
        time[ 0 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.set ( list.size ( ) / 2, "" + i ); //new Integer(i)
        }
        endTime = currentTimeMillis ( );
        time[ 1 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( int i = 0; i < numberOfElements; i++ ) {
            list.get ( list.size ( ) / 2 ); //new Integer(i)
        }
        endTime = currentTimeMillis ( );
        time[ 2 ] = endTime - startTime;

        startTime = currentTimeMillis ( );
        for ( Iterator<String> iterator = list.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        endTime = currentTimeMillis ( );
        time[ 3 ] = endTime - startTime;
        return time;
    }
}
