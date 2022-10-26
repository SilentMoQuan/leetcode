package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/26 15:01 </b><br />
 */
public class No232 {

    Deque<Integer> input = new ArrayDeque<Integer>();
    Deque<Integer> output = new ArrayDeque<Integer>();

    public No232() {

    }

    public void push(int x) {
        input.addLast(x);
    }

    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.addLast(input.pop());
            }
        }

        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.addLast(input.pop());
            }
        }

        return output.peek() == null ? 0 : output.peek();
    }

    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }

}
