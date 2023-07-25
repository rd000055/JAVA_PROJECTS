// 5.Write a JAVA program to get a long paragraph of text and find out all the vowels
// and replace it with special symbol a user inputted character, finally output the given
// text and modified text.

//PROCEDURE;
// 1. Prompt user to enter a long paragraph of text and a special character for vowel replacement.
// 2. Call the "replaceVowels" function, passing the paragraph and replaceChar as parameters, to modify the text.
// 3. Store the modified text in a variable called "modifiedText."
// 4. Display "Original Text:" followed by the original paragraph entered by the user.
// 5. Display "Modified Text:" followed by the "modifiedText" to show the replaced vowel version of the paragraph.

package java_projects_3;

import java.util.Scanner;

public class EX_NO5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a long paragraph of text:");
        String paragraph = scanner.nextLine();

        System.out.println("Enter the character to replace vowels:");
        char replaceChar = scanner.next().charAt(0);

        String modifiedText = replaceVowels(paragraph, replaceChar);

        System.out.println("\nOriginal Text:\n" + paragraph);
        System.out.println("\nModified Text:\n" + modifiedText);
    }

    public static String replaceVowels(String text, char replaceChar) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (char vowel : vowels) {
            text = text.replace(vowel, replaceChar);
        }

        return text;
    }
}

