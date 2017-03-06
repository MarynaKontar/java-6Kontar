package module6;

import java.util.stream.IntStream;

/**
 * Created by User on 03.03.2017.
 * Make sure nobody can inherit your ArraysUtils.
 */
public class ArraysUtils {

//    sum(int array[]){}
//    min(int array[]){}
//    max(int array[]){}
//    maxPositive(int array[]){}
//    multiplication  (int array[]){}
//    modulus(int array[]){}
//    secondLargest(int array[]){}


    /**
     * return sum of integer array elements
     * This method does not work correctly when sum is outside the range - 2147483647 :  2147483647
     *
     * @param array
     * @return
     */
//   static int sum(int[] array) {
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            summ += array[i];
//        }
//        return summ;
//    }

    static private int k;
    static int sum(int[] array) {
        int indexToBegin = array.length - k - 1;

        if (indexToBegin == 0)
            return array[indexToBegin];
        else {
            k = k + 1;
            return array[indexToBegin] + sum(array);
        }
    }
// TODO 1. Я написала метод sum в разніх вариантах: 1.просто через цикл, 2.с помощью рекурсии
// и в Main использовала третий вариант 3. IntStream.of(rndIntArray).parallel().sum().
    //метод sum с рекурсией при массиве длиной 100000 выдал ошибку java.lang.StackOverflowError
//при массиве длиной 100000000 - все методы выдали Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //



    /**
     * return minimum element of integer array
     *
     * @param array
     * @return
     */
    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    /**
     * return maximum element of integer array
     *
     * @param array
     * @return
     */
    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * method return max positive element of int array
     * if there is no positive elements return -1
     *
     * @param array
     * @return
     */
    int maxPositive(int[] array) {
        int maxPos = max(array);
        if (maxPos < 0) maxPos = -1;
        return maxPos;
    }

    /**
     * method return multiplication of integer array elements
     * This method does not work correctly when multiplication
     * is outside the range - 2147483647 :  2147483647
     * If we know that there are a lot of elements in array
     * or there are big values, change int multiplication to long multiplication
     * or overload this method for all cases (small values - int, big values/number_of_elements - long)
     */
    private static double multiplication(double[] randomArray, int indexToBegin) {

        if (indexToBegin == 0) {
            return randomArray[indexToBegin];
        }
        return randomArray[indexToBegin] * multiplication(randomArray, indexToBegin - 1);
//        return Math.multiplyExact(randomArray[indexToBegin], multiplication(randomArray, indexToBegin - 1));
    }
}


