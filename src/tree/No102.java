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
 * @date :<b> 2022/11/3 15:26 </b><br />
 */
public class No102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> answer = new ArrayList<>();
        if (root == null){
            return answer;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.addLast(root);
        List<Integer> row = new ArrayList<>();
        TreeNode node;

        while (!queue.isEmpty()){
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                node = queue.pollFirst();
                row.add(node.val);
                if(null != node.left) queue.addLast(node.left);
                if(null != node.right) queue.addLast(node.right);
            }
            answer.add(row);
            row = new ArrayList<>();
        }

        return answer;
    }

}
