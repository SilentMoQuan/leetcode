package java.array;

/**
 * describe
 * <p>
 * 2022/6/21 11:40
 *
 * @author MoQuan
 */
public class no26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(
                new int[]{1, 1, 2}
        ));
    }

    public static int removeDuplicatesOld(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        } else if (nums.length == 2 && nums[0] == nums[1]) {
            return 1;
        }

        int index = 1;

        for (int front = 1; front < nums.length; front++) {

            if (nums[front - 1] != nums[front]) {
                nums[index] = nums[front];
                index++;
            }

        }

        return index;
    }

    public static int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;

        for (int front = 1; front < nums.length; front++) {

            if (nums[index] != nums[front]) {
                nums[index + 1] = nums[front];
                index++;
            }

        }

        return index + 1;
    }

}
