package myArray;

public class Array2D {

    public static void arr2d() {
        System.out.println("Two-dimensional array, the element with indices i,j would have address B + c * i + d * j, ");
        System.out.println("where the coefficients c and d are the row and column address increments, respectively");

        int[][] array2d = new int[2][2];

        array2d[0][0] = 1;
        array2d[0][1] = 1;
        array2d[1][0] = 2;
        array2d[1][1] = 2;

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) System.out.print(array2d[i][j] + " ");
            System.out.println();
        }
    }
}