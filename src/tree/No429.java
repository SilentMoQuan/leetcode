package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/5 11:15 </b><br />
 */
public class No429 {

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> answer = new ArrayList<>();

        if(null == root){
            return answer;
        }

        Deque<Node> queue = new ArrayDeque<>();
        queue.addFirst(root);

        while (!queue.isEmpty()){

            ArrayList<Integer> list = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                Node node = queue.pollFirst();

                for (Node child : node.children) {

                    if(child != null) queue.addLast(child);

                }

                list.add(node.val);

            }

            answer.add(list);
        }

        return answer;
    }

}
