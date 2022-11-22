package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/11/22 21:05
 *
 * @author MoQuan
 */
public class No501 {

    int countMax;
    List<Integer> result = new ArrayList();

    public int[] findMode(TreeNode root) {

        recursive(root);

        int[] nums = new int[result.size()];

        int i = 0;
        for (Integer num : result) {
            nums[i] = num;
            i++;
        }

        return nums;
    }

    TreeNode per = null;
    int count = 1;
    private void recursive(TreeNode node) {

        if (null == node) {
            return;
        }

        recursive(node.left);

        if (null == per) {
            per = node;
        } else {

            if(per.val == node.val){
                count++;
            }else{
                count = 1;
            }

            per = node;
        }

        if(count > countMax){
            countMax = count;
            result = new ArrayList<>();
            result.add(node.val);
        }else if(count == countMax){
            result.add(node.val);
        }

        recursive(node.right);

    }

}
