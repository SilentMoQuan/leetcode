package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/26 17:23 </b><br />
 */
public class No20 {

    public static void main(String[] args) {

        isValid("(]");

    }


    public static boolean isValid(String s) {

        Deque<Character> queue = new ArrayDeque<>(s.length());

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                queue.addLast(c);
            }else{

                if(queue.isEmpty()){
                    return false;
                }
                boolean flag = false;
                switch (c){
                    case ')':
                        if (flag = queue.peekLast() == '(') {
                            queue.pollLast();
                        }
                        break;
                    case ']':
                        if (flag = queue.peekLast() == '[') {
                            queue.pollLast();
                        }
                        break;
                    case '}':
                        if (flag = queue.peekLast() == '{') {
                            queue.pollLast();
                        }
                        break;
                    default:
                        return false;
                }

                if(!flag){
                    return false;
                }

            }

        }

        return queue.isEmpty();
    }

}
