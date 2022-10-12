package java.array;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/6/20 9:13
 *
 * @author MoQuan
 */
public class no34 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4};
        int target = 4;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int mid = 0;
        int num = 0;

        if (left == right && nums[left] == target) {
            return new int[]{0, 0};
        }

        while (left <= right) {

            mid = (left + right) / 2;
            num = nums[mid];

            if (num == target) {

                left = right = mid;

                boolean lboolean = true;
                boolean rboolean = true;

                for (;lboolean || rboolean ; ) {
                    if (lboolean && left - 1 > -1 && nums[left - 1] == target) {
                        left--;
                    } else {
                        lboolean = false;
                    }
                    if (rboolean && right + 1 < nums.length && nums[right + 1] == target) {
                        right++;
                    } else {
                        rboolean = false;
                    }
                }


                return new int[]{left, right};

            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return new int[]{-1, -1};
    }

}
