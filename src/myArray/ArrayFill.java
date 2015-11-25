package myArray;

import java.util.Arrays;

public class ArrayFill {
    public void arFill() {
        String[] array = new String[5];
        Arrays.fill(array, "Yes!");

        System.out.println(Arrays.toString(array));
    }
}
