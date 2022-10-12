package java.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * describe
 * <p>
 * 2022/7/31 18:55
 *
 * @author MoQuan
 */
public class no1161 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
//        TreeNode node2 = null;
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(98693);
        TreeNode node5 = new TreeNode(-89388);
//        TreeNode node6 = new TreeNode();
//        TreeNode node7 = new TreeNode();
//        TreeNode node8 = new TreeNode();
        TreeNode node6 = null;
        TreeNode node7 = null;
        TreeNode node8 = null;
        TreeNode node9 = new TreeNode(-32127);

        root.left = node2;
        root.right = node3;

//        node2.left = node4;
//        node2.right = node5;

//        node3.left = node4;
//        node3.right = node5;
//
//        node5.right = node9;

        System.out.println(maxLevelSum(root));
    }

//    直接用数组存每层的值

    public static int maxLevelSum(TreeNode root) {


        int ans = 1;
        int max = root.val;

        List<TreeNode> parent = null;
        List<TreeNode> children = new ArrayList<>();
        children.add(root);

        int storey = 2;
        int storeySum = 0;

        while (children.size() != 0) {
            parent = children;
            children = new ArrayList<>();

            storeySum = 0;
            for (TreeNode treeNode : parent) {

                if (null != treeNode.left) {
                    children.add(treeNode.left);
                    storeySum += treeNode.left.val;
                }

                if (null != treeNode.right) {
                    children.add(treeNode.right);
                    storeySum += treeNode.right.val;
                }

            }

            if (children.size() == 0) {
                break;
            }

            if (storeySum > max) {
                ans = storey;
                max = storeySum;
            }

            storey++;
        }


        return ans;
    }

}

