package common_interview_questions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        factorial(num);
        factorialUsingRecursion(num);
        System.out.println("Factorial of " + num + " using recursion is: " + factorialUsingRecursion(num));
    }



    private static void factorial(int num) {
        long fact = 1;
        for( int i = num; i > 0; i--){
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
    private static long factorialUsingRecursion(int num) {
        if (num == 0 || num == 1) return 1;

        return num * factorialUsingRecursion(num - 1);

    }


}

