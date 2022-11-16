package week_30;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Stack;

public class LongestValidParantwithTests {

    public static void main(String[] args) {
        System.out.println("longestValidParentheses(\")()())\") = " + longestValidParentheses("()(()()()()))()))"));
    }

    public static int longestValidParentheses(String s) {
        if (s == null) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' &&                  // there is a pair of (
                    stack.size() > 1 &&
                    s.charAt(stack.peek()) == '('
            ) {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }

    @Test
    void test1() {
        Assertions.assertEquals(4, longestValidParentheses(")()())")); //4
        Assertions.assertEquals(6, longestValidParentheses("()()()))")); //6
        Assertions.assertEquals(4, longestValidParentheses("()()")); //4
        Assertions.assertEquals(0, longestValidParentheses(")(")); // 0
        Assertions.assertEquals(0, longestValidParentheses(""));
        Assertions.assertEquals(6, longestValidParentheses("(()())"));  //6
    }
}
