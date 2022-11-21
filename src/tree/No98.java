package tree;

/**
 * describe
 * <p>
 * 2022/11/19 15:57
 *
 * @author MoQuan
 */
public class No98 {

    public static void main(String[] args) {

        No98 no98 = new No98();

        no98.isValidBST(new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7))));

    }

    Long maxValue = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {

        if(null == root) return true;

        boolean leftIsValid = isValidBST(root.left);

        if (maxValue < root.val){
            maxValue = (long) root.val;
        }else{
            return false;
        }

        boolean rightIsValid = isValidBST(root.right);

        return leftIsValid && rightIsValid;
    }

}
