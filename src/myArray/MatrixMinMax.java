package myArray;

public class MatrixMinMax {

    public static void matrixMinMax() {
        System.out.println("Matrix is a rectangular array of numbers, symbols, or expressions:" + "\n");

        int[][] matrix = {
                {10, 10, 10, 10, -10},
                {20, 20, 20, -20, 20},
                {30, 30, -30, 30, 30},
                {40, -40, 40, 40, 40},
                {-50, 50, 50, 50, 50}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
    }
}