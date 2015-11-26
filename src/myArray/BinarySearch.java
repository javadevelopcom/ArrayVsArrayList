package myArray;

import java.util.Arrays;

public class BinarySearch {
    public static final int[] MY_ARRAY = new int[]{13, 24, 34, 46, 52, 63, 77, 89, 91, 100};

    public static void binarySearch(int[] array, int lowerbound, int upperbound, int key) {
        System.out.println("\n" + "Binary search method (accepts a pre-sorted array) of key value (77)");
        System.out.println("in Array: " + Arrays.toString(MY_ARRAY));

        int position;
        int comparisonCount = 1;    // counting the number of comparisons (optional)

        // To start, find the subscript of the middle position.
        position = (lowerbound + upperbound) / 2;

        while ((array[position] != key) && (lowerbound <= upperbound)) {
            comparisonCount++;
            if (array[position] > key)                   // If the number is > key, ..
            {                                            // decrease position by one.
                upperbound = position - 1;
            } else {
                lowerbound = position + 1;               // Else, increase position by one.
            }
            position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound) {
            System.out.println("The number was found in array subscript [" + position + "]");
            System.out.println("found the number after " + comparisonCount +
                    " comparisons");
            // printing the number of comparisons is optional
        } else
            System.out.println("number is not in this array.  The binary search made "
                    + comparisonCount + " comparisons");
    }
}