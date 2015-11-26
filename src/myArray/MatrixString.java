package myArray;

public class MatrixString {

    public static void matrString() {
        System.out.println("\n" + "Matrix of String values:");
        String[][] matrix = {
                {"Dell", "HP", "MSI"},
                {"Sony", "Apple", "Samsung"},
                {"ASUS", "Acer", "Lenovo"},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

}
