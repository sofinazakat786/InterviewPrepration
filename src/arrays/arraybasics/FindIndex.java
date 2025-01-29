package arrays.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Eneter array: " + Arrays.toString(arr));
        System.out.println("Enter the element to find the index: ");
        int element = sc.nextInt();
        int index = findIndex(arr, element);
        sc.close();

        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }


    }

    public static int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
