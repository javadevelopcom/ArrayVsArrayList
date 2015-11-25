package myArray;

public class SequentialSearch {

    public static int search(String[] list, String keyValue) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(keyValue))
                count = count + 1;
        }
        return count;
    }
}