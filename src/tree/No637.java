package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/4 15:59 </b><br />
 */
public class No637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList<>();

        if (root == null){
            return answer;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.pollFirst();

                sum += node.val;

                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);

            }

            answer.add(sum / (double) size);

        }

        return answer;
    }

}
