package java_projects_2;

// Perform the following operations:
// Write a program in Java to print duplicate characters from an array? Write a program
// in Java to count the number of vowels and consonants in a character array?

import java.util.HashSet;

public class EX_8 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'e', 'b', 'f', 'g', 'e'};

        System.out.println("Duplicate characters in the array:");
        printDuplicateCharacters(charArray);
    }

    public static void printDuplicateCharacters(char[] charArray) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (char ch : charArray) {
            if (!set.add(ch)) {
                duplicates.add(ch);
            }
        }

        for (char ch : duplicates) {
            System.out.print(ch + " ");
        }
    }
}
