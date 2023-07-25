// 10.Write a program to count the number of occurrences of any two vowels in
// succession in a line of text. For example, in the sentence
// Sample Input: “Please read this application and give me gratuity”
// Sample Output: ea, ea, ui

// the procedure
// 1. Prompt user for a line of text and store it in 'text' variable.
// 2. Convert 'text' to lowercase for a case-insensitive search.
// 3. Iterate through each character in 'text' (up to the second-to-last character).
// 4. If the current character and the next character are both vowels, print them with a comma.
// 5. End .

package java_projects_3;
import java.util.Scanner;

public class EX_NO10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String text = scanner.nextLine().toLowerCase();

        System.out.println("Occurrences of any two vowels in succession:");
        for (int i = 0; i < text.length() - 1; i++) {
            char currentChar = text.charAt(i);
            char nextChar = text.charAt(i + 1);
            if (isVowel(currentChar) && isVowel(nextChar)) {
                System.out.print(currentChar + "" + nextChar + ", ");
            }
        }
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}



