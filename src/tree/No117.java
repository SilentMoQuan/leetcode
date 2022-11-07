package tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/7 9:52 </b><br />
 */
public class No117 {

    public Node connect(Node root) {

        if(root == null){
            return null;
        }

        Deque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()){

            int size = queue.size();
            Node lastNode = null;

            for (int i = 0; i < size; i++) {

                Node node = queue.pollFirst();

                if (null != node.left) queue.addLast(node.left);
                if (null != node.right) queue.addLast(node.right);

                if (lastNode != null) {
                    lastNode.next = node;
                }

                lastNode = node;
            }

            lastNode.next = null;

        }

        return root;
    }

}
