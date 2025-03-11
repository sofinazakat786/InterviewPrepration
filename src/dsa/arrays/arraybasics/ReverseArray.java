package dsa.arrays.arraybasics;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        ReverseArray(arr);

    }

    public static void ReverseArray(int[] arr) {

        /* 
        // Method 1: Using pointers
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        end--;
        }

        /* 
        // Method 2: Using for loop
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
         */
        // Method 3: Using temporary array
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        arr = temp;

        System.out.println("Reverse Array: " + Arrays.toString(arr));
    }

}
