// Create an array to store a given number by the user. Write a java program to find out all
// the search array (another input array) and its positions. Finally prints out the all-search
// array elements with its positions.


package java_projects_2;

import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        System.out.println("Enter " + N + " elements of the array:");
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Input the search array
        System.out.print("Enter the number of elements in the search array: ");
        int M = scanner.nextInt();
        int[] searchArray = new int[M];
        System.out.println("Enter " + M + " elements of the search array:");
        for (int i = 0; i < M; i++) {
            searchArray[i] = scanner.nextInt();
        }

        // Find all occurrences and positions of search array in the input array
        int count = 0;
        for (int i = 0; i <= N - M; i++) {
            boolean found = true;
            for (int j = 0; j < M; j++) {
                if (inputArray[i + j] != searchArray[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
                System.out.print("Position " + i + ": ");
                for (int j = 0; j < M; j++) {
                    System.out.print(searchArray[j] + " ");
                }
                System.out.println();
            }
        }

        // If no occurrences found
        if (count == 0) {
            System.out.println("No occurrences of the search array found in the input array.");
        }

        scanner.close();
    }
}

