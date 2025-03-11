package dsa.arrays.arraybasics;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array elements: " + Arrays.toString(arr));
        int sum = sumArray(arr);
        System.out.println("Sum of array elements: " + sum);

    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
