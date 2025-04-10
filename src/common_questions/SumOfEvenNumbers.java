package common_interview_questions;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        int sum = 0;

//        for (int num : numbers) {
//            if (num % 2 == 0) { // Check if the number is even
//                sum += num;
//            }
//        }
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] % 2 == 0 ){
                sum += numbers[i];
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
