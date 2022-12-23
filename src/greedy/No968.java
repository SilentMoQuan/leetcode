package greedy;

import tree.TreeNode;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 11:37 </b><br />
 */
public class No968 {

    int result = 0;

    public int minCameraCover(TreeNode root) {

        if (null == root){
            return result;
        }

        if(recursive(root) == 0){
            result ++;
        }

        return result;
    }


    /**
     * 0: 无覆盖
     * 1: 有摄像头
     * 2: 有覆盖
     */
    private int recursive(TreeNode root) {

        if(null == root){
            return 2;
        }

        int left = recursive(root.left);
        int right = recursive(root.right);

        if(left == 0 || right == 0){
            result++;
            return 1;
        }

        if(left == 2 && right == 2){
            return 0;
        }

        if(left == 1 || right == 1){
            return 2;
        }

        return -1;
    }

}
