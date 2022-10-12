package java.array;

import java.util.Arrays;

public class no34main {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{1, 3}, 1)));
    }

    static public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0)
            return new int[]{-1, -1};

        int[] ans = new int[]{-1, -1};

        int left = 0, right = nums.length;
        int index = -1;
        int mid = -1;
        while (left < right) {

            mid = (right + left) / 2;

            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        if (left < nums.length && nums[left] == target)
            index = left;

        if (index != -1) {
            left = index;
            right = index;

            boolean lFlag = true;
            boolean rFlag = true;
            while (lFlag || rFlag) {
                lFlag = false;
                rFlag = false;
                if (left - 1 >= 0 && nums[left - 1] == target) {
                    left -= 1;
                    lFlag = true;
                }
                if (right + 1 < nums.length && nums[right + 1] == target) {
                    right += 1;
                    rFlag = true;
                }
            }

            ans[0] = left;
            ans[1] = right;
        }

        return ans;
    }
}
