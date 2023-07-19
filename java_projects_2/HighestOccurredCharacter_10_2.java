// 2.Write a program in Java to return the highest occurred character in an array?

//procedure:
// 1.The program takes a character array input from the user using Scanner.
// 2.It initializes an array charOccurrences to count the occurrences of each character (assuming ASCII characters).
// 3.The program calculates the highest occurred character by iterating through the input array and updating the occurrences.
// 4.The character with the highest occurrence is found and stored in highestChar.
// 5.Finally, the highest occurred character is displayed as the output.

package java_projects_2;


import java.util.Scanner;

public class HighestOccurredCharacter_10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character array (e.g., abcdaabcab): ");
        String input = sc.nextLine();
        char[] inputArray = input.toCharArray();//changing string to character.

        char highestOccurredChar = findHighestOccurredCharacter(inputArray);
        System.out.println("The highest occurred character is: " + highestOccurredChar);
    }

    public static char findHighestOccurredCharacter(char[] arr) {
        int[] charOccurrences = new int[128]; // Assuming ASCII characters
        for (char ch : arr) {
            charOccurrences[ch]++;
        }

        char highestChar = '\0';
        int maxOccurrences = 0;
        for (char ch : arr) {
            if (charOccurrences[ch] > maxOccurrences) {
                highestChar = ch;
                maxOccurrences = charOccurrences[ch];
            }
        }

        return highestChar;
    }
}



