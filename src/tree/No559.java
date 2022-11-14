package tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <p>
 * 2022/11/14 19:59
 *
 * @author MoQuan
 */
public class No559 {

    int deep = 0;
    int max = 0;

    public int maxDepth(Node root) {
        recursion(root);
        return max;
    }

    public void recursion(Node node){

        if (null == node){
            return;
        }
        deep++;
        max = Math.max(max, deep);
        for (Node child : node.children) {
            recursion(child);
        }
        deep--;
    }

    public int maxDepthOld(Node root) {

        if (null == root){
            return 0;
        }

        int deep = 0;
        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            deep++;
            for (int i = 0; i < size; i++) {
                Node node = queue.pollFirst();

                for (Node child : node.children) {

                    if (child != null) {
                        queue.addLast(child);
                    }

                }

            }

        }

        return deep;
    }

}
