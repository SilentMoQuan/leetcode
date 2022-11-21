package tree;

/**
 * describe
 * <p>
 * 2022/11/21 20:50
 *
 * @author MoQuan
 */
public class No530 {


    public static void main(String[] args) {
//        600,424,612,null,499,null,689
        TreeNode node = new TreeNode(600, new TreeNode(424, null, new TreeNode(499)), new TreeNode(612, null, new TreeNode(689)));

        No530 no530 = new No530();

        System.out.println(no530.getMinimumDifference(
                node
        ));

    }

    int value = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {

        recursion(root);

        return value;
    }

    TreeNode per = null;
    private void recursion(TreeNode node) {

        if(null == node) return;

        recursion(node.left);

        if(null != per){
            value = Math.min(value, node.val - per.val);
        }

        per = node;
        recursion(node.right);
    }

}
