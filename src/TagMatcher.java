public class TagMatcher {
    public static boolean isTagMatching(String markup) {
        GenericStack<String> stack = new GenericStack<>();
        String[] tokens = markup.split("\\s+");
        for (String token : tokens) {
            if (token.startsWith("<") && token.endsWith(">")) {
                if (!token.startsWith("</")) {
                    stack.push(token);
                } else {
                    if (stack.isEmpty() || !token.substring(2).equals(stack.pop())) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String markup = "<html> <body> <p> Some content </p> </body> </html>";
        if (isTagMatching(markup)) {
            System.out.println("Tags are properly matched.");
        } else {
            System.out.println("Tags are not properly matched.");
        }
    }
}
