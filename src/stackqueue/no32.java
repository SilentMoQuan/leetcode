package stackqueue;

import java.util.Stack;

public class no32 {

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("(((()(((()()(((()))"));

    }

    static public int longestValidParentheses(String s) {

        if (s.equals("") || s.length() < 2)
            return 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int answer = 0;

        int i;
        for (i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if (!stack.empty()) {
                    answer = Math.max(answer, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }


        }


        return answer;
    }
}
