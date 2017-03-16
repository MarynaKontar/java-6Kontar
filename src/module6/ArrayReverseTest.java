package module6;

import java.util.Random;

/**
 * Created by User on 14.03.2017.
 */
public class ArrayReverseTest {
    public static void main(String[] args) {
        int[] ints = new int[10000000];
        Random random = new Random();
        for ( int j = 0; j < 10; j++ ) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt();
            }
            System.out.println("Array copy reverse");
            long timeBefore;
            timeBefore = System.currentTimeMillis();
            int arrLenght = ints.length;
            int [] resultArr = new int[arrLenght];
            for (int i = 0; i < arrLenght; i++) {
                resultArr [i] = ints [arrLenght - 1 - i];
            }
            System.out.println((System.currentTimeMillis()-timeBefore) + "ms");
            System.out.println();
            System.out.println("Array reverse by couples");
            timeBefore = System.currentTimeMillis();
            arrLenght = ints.length;
            int temp;
            int count = arrLenght-1;
            for (int i = 0; i < arrLenght/2; i++) {
                temp = ints[i];
                ints[i] = ints[count];
                ints[count] = temp;
                count--;
            }
            System.out.println((System.currentTimeMillis()-timeBefore) + "ms");
        }
    }
}
