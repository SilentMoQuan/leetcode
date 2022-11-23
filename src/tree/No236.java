package tree;

/**
 * describe
 * <p>
 * 2022/11/23 21:50
 *
 * @author MoQuan
 */
public class No236 {

    public static void main(String[] args) {

        No236 no236 = new No236();

        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3, node5, node1);

        System.out.println(no236.lowestCommonAncestor(node3, node5, node3));
    }

    TreeNode result = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        recursion(root, p, q);

        return result;
    }

    private boolean recursion(TreeNode node, TreeNode p, TreeNode q) {

        if(null == node){
            return false;
        }

        int count = 0;

        if ((node.val == p.val || node.val == q.val)) {
            count++;
        }

        if (recursion(node.left, p, q)) {
            count++;
        }
        if (recursion(node.right, p, q)) {
            count++;
        }

        if(count >= 2 && null == result){
            result = node;
        }

        return count >= 1;
    }

}
