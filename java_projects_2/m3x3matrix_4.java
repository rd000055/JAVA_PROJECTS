package java_projects_2;

// Write a program to obtain transpose of a 3 x 3 matrix. The transpose of a matrix is
// obtained by exchanging the elements of each row with the elements of the
// corresponding column.

import java.util.Scanner;

public class m3x3matrix_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Input the matrix elements
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Obtain the transpose of the matrix
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Display the transpose matrix
        System.out.println("Transpose Matrix:");
        displayMatrix(transpose);

        scanner.close();
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
