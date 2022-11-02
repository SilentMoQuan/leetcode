package tree;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/31 8:23 </b><br />
 */
public class No114 {

    TreeNode head = new TreeNode();

    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {

        if(root == null){
            return;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        head.right = root;
        head = head.right;

        flatten(left);
        flatten(right);

    }

}
