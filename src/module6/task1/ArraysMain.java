package module6.task1;

import java.util.Random;

/**
 * Java#6
 * Module 6 Home work 1
 * Create class ArraysMain with a main method,
 * where check ArraysUtils class methods (use a random array).
 *
 * @author Kontar Maryna
 */

public class ArraysMain{
    public static void main(String[] args) {

        final int RANGE_OF_RANDOM_NUMBERS = 1000;
        int numberOfArrayElements = 10;

        //                              Initialize array
        int[] integerArray = integerRandomArray(numberOfArrayElements, RANGE_OF_RANDOM_NUMBERS);
        //You can create your own array
        //int[] integerArray = {9, -9, 9, -10, -9};//{12, -34, 100, 100, 0, -12456, 356, 356, -234, 0};//
        //int[] integerArray = null;



        /**Print array, their sum, min, max, modulus of first and last element, max positive,
         * multiplication, second largest element, reverse array and even elements of array
         */
        print(integerArray);

        System.out.println("Sum of array elements is " +
                ArraysUtils.sum(integerArray));
        //System.out.println(IntStream.of(integerArray).parallel().sum());

        System.out.println("Min value in array is " +  ArraysUtils.min(integerArray));
        System.out.println("Max value in array is " + ArraysUtils.max(integerArray));

        int mPositiveInt = ArraysUtils.maxPositive(integerArray);
        System.out.println((mPositiveInt == -1) ? "There is no positive elements in the array." :
                "Max positive value in array is " + mPositiveInt);

        System.out.println("Multiplication of array's elements is " +
                ArraysUtils.multiplication(integerArray));

        int[] modulusInteger = ArraysUtils.modulus(integerArray);
        System.out.println((modulusInteger[1] == -1) ?
                "Array has only one element. Its modulus is " + modulusInteger[0] :
                "Modulus of first and last array's elements is " + modulusInteger[0] + ", " + modulusInteger[1]);

        int secondLargestInt = ArraysUtils.secondLargest(integerArray);
        System.out.println((secondLargestInt == -1) ?
                "There is no second largest element in the matrix. " +
                        "All array elements are equal " + integerArray[0] + ". " :
                "Second largest element is " + secondLargestInt);

        System.out.println("Reverse array: ");
        print(ArraysUtils.reverse(integerArray));

        System.out.println("Even elements of array: ");
        print(ArraysUtils.findEvenElements(integerArray));
    }

    /**
     * This returns int array with n randomly elements
     * from -range (inclusive) to range (exclusive)
     *
     * @param n
     * @param range
     * @return
     */
    private static int[] integerRandomArray(int n, int range) {
        int[] integerArray = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = rnd.nextInt(2 * range) - range;
        }
        return integerArray;
    }

    /**
     * prints all integer array elements
     *
     * @param inputArray
     */
    private static void print(int[] inputArray) {
        if (inputArray == null) return;
        for (int v : inputArray) {
            System.out.print(v + "  ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(inputArray));
    }
}
