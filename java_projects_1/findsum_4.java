// Write a java program to find the sum of ‘N’ numbers.

package java_projects_1;

import java.util.Scanner;

public class findsum_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sum = findSum(N);
        System.out.println("The sum of " + N + " numbers is: " + sum);

        scanner.close();
    }

    public static int findSum(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum;
    }
}

