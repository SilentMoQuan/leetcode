package java.array;

/**
 * describe
 * <p>
 * 2022/6/20 10:37
 *
 * @author MoQuan
 */
public class no35 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert20220729(nums, target));

    }

    public static int searchInsert20220729(int[] nums, int target) {

        int l = 0, r = nums.length - 1;
        int mid = 0;

        if(nums.length == 1){
            r = -1;
        }

        while (l <= r) {

            mid = (l + r) / 2;

            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }

        }

        return nums[mid] >= target ? mid : mid + 1;
    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        int num = 0;

        while (left <= right) {

            mid = (left + right) / 2;
            num = nums[mid];

            if (num == target) {
                return mid;
            } else if (num > target) {

                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }

        mid = (left + right) / 2;

        if (nums[mid] > target) {
            return mid;
        } else {
            return mid + 1;
        }
    }
}
