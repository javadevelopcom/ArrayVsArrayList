package Array;

public class MatrixString {

    public void matrString() {

        String[][] matrixString = {
                {"Dell"},
                {"Sony", "Apple"},
                {"ASUS", "Aceer", "HP"},
        };

        for (int i = 0; i < matrixString.length; i++) {
            for (int j = 0; j < matrixString[i].length; j++) {
                System.out.print(matrixString[i][j] + " ");
            }
            System.out.println();
        }
    }

}
