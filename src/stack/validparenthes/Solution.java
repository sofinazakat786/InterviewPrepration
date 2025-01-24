package stack.validparenthes;

import java.util.Stack;

class Solution {

    public static void main(String[] args) {
        String s = "()[]{";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        // A stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } // For closing brackets, check if they match the top of the stack
            else {
                // If the stack is empty or doesn't match, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, all brackets were matched
        return stack.isEmpty();
    }

    // Helper function to check if two brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
