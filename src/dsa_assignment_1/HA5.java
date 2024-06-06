package dsa_assignment_1;
import java.util.Random;
public class HA5 {
    


    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find the first row with the most 1s
        int maxRowCount = 0;
        int maxRowIndex = -1;
        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        // Find the first column with the most 1s
        int maxColCount = 0;
        int maxColIndex = -1;
        for (int j = 0; j < 4; j++) {
            int colCount = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndex = j;
            }
        }

        // Print the results
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}

