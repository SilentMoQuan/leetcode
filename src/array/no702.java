package java.array;

/**
 * describe
 * <p>
 * 2022/6/20 9:01
 *
 * @author MoQuan
 */
public class no702 {

    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(search(nums, target));

    }

    public static int searchOld(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        for (; ; ) {

            if (nums[left] == target) {
                return left;
            } else if (nums[right] == target) {
                return right;
            } else if (left >= right) {
                break;
            }
            left++;
            right--;
        }

        return -1;
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int num = 0;

        for (;left < right; ) {

            mid = (left + right) / 2;
            num = nums[mid];

            if (num == target) {
                return mid;
            }

            if(num > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        return -1;
    }

}
