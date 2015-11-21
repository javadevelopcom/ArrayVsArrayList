package Array;

public class Array2D {

    public void arr2d() {

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

