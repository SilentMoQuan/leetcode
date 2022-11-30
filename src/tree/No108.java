package tree;

/**
 * describe
 * <p>
 * 2022/11/30 21:11
 *
 * @author MoQuan
 */
public class No108 {

    public static void main(String[] args) {
        new No108().sortedArrayToBST(new int[] {0,1,2,3,4,5});
    }

    public TreeNode sortedArrayToBST(int[] nums) {


        return recursive(nums, 0, nums.length - 1);
    }

    private TreeNode recursive(int[] nums, int l, int r) {

        if(l > r){
            return null;
        }

        int mid = l + ((r - l) / 2);

        TreeNode node = new TreeNode(nums[mid]);

        node.left = recursive(nums, l, mid - 1);
        node.right = recursive(nums, mid + 1, r);

        return node;
    }

    private TreeNode recursive(int[] nums, int index) {

        int mid = 0;

        if (index < 0 || index >= nums.length){
            return null;
        }

        TreeNode node = new TreeNode(nums[index]);

        if(index <= mid) {
            node.left = recursive(nums, index - 1);
        }
        if (index >= mid) {
            node.right = recursive(nums, index + 1);
        }

        return node;
    }


}
