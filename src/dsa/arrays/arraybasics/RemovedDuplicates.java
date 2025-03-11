package dsa.arrays.arraybasics;

public class RemovedDuplicates {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 2, 8, 5, 7, 1};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
