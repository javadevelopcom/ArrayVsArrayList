import myArray.*;
import myArrayList.Banr;
import myArrayList.MyList;

import java.util.Arrays;

/**
 * Array has FIXED LENGTH
 * ArrayList has VARIABLE LENGTH
 * <p>
 * Array use Data Types: PRIMITIVES, OBJECTS
 * ArrayList use Data Types: OBJECTS, GENERICS
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        try {
            Banner.banner();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Print.ln("\n");

        Print.ln("One-dimensional array (or single dimension array) is a type of linear array.");
        Print.ln("Accessing its elements involves a single subscript which can either represent a row or column index.");
        Array1D a1 = new Array1D();
        a1.arr1d();
        Print.ln("\n");

        Print.ln("Result of Filling the Array using (Arrays.fill):");
        ArrayFill af = new ArrayFill();
        af.arFill();
        System.out.println();

        Print.ln("Two-dimensional array, the element with indices i,j would have address B + c * i + d * j, ");
        Print.ln("where the coefficients c and d are the row and column address increments, respectively.");
        Array2D a2 = new Array2D();
        a2.arr2d();
        System.out.println();

        Print.ln("Matrix:");
        Matrix m1 = new Matrix();
        m1.matr();
        System.out.println();

        Print.ln("Result of Filling the Matrix:");
        MatrixFill m2 = new MatrixFill();
        m2.matrfill();
        System.out.println();

        Print.ln("Result of Creating a Matrix of String values:");
        MatrixString m3 = new MatrixString();
        m3.matrString();
        System.out.println();

        Print.ln("Result of 3 Parallel arrays with the same number of elements that work in tandem to organize data:");
        ParallelArrays a3 = new ParallelArrays();
        a3.arrParallel();
        System.out.println();

        Print.ln("Sequential search of key value (HP)");
        String[] myStringArray = {"Dell", "Sony", "Apple", "ASUS", "Aceer", "HP", "HP"};
        String keyValue = "HP";
        int values = SequentialSearch.search(myStringArray, keyValue);
        Print.ln("in Array: " + Arrays.toString(myStringArray) + "\n" + values + "\n");

        Print.ln("BREAK and boolean search of key value (4)");
        int[] myIntArray = {1, 2, 2, 2, 3, 4, 1, 6, 8, 8, 0, 9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 1, 1, 2, 0, 7};
        int number = 4;
        int value = BreakBooleanSearch.searchBreak(myIntArray, number);
        Print.ln("in Array: " + Arrays.toString(myIntArray) + "\n" + value + "\n");

        Print.ln("Binary search method (accepts a pre-sorted array) of key value (77)");
        BinarySearch bs = new BinarySearch();
        int key = 77;
        int[] num = {13, 24, 34, 46, 52, 63, 77, 89, 91, 100};
        int val = bs.binarySearch(num, 0, 9, key);
        Print.ln("in Array: " + Arrays.toString(num) + "\n" + val);

        System.out.println("Binary search (Arrays.binarySearch) of key value (100):" + "\n" + Arrays.binarySearch(num, 100) + "\n");


        try {
            Banr.banr();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Print.ln("\n");

        MyList list = new MyList();
        list.myListOperations();

        /* вывод на экран */
    }

}

/**
 * С ArrayList работать проще и удобнее, чем с массивами. Можно без проблем добавлять новые элементы, в том числе и в середину листа. А в случае использования обычного массива вам придётся заново выделять память и перезаписывать элементы, так как размер массива поменять нельзя, после того как была выделена память.
 * <p>
 * Работа с массивом быстрее и можно использовать массив, если точно знаете заранее размер массива и вам не придется его динамически менять, делать вставки и т.д.
 * <p>
 * http://mathbits.com/MathBits/Java/arrays/arrays.htm
 * http://introcs.cs.princeton.edu/java/95linear/
 * http://developer.alexanderklimov.ru/android/java/array.php
 * <p>
 * http://www.codejava.net/java-core/collections/sorting-list-collections-examples
 * http://www.codejava.net/java-core/the-java-language/notes-about-arrays-in-java
 * http://www.codejava.net/java-core/collections/sorting-arrays-examples-with-comparable-and-comparator#comment-2756
 * http://www.codejava.net/java-core/collections/java-list-collection-tutorial-and-examples
 * <p>
 * http://www.codejava.net/java-core/collections/java-collections-framework-summary-table
 * http://www.codejava.net/java-core/collections/class-diagram-of-map-api
 * http://www.codejava.net/java-core/collections/using-java-8-lambda-expressions-for-collections-internal-iteration
 * https://www.youtube.com/watch?v=ZVJ7kpEMc7U
 */
