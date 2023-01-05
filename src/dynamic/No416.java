package dynamic;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2023/1/5 22:14
 *
 * @author MoQuan
 */
public class No416 {

    public static void main(String[] args) {
        System.out.println(new No416().canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(new No416().canPartition(new int[]{1, 2, 3, 5}));
    }

    public boolean canPartition(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        int[] dp = new int[target + 1];

        for (int i = nums[0]; i < target + 1; i++) {
            dp[i] = nums[0];
        }

        for (int i = 1; i < nums.length; i++) {

            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }

        return dp[target] == target;
    }

    public boolean canPartitionXY(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        int[][] dp = new int[nums.length][target + 1];

        for (int i = nums[0]; i < target + 1; i++) {
            dp[0][i] = nums[0];
        }

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < target + 1; j++) {

                if (j < nums[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                }

            }
        }

        return dp[nums.length - 1][target] == target;
    }
}
