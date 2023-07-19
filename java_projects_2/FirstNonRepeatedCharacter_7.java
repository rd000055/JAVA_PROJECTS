// Write a program in Java to find the first non-repeated character in a character array. For
// example, the first non-repeated character in the input 'abcdab' is 'c'.

package java_projects_2;//this line is only needed if you are using your codes under any folder named java_projects_2

import java.util.Scanner;

public class FirstNonRepeatedCharacter_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character array: ");
        String input = sc.nextLine();//Get the input from the user
        char[] inputArray = input.toCharArray();

        char result = findFirstNonRepeatedCharacter(inputArray);

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedCharacter(char[] arr) {
        int[] count = new int[256]; // Assuming ASCII character set 

        // Count the occurrences of each character in the array
        for (char ch : arr) {
            count[ch]++;
        }

        // Find the first non-repeated character
        for (char ch : arr) {
            if (count[ch] == 1) {
                return ch;
            }
        }

        return '\0';// this denotes the null value in java programs
    }
}


