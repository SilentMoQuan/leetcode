package java.array;

import java.time.chrono.MinguoChronology;

public class no33main {

    public static void main(String[] args) {
        //System.out.println(search(new int[]{4, 5, 6, 0, 1, 2, 3}, 6));
        System.out.println(search(new int[]{4,5,6,7,0,1,2 }, 3));
    }

    static public int search(int[] nums, int target) {

        if (nums.length == 0)
            return -1;

        int l = 0;
        int r = nums.length - 1;
        int maxIndex = 0;


        while (nums[l] > nums[r] && l < r) {
            int mid = (r + l) / 2;
            if (nums[mid] > nums[l]) {
                l = mid;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            }

            if (nums[l + 1] < nums[l]) {
                maxIndex = l;
                break;
            } else if (nums[r - 1] > nums[r]) {
                maxIndex = r - 1;
                break;
            }
        }

        if (target >= nums[0] && target <= nums[maxIndex]) {
            l = 0;
            r = maxIndex + 1;
        } else {
            l = maxIndex + 1;
            r = nums.length;
        }

        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            }
        }

        if (l < nums.length && nums[l] == target)
            return l;
        else
            return -1;
    }

}
