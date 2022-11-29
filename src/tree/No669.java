package tree;

/**
 * describe
 * <p>
 * 2022/11/29 21:10
 *
 * @author MoQuan
 */
public class No669 {

    public TreeNode trimBST(TreeNode root, int low, int high) {

        while (root.val < low) {
            root = root.right;
        }

        return recursive(root, low, high);
    }

    private TreeNode recursive(TreeNode node, int low, int high) {

        if (null == node) {
            return null;
        }

        if (node.val < low) {
            return recursive(node.right, low, high);
        }

        node.left = recursive(node.left, low, high);

        if (node.val > high) {
            return recursive(node.left, low, high);
        }

        node.right = recursive(node.right, low, high);

        return node;
    }


}
