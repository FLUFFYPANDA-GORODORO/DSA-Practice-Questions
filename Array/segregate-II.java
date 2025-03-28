import java.util.Scanner;

public class segregate-II {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 0, 8, 7, 5, 0, 0};
        int n = arr.length;

        System.out.println("The elements of the array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveZerosToEnd(arr, n);

        System.out.println("The array after moving all zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr, int n) {
        int nonZeroIndex = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap the current element with the element at nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                // Move the nonZeroIndex forward
                nonZeroIndex++;
            }
        }
    }
}
