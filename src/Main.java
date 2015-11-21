import Array.*;
import ArrayList.Banr;

import java.io.Console;

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
        System.out.println();

        System.out.println("One-dimensional array (or single dimension array) is a type of linear array.");
        System.out.println("Accessing its elements involves a single subscript which can either represent a row or column index.");
        Array1D a1 = new Array1D();
        a1.arr1d();
        System.out.println();
        System.out.println();

        System.out.println("Two-dimensional array, the element with indices i,j would have address B + c * i + d * j, ");
        System.out.println("where the coefficients c and d are the row and column address increments, respectively.");
        Array2D a2 = new Array2D();
        a2.arr2d();
        System.out.println();

        System.out.println("Matrix:");
        Matrix m1 = new Matrix();
        m1.matr();
        System.out.println();

        System.out.println("Result of Filling the Matrix:");
        MatrixFill m2 = new MatrixFill();
        m2.matrfill();
        System.out.println();

        System.out.println("Result of Creating a Matrix of String values:");
        MatrixString m3 = new MatrixString();
        m3.matrString();
        System.out.println();

        System.out.println("Result of 3 Parallel arrays with the same number of elements that work in tandem to organize data:");
        ParallelArrays a3 = new ParallelArrays();
        a3.arrParallel();
        System.out.println();

        System.out.println("Sequential search of key value:");
        String[] myStringArray = {"Dell", "Sony", "Apple", "ASUS", "Aceer", "HP", "HP"};
        SequentialSearch ss = new SequentialSearch();
        String keyValue = "HP";
        int values = SequentialSearch.search(myStringArray, keyValue);
        System.out.println(values);
        System.out.println();

        System.out.println("BREAK and boolean search of key value:");
        int[] myIntArray = {1, 2, 2, 2, 3, 4, 1, 6, 8, 8, 0, 9, 8, 7, 6, 5, 4, 3, 3, 2, 1, 1, 1, 2, 0, 7};
        BreakBooleanSearch bb = new BreakBooleanSearch();
        int number = 4;
        int value = BreakBooleanSearch.searchBreak(myIntArray, number);
        System.out.println(value);
        System.out.println();

        System.out.println("Binary search method accepts a pre-sorted array.");
        System.out.println("Result:");
        BinarySearch bs = new BinarySearch();
        int key = 77;
        int[] num = {13, 24, 34, 46, 52, 63, 77, 89, 91, 100};
        int val = bs.binarySearch(num, 0, 9, key);
        System.out.println(val);
        System.out.println();

        try {
            Banr.banr();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
// http://mathbits.com/MathBits/Java/arrays/arrays.htm

/**
 * http://introcs.cs.princeton.edu/java/95linear/
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
