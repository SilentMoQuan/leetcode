package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/2 10:45 </b><br />
 */
public class No144 {
    public static void main(String[] args) {

    }


    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();
        queue.addFirst(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            answer.add(node.val);
            if (node.right != null) {
                queue.addFirst(node.right);
            }
            if (node.left != null) {
                queue.addFirst(node.left);
            }
        }

        return answer;
    }

    public void front(TreeNode root) {

        if (root == null) {
            return;
        }

        answer.add(root.val);
        front(root.left);
        front(root.right);

    }

    List<Integer> answer = new ArrayList<>();

    public List<Integer> preorderTraversalOld(TreeNode root) {

        frontOld(root);

        return answer;
    }

    public void frontOld(TreeNode root) {

        if (root == null) {
            return;
        }

        answer.add(root.val);
        frontOld(root.left);
        frontOld(root.right);

    }

}
