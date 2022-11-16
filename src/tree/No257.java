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
 * @date :<b> 2022/11/16 14:51 </b><br />
 */
public class No257 {

    ArrayList<Integer> list = new ArrayList<>();
    List<String> answer = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {

        recursion(root);

        return answer;
    }

    public void recursion(TreeNode node){

        list.add(node.val);

        if(node.left == null && node.right == null){
            save();
        }

        if(null != node.left) recursion(node.left);
        if(null != node.right) recursion(node.right);

        list.remove(list.size() - 1);
    }

    public void save(){

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));

            if(i != list.size() - 1){
                builder.append("->");
            }

        }

        answer.add(builder.toString());

    }

}
