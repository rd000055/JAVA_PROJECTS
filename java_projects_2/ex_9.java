package java_projects_2;

// Write a Java program to find the common elements between two arrays.

public class ex_9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Common elements between the two arrays:");
        findCommonElements(array1, array2);
    }

    public static void findCommonElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; // Break out of inner loop once a common element is found
                }
            }
        }
    }
}
