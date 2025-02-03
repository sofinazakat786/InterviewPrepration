package arrays.binarysearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        BinarySearch bs = new BinarySearch();
        int target = 25;
        int result = bs.binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index at " + (result + 1) + getOrdinalSuffix(result + 1) + " position");
        }
    }

    public static String getOrdinalSuffix(int num) {
        switch (num) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

}
