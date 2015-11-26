package myArray;

import java.util.Arrays;

public class Array1D {

    public static void arr1d() {
        System.out.println("\n" + "One-dimensional array (or single dimension array) is a type of linear array;");
        System.out.println("accessing its elements involves a single subscript which can either represent a row or column index");

        int[] array1d = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Example: " + "\n" + Arrays.toString(array1d) + "\n");

        for (int i : array1d) {
            System.out.println(i);
        }
    }
}