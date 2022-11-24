package tree;

/**
 * describe
 * <p>
 * 2022/11/24 21:49
 *
 * @author MoQuan
 */
public class No701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (null == root) {
            return new TreeNode(val);
        }

        TreeNode per = null;
        TreeNode newRoot = root;
        while (null != root) {

            per = root;

            if (root.val > val) {
                root = root.left;
            } else {
                root = root.right;
            }

        }

        if (per.val > val) {
            per.left = new TreeNode(val);
        } else {
            per.right = new TreeNode(val);
        }

        return newRoot;
    }

    public TreeNode insertIntoBST01(TreeNode root, int val) {

        if (null == root) {
            root = new TreeNode(val);
        } else {
            recursive(root, val);
        }

        return root;
    }

    TreeNode per = null;

    public TreeNode recursive(TreeNode node, int val) {

        if (null == node) {
            return new TreeNode(val);
        }

        if (node.val > val) {
            node.left = recursive(node.left, val);
        } else {
            node.right = recursive(node.right, val);
        }

        return node;
    }

}
