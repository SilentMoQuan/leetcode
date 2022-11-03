package tree;

import java.util.*;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/3 15:52 </b><br />
 */
public class No107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

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

        Collections.reverse(answer);

        return answer;

    }

}
