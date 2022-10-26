package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/26 17:47 </b><br />
 */
public class No150 {

    public static void main(String[] args) {
        evalRPN(new String[]{"4", "13", "5", "/", "+"});
    }

    public static int evalRPN(String[] tokens) {

        Deque<Integer> queue = new ArrayDeque<>();

        for (String token : tokens) {

            if ("+".equals(token) || "-".equals(token) ||
                    "*".equals(token) || "/".equals(token)) {

                int b = queue.pollLast();
                int a = queue.pollLast();

                queue.addLast(calculate(a, b, token.charAt(0)));

            } else {
                queue.addLast(Integer.parseInt(token));
            }

        }

        return queue.pop();
    }

    public static int calculate(int a, int b, char token) {
        switch (token) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }
}
//    public static int calculate(int a, int b, char token){
//        return switch (token) {
//            case '+' -> a + b;
//            case '-' -> a - b;
//            case '*' -> a * b;
//            case '/' -> a / b;
//            default -> 0;
//        };
//    }


