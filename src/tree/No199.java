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
 * @date :<b> 2022/11/4 15:00 </b><br />
 */
public class No199 {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> answer = new ArrayList<>();

        if (null == root){
            return answer;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.pollFirst();

                if(i == size - 1){
                    answer.add(node.val);
                }

                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);

            }

        }

        return answer;
    }

}
