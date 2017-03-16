package module6.task1;

import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Java#6
 * Module 6 Task 1
 * Class ArraysUtils must match the pattern “Utility class”:
 * - You cannot create an instance of this class
 * - All class methods are static
 * Make sure nobody can inherit your ArraysUtils.
 *
 * @author Kontar Maryna
 */

public final class ArraysUtils {

    private ArraysUtils() {
    }

    /**
     * return sum of integer array elements
     * This method does not work correctly when sum is outside the range - 2147483647 :  2147483647
     *
     * @param array
     * @return
     */
//   static int sum(int[] array) {
//        if(array == null) return -1;
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            summ += array[i];
//        }
//        return summ;
//    }

    static private int k;

    /**
     * TODO 1. не знаю как организовать рекурсию без внешнего от метода задания переменной к
     * или переделывания метода sum в виде sum(int[] array, int indexToBegin)
     * (тоже самое с multiplication)
     *
     * @param array
     * @return
     */
    public static int sum(int[] array) {
       //if(array == null) return -1;    //не знаю что возвращать в случае пустого массива -> возвращать -1
        int indexToBegin = array.length - k - 1;

        if (indexToBegin == 0)
            return array[indexToBegin];
        else {
            k = k + 1;
            return array[indexToBegin] + sum(array);
        }
    }
    // TODO 2. Я написала метод sum в разных вариантах: 1.просто через цикл, 2.с помощью рекурсии
    // и в UserMain использовала третий вариант 3.IntStream.of(integerArray).parallel().sum().
    //метод sum с рекурсией при массиве длиной 100000 выдал ошибку java.lang.StackOverflowError
    //при массиве длиной 100000000 - все методы выдали Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //где можно об этом(я так понимаю - куча и стек) почитать не сильно углубляясь в подробности,
    // чтобы начать потихоньку разбираться


    /**
     * return minimum element of integer array
     *
     * @param array
     * @return
     */
    public static int min(int[] array) {
       // if(array == null) return 0;    //не знаю что возвращать в случае пустого массива
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
    public static int max(int[] array) {
        //if(array == null) return 0;    //не знаю что возвращать в случае пустого массива
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
    public static int maxPositive(int[] array) {
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
//    public static int multiplication(int[] array) {
//        int multiplication = 1;
//        for (int i = 0; i < array.length; i++) {
//            multiplication *= array[i];
//        }
//        return multiplication;
//    }
    static private int n;
    public static int multiplication(int[] array) {
        //if(array == null) return 0;    //не знаю что возвращать в случае пустого массива
        int indexToBegin = array.length - n - 1;
        if (indexToBegin == 0) {
            return array[indexToBegin];
        } else {
            n = n + 1;
            return array[indexToBegin] * multiplication(array);
        }
//        return Math.multiplyExact(array[indexToBegin], multiplication(array, indexToBegin - 1));
    }

    /**
     * method returns two element array of first and last element modulus of integer array
     * if there is only one element in the array it returns [modulus, -1]
     *
     * @param array
     * @return
     */
    public static int[] modulus(int[] array) {
        int[] mod = new int[2];
        //if(array == null) return mod;    //не знаю что возвращать в случае пустого массива
        if (array.length == 1) {
            mod[0] = Math.abs(array[0]); //(array[0] >= 0) ? array[0] : -array[0];
            mod[1] = -1;
        } else {
            mod[0] = Math.abs(array[0]); //(array[0] >= 0) ? array[0] : -array[0];
            mod[1] = Math.abs(array[array.length - 1]);
            //(array[array.length - 1] >= 0) ? array[array.length - 1] : -array[array.length - 1];
        }
        return mod;
    }

    /**
     * method returns second largest element of integer array
     * if the matrix elements are equals or matrix has only one element
     * it returns -1
     */
    public static int secondLargest(int[] array) {
        //if(array == null) return 0;    //не знаю что возвращать в случае пустого массива
        int largest, secondLargest;
        if (array.length == 1) {
            secondLargest = -1;
        } else {                        //array.length > 1
            secondLargest = array[0];
            largest = array[1];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > largest) {
                    secondLargest = largest;
                    largest = array[i];
                } else if (array[i] < largest && array[i] > secondLargest)
                    secondLargest = array[i];
            }
            if (largest == secondLargest) secondLargest = -1;
        }
        return secondLargest;
    }

    /**
     * reverses integer array
     *
     * @param array
     * @return
     */
    public static int[] reverse(int[] array) {
        //if(array == null) return new int[0];    //не знаю что возвращать в случае пустого массива
        int[] reverseArray =  new int[array.length];
        System.arraycopy(array, 0, reverseArray, 0, array.length);

        if (reverseArray == null || reverseArray.length <= 1) {
            return reverseArray;
        }
        int length = reverseArray.length;
        for (int i = 0; i < length / 2; i++)      //<= нельзя т.к. при четном array.length средние элементы не поменяются местами
        {
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[length - i - 1];
            reverseArray[length - i - 1] = temp;
        }
        return reverseArray;
    }
    //TODO 3.надо было, чтобы метод возвращал новый массив, в котором будут элементы переставленные
    // наоборот по отношению к входящему массиву? (как я сделала)
    // или в самом массиве элементы наоборот переставить?
    // (тогда в методе надо убрать первые две строчки и переименовать reverseArray на array)
    //TODO 3. Более правильно создать новый массив.
    // В случае перестановки внутри того же массива нужно произвести ОЧЕНЬ много действий.




    public static int[] findEvenElements(int[] array) {
        //if(array == null) return new int[0];    //не знаю что возвращать в случае пустого массива
        int[] evenElementsArray = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenElementsArray[k] = array[i];
                k++;
            }
        }
        int[] newEvenElementsArray = new int[k];
        System.arraycopy(evenElementsArray, 0, newEvenElementsArray, 0, k);
        return newEvenElementsArray;
    }
}


