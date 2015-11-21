import Array.Array1D;
import Array.Array2D;
import Array.Matrix;

/**
 * Array1D has FIXED LENGTH
 * ArrayList has VARIABLE LENGTH
 * <p>
 * Array1D use Data Types: PRIMITIVES, OBJECTS
 * ArrayList use Data Types: OBJECTS, GENERICS
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("One-dimensional array (or single dimension array) is a type of linear array.");
        System.out.println("Accessing its elements involves a single subscript which can either represent a row or column index.");
        Array1D a1 = new Array1D();
        a1.arr1d();
        System.out.println();

        System.out.println("Two-dimensional array, the element with indices i,j would have address B + c * i + d * j, ");
        System.out.println("where the coefficients c and d are the row and column address increments, respectively.");
        Array2D a2 = new Array2D();
        a2.arr2d();

        System.out.println("Matrix:");
        Matrix m = new Matrix();
        m.matr();

    }
}

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
