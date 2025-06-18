package programmingIIlap;

import java.util.*; // Import the Java utility package for using the Stack class

public class MyParenthesisMatcher {
    // Method to check if parentheses in a string are balanced
    static boolean areParenthesisOk(String expr) {
        Stack<Character> stack = new Stack<Character>(); // Create a stack to hold opening parentheses

        // Traverse each character in the expression
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i); // Get the character at the current index
            if (c == '(') { // If the character is an opening parenthesis
                stack.push(c); // Push it onto the stack
            } else if (c == ')') { // If the character is a closing parenthesis
                if (stack.isEmpty()) { // Check if the stack is empty
                    return false; // If empty, it means there's no matching opening parenthesis
                } else {
                    stack.pop(); // Pop the top of the stack (matching opening parenthesis)
                }
            }
        }
        return (stack.isEmpty()); // Return true if the stack is empty (all parentheses matched)
    }

    public static void main(String[] args) {
        String expr = "(ab(cd))"; // Example input expression (can be modified by user)

        // Check if the parentheses are balanced and print the result
        if (areParenthesisOk(expr))
            System.out.println("Balanced"); // Output if parentheses are balanced
        else
            System.out.println("Not Balanced"); // Output if parentheses are not balanced
    }
}

