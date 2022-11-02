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
public class No145 {
    List<Integer> answer = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {


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
