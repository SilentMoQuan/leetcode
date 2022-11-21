package tree;

/**
 * describe
 * <p>
 * 2022/11/19 15:19
 *
 * @author MoQuan
 */
public class No654 {

    public static void main(String[] args) {
        No654 no654 = new No654();
        no654.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        // [3,2,1,6,0,5]
        return grow(nums, 0, nums.length - 1);
    }

    private TreeNode grow(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int max = nums[left];
        int index = left;

        for (int i = left; i <= right; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(max);
        node.left = grow(nums, left, index - 1);
        node.right = grow(nums, index + 1, right);

        return node;
    }


}
