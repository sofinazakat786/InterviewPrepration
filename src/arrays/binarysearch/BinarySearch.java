package arrays.binarysearch;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int left = 0; // left pointer points towards index of first element of array
        int right = arr.length - 1; // right pointer points towards index of last element of array
        while (left <= right) {
            int mid = left + (right - left) / 2; // mid pointer points towards index of middle element of array
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {//
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }


}
