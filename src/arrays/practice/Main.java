package arrays.practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9};
        System.out.println("Max number: " + maxNum(arr));
        System.out.println("Minimum number: " + minNum(arr));
        reverseArray(arr);
        sumOfElements(arr);
        countEvenAndOdd(arr);
        printAlternateElements(arr);

    }

    public static int maxNum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int[] arr) {
        int lastIndex = arr.length - 1;
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i <= lastIndex; i++) {
            reversedArray[i] = arr[lastIndex - i];
        }
        System.out.println("Reverser Array: " + Arrays.toString(reversedArray));
    }

    public static void sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);
    }

    public static void countEvenAndOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
    public static void printAlternateElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            i++;
        }
    }
}
