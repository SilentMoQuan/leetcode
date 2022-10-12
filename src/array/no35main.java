package java.array;

public class no35main {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    static public int searchInsert(int[] nums, int target) {

        if (nums == null) {
            return 0;
        }
        int answer = -1;
        int left = 0, right = nums.length;
        int mid = -1;

        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                answer = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        if (left < nums.length && nums[left] == target)
            answer = left;

        if (answer == -1) {
            if (left >= nums.length)
                left = nums.length - 1;
            if (nums[left] > target)
                answer = left;
            else
                answer = left + 1;
        }

        return answer;
    }
}
