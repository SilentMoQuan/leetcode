package tree;

import java.util.*;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/2 10:45 </b><br />
 */
public class No145 {

    public static void main(String[] args) {
        No145 no145 = new No145();

        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        System.out.println(no145.postorderTraversal(root1));

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.addFirst(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.pollFirst();

            if(node.left != null){
                queue.addFirst(node.left);
            }
            if(node.right != null){
                queue.addFirst(node.right);
            }

            answer.add(node.val);
        }

        Collections.reverse(answer);

        return answer;
    }

    List<Integer> answer = new ArrayList<>();

    public List<Integer> postorderTraversalOld(TreeNode root) {


        front(root);

        return answer;
    }

    public void front(TreeNode root){

        if(root == null){
            return;
        }

        front(root.left);
        front(root.right);
        answer.add(root.val);

    }

}
