package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/26 17:39 </b><br />
 */
public class No1047 {

    public String removeDuplicates(String s) {

        Deque<Character> queue = new ArrayDeque<>(s.length());

        for (char c : s.toCharArray()) {

            if (!queue.isEmpty() && queue.peekLast() == c) {
                queue.pollLast();
            } else {
                queue.addLast(c);
            }

        }

        StringBuilder builder = new StringBuilder();

        while (!queue.isEmpty()){
            builder.append(queue.pop());
        }

        return builder.toString();
    }

}
