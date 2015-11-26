package myArray;

import java.util.Arrays;

public class ArrayFill {
    public static void arFill() {
        String[] array = new String[5];
        System.out.println("\n" + "Initial array: " + "\n" + Arrays.toString(array));

        Arrays.fill(array, "Yes!");
        System.out.println("Filling the Array using Arrays.fill():" + "\n" + Arrays.toString(array));

        Arrays.fill(array, 3, 5, "NO");
        System.out.println("Filling the Array using Arrays.fill():" + "\n" + Arrays.toString(array) + "\n");
    }
}
