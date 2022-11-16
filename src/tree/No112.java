package tree;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/16 15:47 </b><br />
 */
public class No112 {
    boolean answer = false;
    int sum = 0;
    int target = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        recursion(root);

        return answer;
    }

    public void recursion(TreeNode node){

        if (null == node){
            return;
        }

        sum += node.val;

        if(null == node.left
                && null == node.right
                && sum == target){
            answer = true;
        }

        recursion(node.left);
        recursion(node.right);

        sum -= node.val;
    }

}
