import java.util.Stack;
//infix to postfix conversion
public class InfixToPrefix {

    // Function to return precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3; 
        }
        return -1;
    }

    // Function to check if character is operator
    private static boolean isOperator(char c) {
        return (!Character.isLetterOrDigit(c));
    }

    // Function to convert infix to prefix
    public static String infixToPrefix(String expression) {
        // Step 1: Reverse the infix expression
        StringBuilder input = new StringBuilder(expression);
        input.reverse();

        // Step 2: Replace '(' with ')' and vice versa
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                input.setCharAt(i, ')');
            } else if (input.charAt(i) == ')') {
                input.setCharAt(i, '(');
            }
        }

        // Step 3: Convert to postfix
        String postfix = infixToPostfix(input.toString());

        // Step 4: Reverse postfix → prefix
        StringBuilder prefix = new StringBuilder(postfix);
        return prefix.reverse().toString();
    }

    // Helper: Infix to Postfix (used inside infixToPrefix)
    private static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If operand → add to result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If '(' → push to stack
            else if (c == '(') {
                stack.push(c);
            }
            // If ')' → pop till '('
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            // Operator encountered
            else {
                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix:   " + exp);
        System.out.println("Prefix:  " + infixToPrefix(exp));
    }
}

