package java.tree;

import java.util.ArrayList;

/**
 * describe
 * <p>
 * 2022/8/5 10:22
 *
 * @author MoQuan
 */
public class no623 {

    static ArrayList<TreeNode> treeNodes = new ArrayList<>();

    static int a ;

    public static void main(String[] args) {
        System.out.println(a);
    }

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        findNode(root, depth - 1);

        for (TreeNode node : treeNodes) {

            node.left = new TreeNode(val, node.left, null);
            node.right = new TreeNode(val, null, node.right);

        }

        return root;
    }

    public static void findNode(TreeNode node, int depth){

        if(node == null){
            return;
        }

        if(depth == 1){
            treeNodes.add(node);
            return;
        }

        findNode(node.left, depth - 1);
        findNode(node.right, depth - 1);

    }
}
