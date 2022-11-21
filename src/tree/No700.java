package tree;

/**
 * describe
 * <p>
 * 2022/11/19 15:52
 *
 * @author MoQuan
 */
public class No700 {

    public TreeNode searchBST(TreeNode root, int val) {
        while (null != root && root.val != val){

            if(root.val > val)
                root = root.left;
            else
                root = root.right;

        }
        return root;
    }

}
