package tree;

/**
 * describe
 * <p>
 * 2022/11/17 23:52
 *
 * @author MoQuan
 */
public class No105 {

    public static void main(String[] args) {
        No105 no105 = new No105();
        no105.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return grow(preorder, 0, preorder.length - 1,  inorder, 0, inorder.length - 1);
    }

    public TreeNode grow(int[] preorder, int preBegin, int preEnd,  int[] inorder, int inBegin, int inEnd){

        if(preBegin > preEnd || inBegin > inEnd){
            return null;
        }

        int rootVal = preorder[preBegin];
        TreeNode node = new TreeNode(rootVal);
        int leftLen = 0;

        for (int i = inBegin; i < inEnd; i++) {
            if(inorder[i] == rootVal){
                leftLen = i - inBegin;
                break;
            }
        }


        node.left = grow(preorder, preBegin + 1, preBegin + 1 + leftLen - 1,
                inorder, inBegin, inBegin + leftLen - 1);
        node.right = grow(preorder, preBegin + leftLen + 1, preEnd,
                inorder, inBegin + leftLen + 1, inEnd);

        return node;
    }

}
