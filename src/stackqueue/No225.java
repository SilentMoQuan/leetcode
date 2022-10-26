package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/26 15:18 </b><br />
 */
public class No225 {

    public No225() {

    }

    private Deque<Integer> queue = new ArrayDeque<Integer>();

    public void push(int x) {
        queue.addLast(x);
    }

    public int pop() {
        return queue.isEmpty() ? 0 : queue.pollLast();
    }

    public int top() {
        return queue.isEmpty() ? 0 : queue.peekLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
