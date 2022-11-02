package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/2 10:45 </b><br />
 */
public class No94 {
    List<Integer> answer = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {


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
