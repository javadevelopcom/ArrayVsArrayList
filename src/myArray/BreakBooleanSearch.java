package myArray;

public class BreakBooleanSearch {

    public static int searchBreak(int[] list, int number) {

        boolean found = false;
        int i;
        for (i = 0; i < list.length; i++) {
            if (list[i] == number) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found " + number + " at index [" + i + "]. ");
        } else System.out.println(number + " is not at this array!");
        return i;
    }
}
