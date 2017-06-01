package EEMinovTasks;

/**
 * Created by User on 30.05.2017.
 */
public class binarySearch {

    public int binarySearch(int[] array, int value){
        int low = 0;
        int top = array.length - 1;

        int middle = low + top >>> 1;


        while(low != top) {
            if (value < array[ middle ])
                top = middle - 1;
            else if (value > array[ middle ])
                low = middle + 1;
            else return middle;
        }
        return -1;
    }
}






/*  public static int binarySearch(int[] a, int fromIndex, int toIndex,
                                   int key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
    */