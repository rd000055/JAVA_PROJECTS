// 3. Write a JAVA program to get a long paragraph of text and search the given word in
// the text and prints out the number of times it has been occurred with its positions.


//PROCEDURE;
// 1. Prompt for paragraph and search word.
// 2. Perform a case-insensitive search for the word.
// 3. Print occurrences & positions; if none, print "Word not found."
// 4. End the program.

package java_projects_3;

import java.util.Scanner;

public class EX_NO3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a long paragraph of text:");
        String paragraph = scanner.nextLine().toLowerCase();

        System.out.println("Enter the word to search for:");
        String searchWord = scanner.nextLine().toLowerCase();

        int count = 0;
        int index = -1;

        System.out.println("Occurrences of the word '" + searchWord + "':");
        while ((index = paragraph.indexOf(searchWord, index + 1)) != -1) {
            count++;
            System.out.println("Occurrence " + count + " at position " + index);
        }

        if (count == 0) {
            System.out.println("The word '" + searchWord + "' does not exist in the text.");
        } else {
            System.out.println("Total occurrences: " + count);
        }
    }
}

