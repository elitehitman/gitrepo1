public class DelimiterMatching {

    public static boolean areDelimitersMatched(String expression) {
        GenericStack<Character> stack = new GenericStack<>();

        for (char ch : expression.toCharArray()) {
            if (isOpeningDelimiter(ch)) {
                stack.push(ch);
            } else if (isClosingDelimiter(ch)) {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), ch)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // If the stack is empty, all delimiters are matched.
    }

    private static boolean isOpeningDelimiter(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    private static boolean isClosingDelimiter(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String expression1 = "{(a + b)}";
        String expression2 = "([c - d)]";

        System.out.println("Expression 1 has matching delimiters: " + areDelimitersMatched(expression1));
        System.out.println("Expression 2 has matching delimiters: " + areDelimitersMatched(expression2));
    }
}
