// Given N numbers are entered from the keyboard into an array. The number to be
// searched is entered through the keyboard by the user. Write a Java program to find if
// the number to be searched is present in the array and if it is present, display the number
// of times it appears in the array.

package java_projects_2;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: "); //it store how many numbers u need to store
        int N = scanner.nextInt();

        boolean found = false;
        int occurrences = 0;

        System.out.print("Enter the number to search: "); // enter the search value here
        int searchNumber = scanner.nextInt();

        System.out.println("Enter " + N + " numbers:"); //asks inputs for search elements
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num == searchNumber) {
                found = true;
                occurrences++;
            }
        }



        if (found) {
            System.out.println(searchNumber + " is present in the list " + occurrences + " time(s).");
        } else {
            System.out.println(searchNumber + " is not present in the list.");
        }

        scanner.close();
    }
}

