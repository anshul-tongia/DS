package ds.stack;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
        String expression = "3 4 + 2 * 1 +";
        System.out.println(reversePolishNotation(expression));
    }

    private static int reversePolishNotation(String expression) {
        String[] expr = expression.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String token : expr) {

            switch (token) {
                case "+":
                    stack.push(Integer.valueOf(stack.pop()) + Integer.valueOf(stack.pop()));
                    break;
                case "-":
                    stack.push(Integer.valueOf(stack.pop()) - Integer.valueOf(stack.pop()));
                    break;
                case "*":
                    stack.push(Integer.valueOf(stack.pop()) * Integer.valueOf(stack.pop()));
                    break;
                case "/":
                    stack.push(Integer.valueOf(stack.pop()) / Integer.valueOf(stack.pop()));
                    break;
                default:
                    stack.push(Integer.valueOf(token));
            }

        }
        return stack.pop();
    }
}
