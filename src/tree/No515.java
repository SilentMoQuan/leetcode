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
 * @date :<b> 2022/11/5 13:15 </b><br />
 */
public class No515 {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> answer = new ArrayList<>();

        if(root == null){
            return answer;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.addLast(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.pollFirst();

                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);

                max = Math.max(node.val, max);

            }

            answer.add(max);
        }

        return answer;
    }

}
