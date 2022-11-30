package tree;

/**
 * describe
 * <p>
 * 2022/11/30 22:00
 *
 * @author MoQuan
 */
public class No538 {

    public static void main(String[] args) {

        new No538().convertBST(new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));

    }

    public TreeNode convertBST(TreeNode root) {


        System.out.println(recursive(root, 0));

        return root;
    }

    private int recursive(TreeNode node, int per) {

        if(node == null){
            return per;
        }

        node.val += recursive(node.right, per);

        return recursive(node.left, node.val);
    }

}
