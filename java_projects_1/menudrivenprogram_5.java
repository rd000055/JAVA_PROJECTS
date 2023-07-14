package java_projects_1;// This line denotes the folder of the file where it is stored
import java.util.Scanner;// It is used to get input

public class menudrivenprogram_5{//class name should be created sames as file name
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int number;

        do {
            System.out.println("Menu:");
            System.out.println("1. Check if the number is a Buzz number");
            System.out.println("2. Check if the number is even or odd");
            System.out.println("3. Check if the number is positive or negative");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    number = input.nextInt();
                    if (isBuzzNumber(number)) {
                        System.out.println(number + " is a Buzz number.");
                    } else {
                        System.out.println(number + " is not a Buzz number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    number = input.nextInt();
                    if (isEven(number)) {
                        System.out.println(number + " is even.");
                    } else {
                        System.out.println(number + " is odd.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    number = input.nextInt();
                    if (isPositive(number)) {
                        System.out.println(number + " is positive.");
                    } else if (isNegative(number)) {
                        System.out.println(number + " is negative.");
                    } else {
                        System.out.println(number + " is neither positive nor negative (zero).");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println();

        } while (choice != 4);

        input.close();
    }
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static boolean isPositive(int num) {
        return num > 0;
    }
    public static boolean isNegative(int num) {
        return num < 0;
    }
}













// CREATED BY KERSTON2104 ON GITHUB