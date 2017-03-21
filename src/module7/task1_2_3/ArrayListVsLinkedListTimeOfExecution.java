package module7.task1_2_3;

import java.util.*;

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
public class ArrayListVsLinkedListTimeOfExecution {
    public static void main ( String[] args ) {
        List <Integer> integerArrayList = new ArrayList <> ( );
        List <Integer> integerLinkedList = new LinkedList <> ( );
        List <String> stringArrayList = new ArrayList <> ( );
        List <String> stringLinkedList = new LinkedList <> ( );
        final int NUMBER_OF_ELEMENTS1000 = 1000;
        final int NUMBER_OF_ELEMENTS10000 = 10000;
        long time;

        long[][] arrayListTime = new long[ 4 ][ 4 ];
        long[][] linkedListTime = new long[ 4 ][ 4 ];

//        System.out.println ("Time, µs" );
//        System.out.println ( "\t\t\t\tInteger 1000\t\t\t String1000\t\t\t\t " + "Integer 10000\t\t\t\t String10000\t " );
//
//        //      ArrayList:
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            integerArrayList.add ( i ); //new Integer(i)
//        }
//        arrayListTime[ 0 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            integerArrayList.set ( i, i ); //new Integer(i)
//        }
//        arrayListTime[ 0 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            integerArrayList.get ( i );
//        }
//        arrayListTime[ 0 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( Iterator <Integer> iterator = integerArrayList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        arrayListTime[ 0 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            stringArrayList.add ( "" + i );
//        }
//        arrayListTime[ 1 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            stringArrayList.set ( i, "" + i );
//        }
//        arrayListTime[ 1 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            stringArrayList.get ( i );
//        }
//        arrayListTime[ 1 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( Iterator <String> iterator = stringArrayList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        arrayListTime[ 1 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            integerArrayList.add ( i ); //new Integer(i)
//        }
//        arrayListTime[ 2 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            integerArrayList.set ( i, i ); //new Integer(i)
//        }
//        arrayListTime[ 2 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            integerArrayList.get ( i );
//        }
//        arrayListTime[ 2 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( Iterator <Integer> iterator = integerArrayList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        arrayListTime[ 2 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            stringArrayList.add ( "" + i );
//        }
//        arrayListTime[ 3 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            stringArrayList.set ( i, "" + i );
//        }
//        arrayListTime[ 3 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            stringArrayList.get ( i );
//        }
//        arrayListTime[ 3 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( Iterator <String> iterator = stringArrayList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        arrayListTime[ 3 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//        System.out.println ( "ArrayList:  " + Arrays.deepToString ( arrayListTime ) );
//
//
////      LinkedList:
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            integerLinkedList.add ( i ); //new Integer(i)
//        }
//        linkedListTime[ 0 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            integerLinkedList.set ( i, i ); //new Integer(i)
//        }
//        linkedListTime[ 0 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            integerLinkedList.get ( i );
//        }
//        linkedListTime[ 0 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( Iterator <Integer> iterator = integerLinkedList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        linkedListTime[ 0 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            stringLinkedList.add ( "" + i );
//        }
//        linkedListTime[ 1 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            stringLinkedList.set ( i, "" + i );
//        }
//        linkedListTime[ 1 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
//            stringLinkedList.get ( i );
//        }
//        linkedListTime[ 1 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( Iterator <String> iterator = stringLinkedList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        linkedListTime[ 1 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            integerLinkedList.add ( i ); //new Integer(i)
//        }
//        linkedListTime[ 2 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            integerLinkedList.set ( i, i ); //new Integer(i)
//        }
//        linkedListTime[ 2 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            integerLinkedList.get ( i );
//        }
//        linkedListTime[ 2 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( Iterator <Integer> iterator = integerLinkedList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        linkedListTime[ 2 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            stringLinkedList.add ( "" + i );
//        }
//        linkedListTime[ 3 ][ 0 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            stringLinkedList.set ( i, "" + i );
//        }
//        linkedListTime[ 3 ][ 1 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
//            stringLinkedList.get ( i );
//        }
//        linkedListTime[ 3 ][ 2 ] = (System.nanoTime ( ) - time) / 1000;
//
//
//        time = System.nanoTime ( );
//        for ( Iterator <String> iterator = stringLinkedList.iterator ( ); iterator.hasNext ( ); ) {
//            iterator.next ( );
//            iterator.remove ( );
//        }
//        linkedListTime[ 3 ][ 3 ] = (System.nanoTime ( ) - time) / 1000;
//
//        System.out.println ( "LinkedList:" + Arrays.deepToString ( linkedListTime ) );
//        System.out.println ( "\t\t\t add, set, get, remove\t add, set, get,remove\tadd,  set,  get, remove\t   add,  set,  get,  remove\t" );
//
//
//
//



        System.out.println ( "ArrayList of Integers (1000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            integerArrayList.add ( i ); //new Integer(i)
        }
        System.out.println ("Add " + NUMBER_OF_ELEMENTS1000 + " elements to the end of ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            integerArrayList.set ( i, i ); //new Integer(i)
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS1000 + " elements to the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            integerArrayList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS1000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( Iterator <Integer> iterator = integerArrayList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ("Remove " + NUMBER_OF_ELEMENTS1000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        System.out.println ( "ArrayList of Strings (1000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            stringArrayList.add ( "" + i );
        }
        System.out.println ("Add " + NUMBER_OF_ELEMENTS1000 + " elements to the end of ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            stringArrayList.set ( i, "" + i );
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS1000 + " elements to the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            stringArrayList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS1000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( Iterator <String> iterator = stringArrayList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ("Remove " + NUMBER_OF_ELEMENTS1000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );


        System.out.println ( "ArrayList of Integers (10000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            integerArrayList.add ( i ); //new Integer(i)
        }
        System.out.println ("Add " + NUMBER_OF_ELEMENTS10000 + " elements to the end of ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            integerArrayList.set ( i, i ); //new Integer(i)
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS10000 + " elements to the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            integerArrayList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS10000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( Iterator <Integer> iterator = integerArrayList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ("Remove " + NUMBER_OF_ELEMENTS10000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );


        System.out.println ( "ArrayList of Strings (10000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            stringArrayList.add ( "" + i );
        }
        System.out.println ("Add " + NUMBER_OF_ELEMENTS10000 + " elements to the end of ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            stringArrayList.set ( i, "" + i );
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS10000 + " elements to the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            stringArrayList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS10000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( Iterator <String> iterator = stringArrayList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ("Remove " + NUMBER_OF_ELEMENTS10000 + " elements of the ArrayList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );


        System.out.println ( "LinkedList: " );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            integerLinkedList.add ( i ); //new Integer(i)
        }
        System.out.println ( "Add " + NUMBER_OF_ELEMENTS1000 + " elements to the end of LinkedList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            integerLinkedList.set ( i, i ); //new Integer(i)
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS1000 + " elements to the LinkedList: " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            integerLinkedList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS1000 + " elements of the " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );

        for ( Iterator <Integer> iterator = integerLinkedList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ( "Remove " + NUMBER_OF_ELEMENTS1000 + " elements of the " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        System.out.println ( "LinkedList of Strings (1000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            stringLinkedList.add ( "" + i );
        }
        System.out.println ( "Add " + NUMBER_OF_ELEMENTS1000 + " elements to the end of  " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            stringLinkedList.set ( i, "" + i );
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS1000 + " elements to the  " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS1000; i++ ) {
            stringLinkedList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS1000 + " elements of the  " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( Iterator <String> iterator = stringLinkedList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ( "Remove " + NUMBER_OF_ELEMENTS1000 + " elements of the " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        System.out.println ( "LinkedList of Integers (10000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            integerLinkedList.add ( i ); //new Integer(i)
        }
        System.out.println ( "Add " + NUMBER_OF_ELEMENTS10000 + " elements to the end of " +
                integerLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            integerLinkedList.set ( i, i ); //new Integer(i)
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS10000 + " elements to the " +
                integerLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            integerLinkedList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS10000 + " elements of the " +
                integerLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );

        for ( Iterator <Integer> iterator = integerLinkedList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ( "Remove " + NUMBER_OF_ELEMENTS10000 + " elements of the " +
                integerLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        System.out.println ( "LinkedList of Strings (10000 elements): " );
        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            stringLinkedList.add ( "" + i );
        }
        System.out.println ( "Add " + NUMBER_OF_ELEMENTS10000 + " elements to the end of " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            stringLinkedList.set ( i, "" + i );
        }
        System.out.println ( "Set " + NUMBER_OF_ELEMENTS10000 + " elements to the " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( int i = 0; i < NUMBER_OF_ELEMENTS10000; i++ ) {
            stringLinkedList.get ( i );
        }
        System.out.println ( "Get " + NUMBER_OF_ELEMENTS10000 + " elements of the " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

        time = System.nanoTime ( );
        for ( Iterator <String> iterator = stringLinkedList.iterator ( ); iterator.hasNext ( ); ) {
            iterator.next ( );
            iterator.remove ( );
        }
        System.out.println ("Remove " + NUMBER_OF_ELEMENTS10000 + " elements of the " +
                stringLinkedList.getClass().getSimpleName () + ": " +
                (System.nanoTime ( ) - time) / 1000 + " µs" );

    }
}



