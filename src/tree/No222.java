package tree;

import java.util.ArrayDeque;

/**
 * describe
 * <p>
 * 2022/11/15 19:58
 *
 * @author MoQuan
 */
public class No222 {

    public int countNodes(TreeNode root) {

        if(null == root){
            return 0;
        }

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }


}
