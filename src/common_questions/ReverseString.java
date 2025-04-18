package common_questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";
        reverseUsingStringBuffer(str);
        reverseStringLoop(str);
    }

    private static void reverseUsingStringBuffer(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

    }

    private static void reverseStringLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }


}

