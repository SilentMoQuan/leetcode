package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/10 15:02 </b><br />
 */
public class No101 {

    public boolean isSymmetric(TreeNode root) {

        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode NullNode = new TreeNode(101);
        queue.addLast(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            if (size != 1 && size % 2 != 0) {
                return false;
            }

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.pollFirst();

                if(null != node.left){
                    queue.addLast(node.left);
                    list.add(node.left.val);
                }else{
                    list.add(111);
                }
                if(null != node.right){
                    queue.addLast(node.right);
                    list.add(node.right.val);
                }else{
                    list.add(111);
                }

            }

            int l = 0, r = list.size() - 1;
            while (l < r){
                if(!list.get(l).equals(list.get(r))){
                    return false;
                }
                l++;
                r--;
            }

        }

        return true;
    }

}
