package myArray;

import java.util.Arrays;

public class BreakBooleanSearch {

    public static final int[] MY_ARRAY = new int[]{1, 2, 2, 2, 3, 4, 1, 6, 8, 8, 6, 5, 4};

    public static void searchBreak(int[] array, int number) {
        System.out.println("\n" + "BREAK and boolean search of key value (4)");
        System.out.println("in Array: " + Arrays.toString(MY_ARRAY));

        boolean found = false;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found " + number + " at index [" + i + "] ");
        } else System.out.println(number + " is not at this array!");
    }
}