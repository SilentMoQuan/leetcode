package tree;

/**
 * describe
 * <p>
 * 2022/11/28 19:02
 *
 * @author MoQuan
 */
public class No450 {

    TreeNode per = null;

    public TreeNode deleteNode(TreeNode root, int key) {
        return recursive(root, key);
    }

    private TreeNode recursive(TreeNode node, int key) {

        if(null == node){
            return null;
        }

        if(node.val == key){

            if (null == node.left && null == node.right) {
                return null;
            } else if (null == node.left && null != node.right) {
                return node.right;
            } else if (null != node.left && null == node.right) {
                return node.left;
            } else {

                TreeNode left = node.left;
                TreeNode newRoot = node.right;

                node = node.right;

                while (null != node.left){
                    node = node.left;
                }

                node.left = left;

                return newRoot;
            }

        } else {

            if(node.val < key){
                node.right = recursive(node.right, key);
            }else {
                node.left = recursive(node.left, key);
            }

        }

        return node;
    }

    public TreeNode deleteNode01(TreeNode root, int key) {

        if (null == root) {
            return null;
        }

        TreeNode newRoot = root;
        TreeNode per = root;

        while (root.val != key) {

            per = root;

            if (root.val > key)
                root = root.left;
            else
                root = root.right;

            if (null == root) {
                return newRoot;
            }

        }

        if (null == root.left && null == root.right) {
            if (per.left.val == key) {
                per.left = null;
            } else {
                per.right = null;
            }
        } else if (null == root.left && null != root.right) {
            if (per.left.val == key) {
                per.left = root.right;
            } else {
                per.right = root.right;
            }
        } else if (null != root.left && null == root.right) {
            if (per.left.val == key) {
                per.left = root.left;
            } else {
                per.right = root.left;
            }
        } else {

            if (per.left.val == key) {
                per.left = root.right;
            } else {
                per.right = root.right;
            }

            TreeNode left = root.left;
            root = root.right;

            while (null != root.left){
                root = root.left;
            }

            root.left = left;
        }

        return newRoot;
    }

    /**
     * 1. 无子节点
     *      直接删除
     * 2. 有左节点, 无右节点
     *      返回左节点
     * 3. 有右节点, 无左节点
     *      返回右节点
     * 4. 有左右节点
     *      返回右节点, 寻找左子树位置
     * 5. 没有该节点
     *      直接返回
     */

}
