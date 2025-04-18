package common_questions;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Convert sentence to character array and reverse
        String reversed = new StringBuilder(sentence).reverse().toString();

        System.out.println("Reversed sentence: " + reversed);
    }
}

