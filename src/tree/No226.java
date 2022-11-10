package tree;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/10 14:56 </b><br />
 */
public class No226 {

    public TreeNode invertTree(TreeNode root) {
        if (null == root){
            return null;
        }

        diGui(root);

        return root;
    }

    public void diGui(TreeNode root){
        if (null == root){
            return;
        }

        diGui(root.left);
        diGui(root.right);

        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;

    }

}
