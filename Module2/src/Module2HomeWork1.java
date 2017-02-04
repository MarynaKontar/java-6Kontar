import java.math.BigDecimal;
import java.util.Random;

/**
 * Java#6
 * Module 2 Home work 1
 * REWRITE METHODS SUM AND MULTIPLICATION WITH RECURSION
 *
 */
public class Module2HomeWork1 {
    public static void main(String[] args) {

        final int RANGE = 1000;

        //number of array elements
        int n = 10;

        //                              Initialize arrays
        //initialize integer array
        //int[] inputIntegerArray = integerArray(n, RANGE);
        //You can create your own array
        int[] inputIntegerArray = {9, -9, 9, -10, -9};//{12, -34, 100, 100, 0, -12456, 356, 356, -234, 0};//


        //initialize double array
        //double[] inputDoubleArray = doubleArray(n, RANGE);
        //You can create your own array
        double[] inputDoubleArray = {-2.0,-7,-90};//{0.89, -34.78, 100.2355, 100.0, 0, -12456.45, 356.0, 356.0, -234.67, 0};//


        /**Print arrays, their sum, min, max, modulus of first and last element, max positive,
         * multiplication, second largest element
         */
        //                              Integer array
        print(inputIntegerArray);
        System.out.println("Sum of array elements is " +
                sum(inputIntegerArray, inputIntegerArray.length - 1));
        System.out.println("Min value in array is " + min(inputIntegerArray));
        System.out.println("Max value in array is " + max(inputIntegerArray));
        int mPositiveInt = maxPositive(inputIntegerArray);
        System.out.println((mPositiveInt == -1) ? "There is no positive elements in the array." :
                "Max positive value in array is " + mPositiveInt);
        System.out.println("Multiplication of array's elements is " +
                multiplication(inputIntegerArray, inputIntegerArray.length - 1));

        int[] modulusInteger = modulus(inputIntegerArray);
        System.out.println((modulusInteger[1] == -1) ?
                "Array has only one element. Its modulus is " + modulusInteger[0] :
                "Modulus of first and last array's elements is " + modulusInteger[0] + ", " + modulusInteger[1]);

        int secondLargestInt = secondLargest(inputIntegerArray);
        System.out.println((secondLargestInt == -1) ?
                "There is no second largest element in the matrix. " +
                        "All array elements are equal " + inputIntegerArray[0] + ". " :
                "Second largest element is " + secondLargestInt);

        //                              Double array
        print(inputDoubleArray);
        System.out.println("Sum of array elements is " + sum(inputDoubleArray, inputDoubleArray.length - 1));
        System.out.println("Min value in array is " + min(inputDoubleArray));
        System.out.println("Max value in array is " + max(inputDoubleArray));
        double mPositiveDouble = maxPositive(inputDoubleArray);
        System.out.println((mPositiveDouble == -1) ? "There is no positive elements in the array." :
                "Max positive value in array is " + mPositiveDouble);
        System.out.println("Multiplication of array's elements is " +
                multiplication(inputDoubleArray, inputDoubleArray.length - 1));

        double[] modulusDouble = modulus(inputDoubleArray);
        System.out.println((modulusDouble[1] == -1) ?
                "Array has only one element. Its modulus is " + modulusDouble[0] :
                "Modulus of first and last array's elements is " + modulusDouble[0] + ", " + modulusDouble[1]);

        double secondLargestDouble = secondLargest(inputDoubleArray);
        System.out.println((secondLargestDouble == -1) ?
                "There is no second largest element in the matrix. " +
                        "All array elements are equal " + inputDoubleArray[0] + ". " :
                "Second largest element is " + secondLargestDouble);


    }

    /**
     * return sum of integer array elements
     * This method does not work correctly when sum is outside the range - 2147483647 :  2147483647
     * @param array
     * @return
     */
//    static int sum(int[] array) {
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            summ += array[i];
//        }
//        return summ;
//    }

    private static int sum(int[] array, int indexToBegin){
        if(indexToBegin == 0)
            return array[indexToBegin];
        return array[indexToBegin] + sum(array, indexToBegin - 1);
    }

    /**
     * return sum of double array elements
     * This method does not work correctly when sum is outside the range - 1,8*10^308 : - 1,8*10^308
     * @param array
     * @return
     */
//    static double sum(double[] array) {
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return sum;
//    }

    private static double sum(double[] array, int indexToBegin){
        if(indexToBegin == 0)
            return array[indexToBegin];
        return array[indexToBegin] + sum(array, indexToBegin - 1);
    }


    /**
     * return minimum element of integer array
     * @param array
     * @return
     */
    private static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    /**
     * return maximum element of integer array
     * @param array
     * @return
     */
    private static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * method return minimum element of double array
     */
    private static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    /**
     * method return maximum element of double array
     */
    private static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * method return max positive element of int array
     * if there is no positive elements return -1
     * @param array
     * @return
     */
    private static int maxPositive(int[] array) {
        int maxPos = max(array);
        if (maxPos < 0) maxPos = -1;
        return maxPos;
    }

    /**
     * method return max positive element of double array
     * if there is no positive elements return -1
     * @param array
     * @return
     */
    private static double maxPositive(double[] array) {
        double maxPos = max(array);
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
//    static int multiplication(int[] array) {
//        int multiplication = 1;
//        for (int i = 0; i < array.length; i++) {
//            multiplication *= array[i];
//        }
//        return multiplication;
//    }

    private static long multiplication(int[] randomArray, int indexToBegin) {

        if (indexToBegin == 0) {
            return (long) randomArray[indexToBegin];
        }
        return randomArray[indexToBegin] * multiplication(randomArray, indexToBegin - 1);
//        return Math.multiplyExact(randomArray[indexToBegin], multiplication(randomArray, indexToBegin - 1));
    }


    /**
     * method return multiplication of double array elements
     * This method does not work correctly when multiplication
     * is outside the range - 1,8*10^308 : - 1,8*10^308
     */
//    static double multiplication(double[] array) {
//        double multiplication = 1;
//        for (int i = 0; i < array.length; i++) {
//            multiplication *= array[i];
//        }
//        return multiplication;
//    }

    private static double multiplication(double[] randomArray, int indexToBegin) {

        if (indexToBegin == 0) {
            return randomArray[indexToBegin];
        }
        return randomArray[indexToBegin] * multiplication(randomArray, indexToBegin - 1);
//        return Math.multiplyExact(randomArray[indexToBegin], multiplication(randomArray, indexToBegin - 1));
    }

    /**
     * method returns two element array of first and last element modulus of integer array
     * if there is only one element in the array it returns [modulus, -1]
     * @param array
     * @return
     */
    private static int[] modulus(int[] array) {
        int[] mod = new int[2];
        if (array.length == 1){
            mod[0] = Math.abs(array[0]); //(array[0] >= 0) ? array[0] : -array[0];
            mod[1] = -1;
        }
        else {
            mod[0] = Math.abs(array[0]); //(array[0] >= 0) ? array[0] : -array[0];
            mod[1] = Math.abs(array[array.length - 1]);
            //(array[array.length - 1] >= 0) ? array[array.length - 1] : -array[array.length - 1];
        }
        return mod;
    }

    /**
     * method returns two element array of first and last element modulus of double array
     * if there is only one element in the array it returns [modulus, -1]
     * @param array
     * @return
     */
    private static double[] modulus(double[] array) {
        double[] mod = new double[2];
        if (array.length == 1){
            mod[0] = Math.abs(array[0]);
            mod[1] = -1;
        }
        else {
            mod[0] = Math.abs(array[0]);
            mod[1] = Math.abs(array[array.length - 1]);
        }
        return mod;
    }

    /**
     * method returns secondLargest element of integer array
     * if the matrix elements are equals or matrix has only one element
     * it returns -1
     */
    private static int secondLargest(int[] array) {
        int largest, secondLargest;
        if (array.length == 1) {
            secondLargest = -1;
        } else {        //array.length > 1
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
     * method returns secondLargest element of double array
     * if the matrix elements are equals or matrix has only one element
     * it returns -1
     */
    private static double secondLargest(double[] array) {
        double largest, secondLargest;
        if (array.length == 1) {
            secondLargest = -1;
        } else {
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
     * This returns int array with n randomly elements
     * from -range (inclusive) to range (exclusive)
     *
     * @param n
     * @param range
     * @return
     */
    private static int[] integerArray(int n, int range) {
        int[] inputArrayInteger = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < inputArrayInteger.length; i++) {
            inputArrayInteger[i] = 2 * rnd.nextInt(range) - range;
        }
        return inputArrayInteger;
    }

    /**
     * This returns double array with n randomly elements
     * from -range (inclusive) to range (exclusive)
     *
     * @param n
     * @param range
     * @return
     */
    private static double[] doubleArray(int n, int range) {
        double[] inputArrayDouble = new double[n];
        Random rnd = new Random();
        for (int i = 0; i < inputArrayDouble.length; i++) {
            inputArrayDouble[i] = (range - (-range)) * rnd.nextDouble() + (-range);
        }
        return inputArrayDouble;
    }

    /**
     * prints all integer array elements
     *
     * @param inputArray
     */
    private static void print(int[] inputArray) {
        System.out.println("Integer array: ");
        for (int v : inputArray) {
            System.out.print(v + "  ");
        }
        System.out.println();
    }

    /**
     * prints all double array elements
     *
     * @param inputArray
     */
    private static void print(double[] inputArray) {
        System.out.println("Double array: ");
        for (double v : inputArray) {
            System.out.printf("%.2f  ", v);
        }
        System.out.println();
    }

}
