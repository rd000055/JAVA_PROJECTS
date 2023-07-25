// 7. Write a program that converts all lowercase characters in a given string to its
// equivalent uppercase character. (Note: If space comes leave it as it is).

//PROCEDURE:
// 1. Ask for a string from the user and store it in 'input'.
// 2. Create an empty string called 'output'.
// 3. For each character 'ch' in 'input':
// 4. If 'ch' is a lowercase letter, convert it to uppercase and add it to 'output'.
// 5.Otherwise, add 'ch' as it is to 'output'.
// 6. Display the converted 'output' string.

package java_projects_3;

import java.util.Scanner;

public class EX_NO7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = convertToLowercase(input);
        System.out.println("Converted string: " + result);
    }

    public static String convertToLowercase(String input) {
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            }
            output.append(ch);
        }
        return output.toString();
    }
}

