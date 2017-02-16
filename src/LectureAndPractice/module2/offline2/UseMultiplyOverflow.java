package LectureAndPractice.module2.offline2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 02.02.2017.
 */
public class UseMultiplyOverflow {
    static Random randomGenerator = new Random();

    public static void main(String[] args) {

        int[] randomArray = questions.getRandomPositiveIntsArray(2, 500);
        System.out.println(Arrays.toString(randomArray));

       long result = multiplyArray(randomArray, randomArray.length - 1);
        System.out.println(result);
        //System.out.println(randomArray.hashCode());//356573597

    }

    private static long multiplyArray(int[] randomArray, int indexToBegin) {

        if (indexToBegin == 0){
        return (long)randomArray[indexToBegin];
    }
        //return  (randomArray[indexToBegin] * multiplyArray(randomArray, indexToBegin - 1));
        //предупредит о переполнении стека (число больше наибольшего long)
        return  Math.multiplyExact(randomArray[indexToBegin],  multiplyArray(randomArray, indexToBegin - 1));
}
}
