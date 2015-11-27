package myArray;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayStreams {
    static int[] array = new int[10];
    static int[] clone = new int[10];

    public static void arrayOperations() {
        print("Array STREAM operations: " + "\n");
        print("array :" + Arrays.toString(array));
        print("clone: " + Arrays.toString(clone));
        print("equals: " + Arrays.equals(array, clone));

        Arrays.fill(array, 2, 8, 2);
        print("filled " + Arrays.toString(array));


        print("equals: " + Arrays.equals(array, clone));

        boolean eqOne = Arrays.stream(array).equals(clone);
        print("EQUALS: " + eqOne);

        boolean eqTwo = IntStream.of(array).equals(clone);
        print("EQUALS+: " + eqTwo);


        Arrays.sort(array);
        print("sorted: " + Arrays.toString(array));

        print("SORTED array: ");
        IntStream.of(array).sorted().forEach(System.out::print);
        print("\n" + "or");
        IntStream.of(array).sorted().forEach(e -> System.out.print(e + ", "));

        print("\n" + "SORTED+ array: ");
        Arrays.stream(array).sorted().forEach(System.out::print);
        print("\n" + "or");
        Arrays.stream(array).sorted().forEach(e -> System.out.print(e + " "));


        print("\n" + "NUMBER of ALL ELEMENTS: " + array.length);

        long countOne = Arrays.stream(array).count();
        print("COUNT: " + countOne);

        long countTwo = IntStream.of(array).count();
        print("COUNT+: " + countTwo);


        int sumTwo = Arrays.stream(array).sum();
        print("SUM of ELEMENTS: " + sumTwo);

        int sumOne = IntStream.of(array).sum();
        print("SUM of ELEMENTS+: " + sumOne);


        OptionalDouble averageOne = Arrays.stream(array).average();
        print("AVERAGE of ELEMENTS: " + averageOne);

        OptionalDouble averageTwo = IntStream.of(array).average();
        print("AVERAGE of ELEMENTS+: " + averageTwo);


        print("\n" + "FILTERED ELEMENTS (0): ");
        Arrays.stream(array).filter(i -> i == 0).forEach(System.out::print);
        print("\n" + "FILTERED ELEMENTS (!=0): ");
        Arrays.stream(array).filter(i -> i != 0).forEach(System.out::print);
        print("\n" + "FILTERED ELEMENTS (%2==1): ");
        Arrays.stream(array).filter(i -> i % 2 == 1).forEach(System.out::print);


        print("\n" + "System.arraycopy(array, 0, copyTwo, 5, array.length): ");
        int[] copyTwo = new int[15];
        System.arraycopy(array, 0, copyTwo, 5, array.length);
        print(Arrays.toString(copyTwo));

        print("\n" + "Arrays.copyOf(array,5): ");
        int[] copyOne = Arrays.copyOf(array, 5);
        print(Arrays.toString(copyOne));

        print("\n" + "(array).clone(): ");
        int[] copyThree = (array).clone();
        print(Arrays.toString(copyThree));

        print("\n" + "for: ");
        int[] copyFour = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyFour[i] = array[i];
        }
        print(Arrays.toString(copyFour));
    }


    public static void print(String x) {
        System.out.println(x);
    }

    public static void print(boolean x) {
        System.out.println(x);
    }
}
// http://www.java2s.com/Tutorials/Java/java.util.stream/IntStream/
// https://docs.oracle.com/javase/tutorial/collections/streams/
