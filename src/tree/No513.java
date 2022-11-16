package tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/16 15:37 </b><br />
 */
public class No513 {

    public int findBottomLeftValue(TreeNode root) {

        int ans = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.addLast(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            ans = queue.peek().val;

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.pollFirst();

                if (null != node.left) queue.addLast(node.left);
                if (null != node.right) queue.addLast(node.right);

            }

        }

        return ans;
    }

}
