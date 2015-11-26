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

        Array1D.arr1d();
        ArrayMinMax.arMinMax();
        ArrayFill.arFill();
        RandomArray.arRandom();
        Array2D.arr2d();
        MatrixMinMax.matrixMinMax();
        MatrixFill.matrFill();
        MatrixString.matrString();
        ParallelArrays.arrParallel();

        SequentialSearch.search(SequentialSearch.MY_STRING_ARRAY, "HP");
        BreakBooleanSearch.searchBreak(BreakBooleanSearch.MY_ARRAY, 4);
        BinarySearch.binarySearch(BinarySearch.MY_ARRAY, 0, 10, 77);

        Print.ln("\n" + "Binary search (Arrays.binarySearch) of key value (100):" + "\n" + Arrays.binarySearch(BinarySearch.MY_ARRAY, 100) + "\n");


        try {
            Banr.banr();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Print.ln("\n");
        MyList go = new MyList();

        go.initializationZeroEd();
        go.statusList();
        go.repeatedValue();
        go.joinArrays();
        go.initializationNum();
        go.convertArray();

        Print.ln("\n" + "TEXT: " + Arrays.toString(MyList.text));
        Print.ln("\n" + "KEY (н): " + (go.searchText(MyList.text, "н")));

    }/* ВЫЗОВ МЕТОДОВ */

}

/**
 * С ArrayList работать проще и удобнее, чем с массивами. Можно без проблем добавлять новые элементы, в том числе и в середину листа. А в случае использования обычного массива вам придётся заново выделять память и перезаписывать элементы, так как размер массива поменять нельзя, после того как была выделена память.
 * <p>
 * Работа с массивом быстрее и можно использовать массив, если точно знаете заранее размер массива и вам не придется его динамически менять, делать вставки и т.д.
 * <p>
 * http://mathbits.com/MathBits/Java/arrays/arrays.htm
 * http://introcs.cs.princeton.edu/java/95linear/
 * http://developer.alexanderklimov.ru/android/java/array.php
 * http://www.dotnetperls.com/for-java
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
