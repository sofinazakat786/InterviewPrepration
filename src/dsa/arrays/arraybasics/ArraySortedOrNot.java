package dsa.arrays.arraybasics;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 10};
        System.out.println("Is array sorted: " + isArraySorted(arr));
    }

    public static boolean isArraySorted(int arr[]) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        return isAscending || isDescending;
    }
}