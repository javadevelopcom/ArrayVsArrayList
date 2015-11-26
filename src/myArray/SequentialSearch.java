package myArray;

import java.util.Arrays;

public class SequentialSearch {

    public static final String[] MY_STRING_ARRAY = new String[]{"Dell", "Sony", "Apple", "ASUS", "Aceer", "HP", "HP"};

    public static void search(String[] array, String keyValue) {
        System.out.println("\n" + "Sequential search of key value (HP)");
        System.out.println("in Array: " + Arrays.toString(MY_STRING_ARRAY));

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(keyValue))
                count = count + 1;
        }
        System.out.println(count);
    }
}