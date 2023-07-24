// Write a java program to copy the given N numbers of one array into another 2 arrays in
// such a way that one array must contain the numbers in ascending order and the other
// must contain in the descending order.

package java_projects_2;

import java.util.Scanner;

public class adarray_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        int[] originalArray = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] ascendingArray = new int[N];
        int[] descendingArray = new int[N];

        // Copy numbers to the ascending array
        System.arraycopy(originalArray, 0, ascendingArray, 0, N);
        // Copy numbers to the descending array in reverse order
        System.arraycopy(originalArray, 0, descendingArray, 0, N);
        reverseArray(descendingArray);

        System.out.println("Original Array: " + arrayToString(originalArray));
        System.out.println("Ascending Array: " + arrayToString(ascendingArray));
        System.out.println("Descending Array: " + arrayToString(descendingArray));

        scanner.close();
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
