package tree;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/11/11 13:09 </b><br />
 */
public class No572 {

    public static void main(String[] args) {

    }

    boolean flag = false;
    TreeNode origin = null;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        origin = subRoot;
        find(root, subRoot);

        return flag;
    }



    public void find(TreeNode root, TreeNode sub){

        if(flag){
            return;
        }

        if(root != null && sub != null && root.val == sub.val){
            if(flag = compare(root, sub)){
                return;
            }
            sub = origin;
        }

        if (root == null){
            return;
        }

        find(root.left, sub);
        find(root.right, sub);

    }
    public boolean compare(TreeNode root, TreeNode subRoot){

        if(subRoot == null && root != null){
            return false;
        }else if(subRoot != null && root == null){
            return false;
        }else  if(subRoot == null && root == null){
            return true;
        }else if(subRoot.val != root.val){
            return false;
        }

        boolean compareL = compare(root.left, subRoot.left);
        boolean compareR = compare(root.right, subRoot.right);

        return compareL && compareR;
    }

}
