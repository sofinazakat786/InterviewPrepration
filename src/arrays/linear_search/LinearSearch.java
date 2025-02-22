package arrays.linear_search;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 4, 8, 9};

        //Searching for elements
        linearSearch(arr, 3);
        linearSearch(arr, 4);
        multipleOccurrenceSearch(arr, 4);
        lastOccurrenceSearch(arr, 4);
        maxElement(arr);
        int minElement = minElement(arr);
        System.out.println("Min element of Array is: " + minElement);

    }

    //Linear search method
    public static void linearSearch(int arr[], int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element " + target + " not found");
        } else {
            System.out.println("Element " + target + " found at index: " + index);
        }
    }

    public static void lastOccurrenceSearch(int arr[], int target) {
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element " + target + " not found");
        } else {
            System.out.println("Last Occurence of element " + target + " found at index: " + index);
        }
    }

    // what else we can play with linear search?
    // 1. Search for multiple occurrences of the element?
    public static void multipleOccurrenceSearch(int arr[], int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                System.out.println("Element " + target + " found at index: " + index);
            }
        }
        if (index == -1) {
            System.out.println("Element " + target + " not found");
        }
    }

    public static void maxElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element of Array is: " + max);
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
