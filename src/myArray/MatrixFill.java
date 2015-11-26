package myArray;

public class MatrixFill {

    public static void matrFill() {
        System.out.println("\n" + "Result of Filling the Matrix using for-loop:");

        int[][] matrix = new int[5][10];
        int k = 100;
        for (int row = 0; row < 5; row++)
            for (int column = 0; column < 10; column++) {
                matrix[row][column] = k;
                k++;
            }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
