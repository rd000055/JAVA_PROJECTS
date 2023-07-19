// Perform the following operations:
// 1.Write a program in Java to count the occurrence of a given character in an array?
// 2.Write a program in Java to return the highest occurred character in an array?

package java_projects_2;// This line denotes the folder of the file where it is stored

import java.util.Scanner;//import the required java input file to gather the input from the user.

public class CharacterOccurrences_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character array (e.g., abcdab): ");
        String input = sc.nextLine();
        char[] inputArray = input.toCharArray();// Convert the input String to a character array

        System.out.print("Enter the character to count its occurrences: ");
        char targetChar = sc.next().charAt(0);//the index will automatically create if you are using VS code.

        int occurrences = countOccurrences(inputArray, targetChar);// Call the countOccurrences method to get the number of occurrences of the target character in the array

        System.out.println("The number of occurrences of '" + targetChar + "' is: " + occurrences);
    }

    public static int countOccurrences(char[] arr, char targetChar) { // function to count the occurrences of a given character in an array
        int count = 0;

        for (char ch : arr) {
            if (ch == targetChar) {
                count++;
            }
        }

        return count;
    }
}

