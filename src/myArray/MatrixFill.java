package myArray;

public class MatrixFill {

    public void matrfill() {

        double[][] matrixFill = new double[10][3];
        int k = 0;
        for (int row = 5; row < 10; row++)
            for (int column = 1; column < 3; column++) {
                matrixFill[row][column] = k;
                k++;
            }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrixFill[i][j] + " ");
            System.out.println();
        }
    }
}
