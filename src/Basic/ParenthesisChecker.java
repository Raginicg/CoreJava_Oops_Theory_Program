package Basic;
public class ParenthesisChecker {

    public static boolean isBalanced(String expression) {
        int count = 0;

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        String expression = "(()))";

        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced.");
        }
    }
}
