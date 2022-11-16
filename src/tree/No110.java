package tree;

import sun.security.action.GetLongAction;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/16 11:51 </b><br />
 */
public class No110 {

    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {

        deep(root);

        return isBalanced;
    }

    public int deep(TreeNode node){
        if (null == node){
            return 0;
        }

        int left = deep(node.left);
        int right = deep(node.right);

        if(left - right > 1 || left - right < -1){
            isBalanced = false;
        }

        return Math.max(left, right) + 1;
    }

}
