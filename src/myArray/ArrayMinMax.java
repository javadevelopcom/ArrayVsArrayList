package myArray;

import java.util.Arrays;

public class ArrayMinMax {
    static int[] array = {900, 45, 21, 777, -60};

    public static void arMinMax() {
        System.out.println("\n" + "Initial array: " + Arrays.toString(array));
        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
    }
}