package tree;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/16 15:17 </b><br />
 */
public class No404 {

    public int sumOfLeftLeaves(TreeNode root) {

        return recursion(root);
    }

    public int recursion(TreeNode node) {

        if(node == null){
            return 0;
        }
        int left = 0;
        if (node.left != null
                && node.left.left == null
                && node.left.right == null) {
            left = node.left.val;
        }

        return left + recursion(node.left) + recursion(node.right);
    }

    public int recursion01(TreeNode node) {

        if(node == null){
            return 0;
        }

        if (node.left != null
                && node.left.left == null
                && node.left.right == null) {

            return node.left.val + recursion(node.right);
        }

        int left = recursion(node.left);
        int right = recursion(node.right);

        return left + right;
    }

}
