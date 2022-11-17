package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/17 17:15 </b><br />
 */
public class No106 {

    public static void main(String[] args) {

        No106 no106 = new No106();
        no106.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return grow(inorder, 0, inorder.length - 1,  postorder, 0, postorder.length - 1);
    }

    public TreeNode grow(int[] inorder, int inBegin, int inEnd,  int[] postOrder, int postBegin, int postEnd){
        
        if (postEnd < postBegin || inBegin > inEnd){
            return null;
        }

        Integer rootVal = postOrder[postEnd];
        TreeNode node = new TreeNode(rootVal);

        int leftLen = 0;
        for (int i = inBegin; i <= inEnd; i++) {

            if (inorder[i] == rootVal){
                leftLen = i - inBegin;
                break;
            }

        }

        node.left = grow(inorder, inBegin, inBegin + leftLen - 1, postOrder, postBegin, postBegin + leftLen - 1);
        node.right = grow(inorder, inBegin + leftLen + 1, inEnd, postOrder, postBegin + leftLen, postEnd - 1);
        
        return node;
    }

}
