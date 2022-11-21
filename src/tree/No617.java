package tree;

/**
 * describe
 * <p>
 * 2022/11/19 15:44
 *
 * @author MoQuan
 */
public class No617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if(null == root1) return root2;
        if(null == root2) return root1;

        root1.val += root2.val;

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }



}
