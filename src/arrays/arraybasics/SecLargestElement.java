package arrays.arraybasics;

public class SecLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Second largest element: " + secLargestElement(arr));
    }
    public static int secLargestElement(int[] arr) {
        // Assumption
        int largest = arr[0];
        int secLargest = arr[1];
        for (int i = 0; i< arr.length; i++) {
            if ( arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
}
