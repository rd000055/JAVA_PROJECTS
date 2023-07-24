// Write a java program to find the following pattern:
// 1
// 2 3
// 4 5 6
// 7 8 9 10

package java_projects_1;

import java.util.Scanner;

public class numpat_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        printPattern(rows);

        scanner.close();
    }

    public static void printPattern(int n) {
        int num = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

