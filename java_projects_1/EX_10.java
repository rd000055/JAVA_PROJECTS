// Write a java program to develop a Menu driven program and Subscription
// services of an OTT platform such as:
// Basics - 499
// Kids- 200 + Basics
// Sports- 700 + Basics
// English - 300 + Basics

package java_projects_1;

import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] prices = {499, 699, 799, 799};
        String[] packages = {"Basics", "Kids", "Sports", "English"};

        System.out.println("Welcome to OTT Subscription");
        for (int i = 0; i < prices.length; i++) {
            System.out.println((i+1) + ". " + packages[i] + " - $" + prices[i]);
        }

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice < 1 || choice > prices.length) {
            System.out.println("Invalid choice!");
            input.close();
            return;
        }

        double totalPrice = prices[choice-1];
        System.out.println("You have subscribed to " + packages[choice-1] + " for $" + totalPrice);

        System.out.println("Total Price: $" + totalPrice);
        input.close();
    }
}
