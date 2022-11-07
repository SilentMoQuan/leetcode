package tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/7 17:51 </b><br />
 */
public class No111 {

    public int minDepth(TreeNode root) {

        int deep = 0;
        if(root == null){
            return deep;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while (!queue.isEmpty()){

            int size = queue.size();

            deep++;
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.pollFirst();

                if(node.left == null &&  null == node.right){
                    return deep;
                }

                if (null != node.left) queue.addLast(node.left);
                if (null != node.right) queue.addLast(node.right);


            }


        }

        return deep;

    }

}
