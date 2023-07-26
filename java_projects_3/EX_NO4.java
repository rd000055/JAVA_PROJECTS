apackage java_projects_3;

// In an customer care automation application, the names of the customers need to be
// maintained in an ascending order (alphabetically). Write a JAVA program to get
// different names and prints them in ascending order.


import java.util.Scanner;

public class EX_NO4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer names (type 'exit' to stop):");
        String names = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            names += input + "\n";
        }

        String sortedNames = sortNames(names);

        System.out.println("Customer names in ascending order:");
        System.out.println(sortedNames);
    }

    public static String sortNames(String names) {
        String[] nameArray = names.split("\n");
        int n = nameArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nameArray[j].compareTo(nameArray[j + 1]) > 0) {
                    String temp = nameArray[j];
                    nameArray[j] = nameArray[j + 1];
                    nameArray[j + 1] = temp;
                }
            }
        }

        StringBuilder sortedNames = new StringBuilder();
        for (String name : nameArray) {
            sortedNames.append(name).append("\n");
        }

        return sortedNames.toString();
    }
}
