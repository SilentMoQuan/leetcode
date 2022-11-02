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
public class No94 {

    public static void main(String[] args) {
        No94 no145 = new No94();

        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        System.out.println(no145.inorderTraversal(root1));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();

        if(root == null){
            return answer;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !queue.isEmpty()){

            if(cur != null){
                queue.addFirst(cur);
                cur = cur.left;
            }else{
                cur = queue.pollFirst();
                answer.add(cur.val);
                cur = cur.right;
            }

        }

        return answer;
    }

    List<Integer> answer = new ArrayList<>();

    public List<Integer> inorderTraversalOld(TreeNode root) {


        front(root);

        return answer;
    }

    public void front(TreeNode root){

        if(root == null){
            return;
        }

        front(root.left);
        answer.add(root.val);
        front(root.right);

    }

}
