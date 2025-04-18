package common_questions;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1}; // Example array
        Arrays.sort(arr); // Sort the array first
        System.out.print("Duplicate elements: ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) { // Compare adjacent elements
                System.out.print(arr[i] + " ");
            }
        }
    }
}
