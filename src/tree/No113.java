package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/17 9:42 </b><br />
 */
public class No113 {

    int target = 0;
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        target = targetSum;
        recursion(root, 0);
        return answer;
    }

    public int recursion(TreeNode node, int count) {

        if(null == node){
            return count;
        }

        list.add(node.val);
        count += node.val;
        if (null == node.left
                && null == node.right
                && count == target) {

            answer.add(new ArrayList<>(list));

        }else{
            recursion(node.left, count);
            recursion(node.right, count);
        }

        list.remove(list.size() - 1);
        return count - node.val;
    }


}
