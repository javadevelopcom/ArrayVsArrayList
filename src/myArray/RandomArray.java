package myArray;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void arRandom() {
        Random random = new Random();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Initial array: " + "\n" + Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        System.out.println("Randomized array: " + "\n" + Arrays.toString(array) + "\n");
    }
}
