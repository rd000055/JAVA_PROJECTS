package java_projects_1;


import java.util.Scanner;

public class GreatestOfThreeNumbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int greatest = findGreatest(num1, num2, num3);
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }

    public static int findGreatest(int a, int b, int c) {
        // Compare three numbers and find the greatest one
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

