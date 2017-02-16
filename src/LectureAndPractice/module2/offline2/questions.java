package LectureAndPractice.module2.offline2;

import java.util.Random;

/**
 * Created by User on 02.02.2017.
 */
public class questions {
    static Random randomGenerator = new Random();

    public static void main(String[] args) {
        int[] randomArray = getRandomPositiveIntsArray(0,650);
        for (int randArray : randomArray) {
            System.out.print(randArray + " ");
        }
    }

    public static int[] getRandomPositiveIntsArray(int length, int maxPositiveValue) {
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = getRandomInteger(maxPositiveValue);
        }
        return randomArray;
    }

    static int getRandomInteger(int maxValue) {
        int randomPositiveInt = randomGenerator.nextInt(maxValue);

        //и положительные и отрицательные
        int randomValue = randomGenerator.nextBoolean() ? randomPositiveInt : -randomPositiveInt;
        return randomValue;
    }
}
