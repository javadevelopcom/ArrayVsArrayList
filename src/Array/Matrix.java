package Array;

public class Matrix {

    public void matr() {

        int[][] matrix = {
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30},
                {40, 40, 40, 40, 40},
                {50, 50, 50, 50, 50}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}

