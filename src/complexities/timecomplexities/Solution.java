package complexities.timecomplexities;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        printSum();

        int[] arr = {1, 2, 3, 4, 4, 6, 3, 8, 5, 9, 1};
        System.out.println("Array sum: " + sumArray(arr));

        nestedLoop(10);

        nby2(4);
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr2);

    }

    // Complexity is O(1)
    public static int printSum() {
        int a = 39;
        int b = 101;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }

    // Complexity is O(n)
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Complexity is O(n) as inner loop is fixed to run for 10 times
    public static void nestedLoop(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
            }
        }

    }

    // Complexity is Big O(n/2)
    public static void nby2(int n) {
        for (int i = 0; i < n / 2; i++) {
            System.out.println("value1");
            System.out.println("value2");
        }
    }

    // Complexity is Big O(n/2) as if n = 10, loop runs till n/2
    public static void multipleVariableLoop(int n) {
        for (int i = 0, j = n; i < j; i++, j--) {
            int k = i + j;

        }
    }
// Worst-case: 𝑂(𝑛2)O(n 2) (when the array is sorted in reverse order).

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
